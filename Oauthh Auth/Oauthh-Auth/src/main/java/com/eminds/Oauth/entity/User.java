package com.eminds.Oauth.entity;

import lombok.*;


import javax.persistence.*;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @Column(length = 60)
    private String password;

    private String role;
    private boolean enabled = false;



}
