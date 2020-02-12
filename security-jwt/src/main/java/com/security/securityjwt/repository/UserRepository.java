package com.security.securityjwt.repository;

import com.security.securityjwt.model.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends JpaRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}
