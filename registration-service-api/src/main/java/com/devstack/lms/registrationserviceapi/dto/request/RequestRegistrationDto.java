package com.devstack.lms.registrationserviceapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestRegistrationDto {
    private Date registerDate;
    private Long studentId;
    private String programId;
    private String intake;
}
