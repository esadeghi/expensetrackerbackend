package com.idehalborz.expensetracker.rest.controller;

import com.idehalborz.expensetracker.dto.UserDto;
import com.idehalborz.expensetracker.service.UserService;
import com.idehalborz.expensetracker.ui.model.request.UserDetailsRequestModel;
import com.idehalborz.expensetracker.ui.model.response.UserDetailsResponseModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    UserService _userService;

    @Autowired
    UserController(UserService userService){
        _userService = userService;
    }

    @GetMapping
    public String getuser()
    {
        return "Hello";
    }

    @PostMapping
    public UserDetailsResponseModel createUser(@RequestBody UserDetailsRequestModel userDetails){
        UserDto userDetailsDto = new UserDto();
        BeanUtils.copyProperties(userDetails, userDetailsDto);

       UserDto userCreated = _userService.createUser(userDetailsDto);
        UserDetailsResponseModel returnUser = new UserDetailsResponseModel();
       BeanUtils.copyProperties(userCreated, returnUser);

       return returnUser;
    }
}
