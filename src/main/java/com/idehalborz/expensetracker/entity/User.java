package com.idehalborz.expensetracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Entity
@Data
@NoArgsConstructor
@Slf4j
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String publicId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean emailVerified;
    private String emailVerificationToken;
}
