package com.suidls.hibernate.service;

import com.suidls.hibernate.entity.UserDetails;

import java.util.List;

public interface UserService {
    UserDetails saveUser(UserDetails userDetails);

    List<UserDetails> getUserDetails();
}
