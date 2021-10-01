package com.suidls.hibernate.service.impl;

import com.suidls.hibernate.entity.UserDetails;
import com.suidls.hibernate.repository.UserDetailsRepository;
import com.suidls.hibernate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Override
    public UserDetails saveUser(UserDetails userDetails) {
        return userDetailsRepository.save(userDetails);
    }
}
