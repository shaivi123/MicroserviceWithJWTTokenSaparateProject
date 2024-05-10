//package com.gateway.congif;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
//@Configuration
//@EnableWebFluxSecurity
//public class SecurityConfig {
//
////    @Bean
////    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity httpSecurity){
////        httpSecurity.authorizeExchange(authorizeExchangeSpec -> authorizeExchangeSpec.anyExchange().authenticated())
////                .oauth2Client(Customizer.withDefaults())
////                .oauth2ResourceServer(Customizer.withDefaults());
////        return httpSecurity.build();
////    }
//
//
//}
