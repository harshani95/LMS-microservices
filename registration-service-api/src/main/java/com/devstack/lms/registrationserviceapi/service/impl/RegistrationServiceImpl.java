package com.devstack.lms.registrationserviceapi.service.impl;

import com.devstack.lms.registrationserviceapi.dto.request.RequestRegistrationDto;
import com.devstack.lms.registrationserviceapi.entity.Registration;
import com.devstack.lms.registrationserviceapi.repo.RegistrationRepo;
import com.devstack.lms.registrationserviceapi.service.RegistrationService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    private final RegistrationRepo registrationRepo;
    @Override
    public void registerStudent(RequestRegistrationDto requestRegistrationDto) {
        Registration registration
                = Registration.builder()
                .registerDate(requestRegistrationDto.getRegisterDate())
                .studentId(requestRegistrationDto.getStudentId())
                .programId(requestRegistrationDto.getProgramId())
                .intake(requestRegistrationDto.getIntake())
                .build();
        registrationRepo.save(registration);

    }
}
