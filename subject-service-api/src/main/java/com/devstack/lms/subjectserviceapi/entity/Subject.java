package com.devstack.lms.subjectserviceapi.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Entity
@Table(name = "subject")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean status;
}
