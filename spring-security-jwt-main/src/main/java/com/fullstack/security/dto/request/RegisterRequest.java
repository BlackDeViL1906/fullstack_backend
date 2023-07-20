package com.fullstack.security.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
	private Long id;
	private String name;
    private String username;
    private String email;
    private String password;
    private String gender;
	private String state;
	private String city;
    private Long phone;
    private String school;
	private String userRole;
}
