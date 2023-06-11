package com.conect.gateway.conf;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConf {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("home", r -> r.path("/home")
                        .uri("http://localhost:8081"))
                .route("home2", r -> r.path("/home2")
                    .uri("http://localhost:8082"))
                .build();
    }
}
