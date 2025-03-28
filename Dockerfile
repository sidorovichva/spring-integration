FROM amazoncorretto:17-alpine AS builder

# Install dependencies
RUN apk add --no-cache curl tar bash

# Set Maven version
ENV MAVEN_VERSION=3.9.8
ENV MAVEN_HOME=/opt/maven

# Download and install Maven
RUN curl -fsSL https://downloads.apache.org/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
    | tar -xz -C /opt && \
    ln -s /opt/apache-maven-${MAVEN_VERSION} ${MAVEN_HOME} && \
    ln -s ${MAVEN_HOME}/bin/mvn /usr/bin/mvn

# Set working directory and build the app
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run with Amazon Corretto
FROM amazoncorretto:17-alpine
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8021
ENTRYPOINT ["java", "-jar", "app.jar"]