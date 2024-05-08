package com.devstack.lms.subjectserviceapi.service;

import com.devstack.lms.subjectserviceapi.dto.request.RequestSubjectDto;
import com.devstack.lms.subjectserviceapi.dto.response.ResponseSubjectDto;

import java.util.List;

public interface SubjectService {

    public void createSubject(RequestSubjectDto requestSubjectDto);

    public boolean isListAvailable(List<Long> ids);

    List<ResponseSubjectDto> findAll();

}
