package com.eminds.Oauth.service;

import com.eminds.Oauth.entity.User;
import com.eminds.Oauth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);


        if (user == null){

            throw new UsernameNotFoundException("No User Found");
        }

          return org.springframework.security.core.userdetails.User(

                  user.getEmail();
                  user.getPassword();
                  user.isEnabled();
                  user.getName();


          );
    }
}
