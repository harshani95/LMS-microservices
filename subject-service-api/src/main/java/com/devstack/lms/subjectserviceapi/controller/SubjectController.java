package com.devstack.lms.subjectserviceapi.controller;

import com.devstack.lms.subjectserviceapi.dto.request.RequestSubjectDto;
import com.devstack.lms.subjectserviceapi.service.SubjectService;
import com.devstack.lms.subjectserviceapi.util.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/subjects")
@RequiredArgsConstructor


public class SubjectController {

    private final SubjectService subjectService;

    @PostMapping
    private ResponseEntity<StandardResponse> createSubject(@RequestBody RequestSubjectDto requestSubjectDto){
        subjectService.createSubject(requestSubjectDto);
        return new ResponseEntity<>(
                new StandardResponse(201,"Subject was saved.",requestSubjectDto.getName()),
                HttpStatus.CREATED
        );
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    private boolean isListAvailable(@PathVariable List<Long> id) {
        return subjectService.isListAvailable(id);
    }


}
