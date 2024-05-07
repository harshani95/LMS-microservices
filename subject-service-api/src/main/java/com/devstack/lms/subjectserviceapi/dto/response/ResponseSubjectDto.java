package com.devstack.lms.subjectserviceapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseSubjectDto {
    private Long id;
    private String name;
    private boolean status;
}
