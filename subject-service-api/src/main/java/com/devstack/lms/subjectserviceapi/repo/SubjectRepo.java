package com.devstack.lms.subjectserviceapi.repo;

import com.devstack.lms.subjectserviceapi.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Long> {
    List<Subject> findByIdIn(List<Long> ids);
}
