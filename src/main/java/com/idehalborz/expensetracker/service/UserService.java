package com.idehalborz.expensetracker.service;

import com.idehalborz.expensetracker.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto userDto);
}
