package com.example.feign_client_demo.dto;

import lombok.*;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserResponse {
    private String id;
    private String userName;
    private String email;
    private String phone;
    private Date dob;
    private String address;
}
