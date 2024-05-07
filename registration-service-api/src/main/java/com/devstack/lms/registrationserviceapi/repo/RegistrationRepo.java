package com.devstack.lms.registrationserviceapi.repo;

import com.devstack.lms.registrationserviceapi.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration, Long> {
}
