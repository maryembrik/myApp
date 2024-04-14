package com.HealthCare.healthCare.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegisterRequest {

    @NotEmpty(message = " firstname is mandatory")
    @NotBlank(message = " firstname is mandatory")
    private String Firstname;
    @NotEmpty(message = " lastname is mandatory")
    @NotBlank(message = " lastname is mandatory")
    private String lastname;
    @Email(message = "email is not formatted")
    @NotEmpty(message = " Email is mandatory")
    @NotBlank(message = " Email is mandatory")
    private String Email;
    @NotEmpty(message = " Password is mandatory")
    @NotBlank(message = " Password is mandatory")
    @Size(min = 8,message = "password should be at least 8 characters")
    private String Password;

}
