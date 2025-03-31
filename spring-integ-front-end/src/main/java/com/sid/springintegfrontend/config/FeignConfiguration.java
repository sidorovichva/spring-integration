package com.sid.springintegfrontend.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Capability;
import feign.Logger;
import feign.codec.Encoder;
import feign.codec.ErrorDecoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignFormatterRegistrar;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.standard.DateTimeFormatterRegistrar;

@Configuration
@EnableFeignClients(basePackages = {"com.sid.springintegfrontend.clients"})
public class FeignConfiguration {
//    @Autowired
//    private ObjectMapper objectMapper;

//    @Autowired
//    private ObjectFactory<HttpMessageConverters> messageConverters;

//    @Bean
//    Logger.Level feignLoggerLevel() {
//        return Logger.Level.FULL;
//    }

//    @Bean
//    public FeignFormatterRegistrar localDateFeignFormatterRegistrar() {
//        return new FeignFormatterRegistrar() {
//            @Override
//            public void registerFormatters(FormatterRegistry formatterRegistry) {
//                DateTimeFormatterRegistrar registrar = new DateTimeFormatterRegistrar();
//                registrar.setUseIsoFormat(true);
//                registrar.registerFormatters(formatterRegistry);
//            }
//        };
//    }

    /**
     * this is required in order for feign to send multipart (file upload) requests
     */
//    @Bean
//    public Encoder feignFormEncoder() {
//        return new SpringFormEncoder(new SpringEncoder(messageConverters));
//    }

//    @Bean
//    ErrorDecoder errorDecoder() {
//        return new SetooErrorDecoder(objectMapper);
//    }
//
//
//    @Bean
//    FeignClientInterceptor feignClientInterceptor() {
//        return new FeignClientInterceptor();
//    }
//
//    @Bean
//    public Capability capability(final MeterRegistry registry){
//        return new MicrometerCapability(registry);
//    }
}
