package com.eminds.springsecurityclient.service;

import com.eminds.springsecurityclient.entity.User;
import com.eminds.springsecurityclient.model.UserModel;
import com.eminds.springsecurityclient.repository.UserReposotory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

   @Autowired
    private ModelMapper mapper;

   @Autowired
   private PasswordEncoder passwordEncoder;

    @Autowired
    private UserReposotory userReposotory;



    @Override
    public User registerUser(UserModel userModel) {

        User user = new User();

        user.setEmail(userModel.getEmail());
        user.setName(userModel.getName());
        user.setRole("USER");
        user.setPassword(passwordEncoder.encode(userModel.getPassword()));

        userReposotory.save(user);
        return  user;

    }




//    private User mapToEntity(UserModel userModel){
//
//
//        User user =mapper.map(userModel,User.class);
//        return  user;
//
//    }
//
//    private UserModel mapToModel(User user){
//
//
//        UserModel userModel =mapper.map(user,UserModel.class);
//        return  userModel;
//
//    }

}
