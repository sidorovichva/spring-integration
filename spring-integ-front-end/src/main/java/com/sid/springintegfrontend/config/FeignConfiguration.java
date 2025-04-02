package com.sid.springintegfrontend.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = {"com.sid.springintegfrontend.client"})
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
