package com.devstack.lms.programserviceapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.security.auth.Subject;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestProgramDto {
    private String name;
    private BigDecimal price;
    private Date startDate;
    private List<Subject> subjects;
}
