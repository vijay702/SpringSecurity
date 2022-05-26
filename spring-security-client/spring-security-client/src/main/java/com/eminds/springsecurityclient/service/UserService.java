package com.eminds.springsecurityclient.service;

import com.eminds.springsecurityclient.entity.User;
import com.eminds.springsecurityclient.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
