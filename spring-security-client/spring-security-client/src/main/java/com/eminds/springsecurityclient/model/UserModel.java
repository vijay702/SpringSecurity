package com.eminds.springsecurityclient.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {


    private String name;
    private String lastname;
    private String email;
    private String password;
    private String matchingPassword;
}
