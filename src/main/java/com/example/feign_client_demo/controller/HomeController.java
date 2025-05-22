package com.example.feign_client_demo.controller;

import com.example.feign_client_demo.dto.ApiResponse;
import com.example.feign_client_demo.dto.UserResponse;
import com.example.feign_client_demo.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {
    @Autowired
    private HomeService homeService;

    @GetMapping("/info")
    public Object info(@RequestParam String id) {
        return homeService.getUserInfoById(id);
    }

    @GetMapping("/test")
    public String info() {
        return homeService.test();
    }
}
