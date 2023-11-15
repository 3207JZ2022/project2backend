package org.example.config;

import org.example.biz.VideoBizHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;


@Configuration(proxyBeanMethods = false)
public class VideoFunctionConfig {

    @Bean
    public RouterFunction<ServerResponse> userRoute(VideoBizHandler videoBizHandler /*Dependency injection*/){
        return RouterFunctions.route()
                .GET("/user/{id}", RequestPredicates.accept(MediaType.ALL), videoBizHandler::getUser)
                .GET("/users", videoBizHandler::getUsers)
                .POST("/user", RequestPredicates.accept(MediaType.APPLICATION_JSON), videoBizHandler::createUser)
                .PUT("/user/{id}", RequestPredicates.accept(MediaType.APPLICATION_JSON), videoBizHandler::updateUser )
                .DELETE("/user/{id}", videoBizHandler::deleteUser)
                .build();
    }
}

