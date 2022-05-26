package com.eminds.springsecurityclient.repository;

import com.eminds.springsecurityclient.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposotory extends JpaRepository<User,Long> {


}
