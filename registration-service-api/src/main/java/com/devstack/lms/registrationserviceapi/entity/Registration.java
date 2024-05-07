package com.devstack.lms.registrationserviceapi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "registration")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date registerDate;
    private String intake;
    private Long studentId;
    private Long programId;
    private boolean isVerified;
}
