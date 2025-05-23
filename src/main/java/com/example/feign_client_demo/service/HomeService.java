package com.example.feign_client_demo.service; // Assuming this is the correct package

import com.example.feign_client_demo.dto.ApiResponse;
import com.example.feign_client_demo.dto.OB;
import com.example.feign_client_demo.dto.UserResponse;
import com.example.feign_client_demo.utils.AppClient;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HomeService {
    @Autowired
    private AppClient appClient;

    public ApiResponse<UserResponse> getUserInfoById(String id) {
        return appClient.info(id);
    }
    public OB test(){
        return appClient.test();
    }
}