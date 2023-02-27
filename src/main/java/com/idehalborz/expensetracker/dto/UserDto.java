package com.idehalborz.expensetracker.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Slf4j
@Data
@NoArgsConstructor
public class UserDto implements Serializable {
    public static Long serialVersionUId = 1L;
    private int id;
    private String publicId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean emailVerified;
    private String emailVerificationToken;
}
