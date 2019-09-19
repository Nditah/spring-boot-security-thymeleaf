package com.telixia.springboot.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.telixia.springboot.springsecurity.model.User;
import com.telixia.springboot.springsecurity.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
