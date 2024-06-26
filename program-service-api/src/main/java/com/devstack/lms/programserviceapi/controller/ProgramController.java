package com.devstack.lms.programserviceapi.controller;

import com.devstack.lms.programserviceapi.dto.request.RequestProgramDto;
import com.devstack.lms.programserviceapi.service.ProgramService;
import com.devstack.lms.programserviceapi.util.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/programs")
@RequiredArgsConstructor

public class ProgramController {

    private final ProgramService programService;

    @PostMapping
    private ResponseEntity<StandardResponse> createProgram(@RequestBody RequestProgramDto requestProgramDto){
        programService.createProgram(requestProgramDto);
        return new ResponseEntity<>(
                new StandardResponse(201,"Program was saved.",requestProgramDto.getName()),
                HttpStatus.CREATED
        );
    }

    @GetMapping
    private ResponseEntity<StandardResponse> findAllPrograms() {
        return new ResponseEntity<>(
                new StandardResponse(200, "Program List",
                        programService.findAllPrograms()),
                HttpStatus.OK
        );
    }

}
