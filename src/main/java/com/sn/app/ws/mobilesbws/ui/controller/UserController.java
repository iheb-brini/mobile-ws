package com.sn.app.ws.mobilesbws.ui.controller;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.sn.app.ws.mobilesbws.service.UserService;
import com.sn.app.ws.mobilesbws.shared.dto.UserDto;
import com.sn.app.ws.mobilesbws.ui.model.request.UserDetailsRequestModel;
import com.sn.app.ws.mobilesbws.ui.model.response.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users") //http://localhost:8080/users
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getUser() {
        return "Get user was called";
    }

    @PostMapping()
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {

        UserRest returnValue = new UserRest();
        UserDto userDto = new UserDto();

        BeanUtils.copyProperties(userDetails,userDto);
        UserDto createdUser = userService.createUser(userDto);

        BeanUtils.copyProperties(createdUser,returnValue);
        return returnValue;
    }

    @PutMapping
    public String UpdateUser() {
        return "Update user was called";
    }

    @DeleteMapping
    public String DeleteUser() {
        return "Delete user was called";
    }
}