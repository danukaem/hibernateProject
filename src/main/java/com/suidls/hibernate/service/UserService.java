package com.suidls.hibernate.service;

import com.suidls.hibernate.entity.UserDetails;

public interface UserService {
    UserDetails saveUser(UserDetails userDetails);
}
