package com.HealthCare.healthCare.dtos;

import lombok.Builder;
import  lombok.AllArgsConstructor;
import  lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {
    private String token;
}
