package com.devstack.lms.subjectserviceapi.service.impl;

import com.devstack.lms.subjectserviceapi.dto.request.RequestSubjectDto;
import com.devstack.lms.subjectserviceapi.dto.response.ResponseSubjectDto;
import com.devstack.lms.subjectserviceapi.entity.Subject;
import com.devstack.lms.subjectserviceapi.repo.SubjectRepo;
import com.devstack.lms.subjectserviceapi.service.SubjectService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepo subjectRepo;

    @Override
    public void createSubject(RequestSubjectDto requestSubjectDto) {
        Subject subject = Subject.builder()
                .name(requestSubjectDto.getName())
                .status(requestSubjectDto.isStatus())
                .build();
        subjectRepo.save(subject);
    }

    public boolean isListAvailable(List<Long> ids) {
        for (Subject sub:subjectRepo.findByIdIn(ids)
        ) {
            if(!sub.isStatus()){
                return false;
            }
        }
        return true;
    }

    @Override
    public List<ResponseSubjectDto> findAll() {
        List<Subject> all = subjectRepo.findAll();
        List<ResponseSubjectDto> dtos = new ArrayList<>();
        for (Subject sub:all
        ) {
            dtos.add(new ResponseSubjectDto(sub.getId(), sub.getName(), sub.isStatus()));
        }
        return dtos;
    }


}
