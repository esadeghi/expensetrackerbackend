package com.idehalborz.expensetracker.service;

import com.idehalborz.expensetracker.dto.UserDto;
import com.idehalborz.expensetracker.entity.AppUser;
import com.idehalborz.expensetracker.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

public class UserServiceImpl implements UserService{

    UserRepository _userRepository;
    PasswordEncoder _passwordEncoder;

    @Autowired
    UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder)
    {
        _userRepository = userRepository;
        _passwordEncoder = passwordEncoder;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User(username,"", new ArrayList());
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        if(_userRepository.findbyemail(userDto.getEmail()) != null)
        {
            throw new RuntimeException("EMail already exists");
        }
        AppUser appUser = new AppUser();
        BeanUtils.copyProperties(userDto, appUser);

        appUser.setPublicId("ee");
        appUser.setPassword(_passwordEncoder.encode(userDto.getPassword()));
        _userRepository.save(appUser);

        UserDto returnUser = new UserDto();
        BeanUtils.copyProperties(appUser, returnUser);
        return returnUser;
    }
}
