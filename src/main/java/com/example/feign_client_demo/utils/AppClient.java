package com.example.feign_client_demo.utils;

import com.example.feign_client_demo.config.AuthenticationRequestInterceptor; // Assuming config package
import com.example.feign_client_demo.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${app.service.user.name}", url = "${app.service.user.url}",
        configuration = AuthenticationRequestInterceptor.class) // Add other configs if needed
public interface AppClient {

    @GetMapping(value = "/info/user/{id}")
    UserResponse info(@PathVariable("id") String id);
    @GetMapping("/test")
    String test();
}