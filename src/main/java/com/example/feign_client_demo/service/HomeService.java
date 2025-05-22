package com.example.feign_client_demo.service; // Assuming this is the correct package

import com.example.feign_client_demo.dto.UserResponse;
import com.example.feign_client_demo.utils.AppClient;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HomeService {

    @Autowired
    AppClient appClient;

    public UserResponse getUserInfoById(String id) {
        // Feign should handle the deserialization from JSON to UserResponse automatically
        UserResponse userResponse = appClient.info(id);
        return userResponse;
    }
    public String test(){
        return appClient.test();
    }
}