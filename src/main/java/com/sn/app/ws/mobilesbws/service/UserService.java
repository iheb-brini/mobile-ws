package com.sn.app.ws.mobilesbws.service;

import com.sn.app.ws.mobilesbws.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
    UserDto getUser(String email);
}
