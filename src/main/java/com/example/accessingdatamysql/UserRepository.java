package com.example.accessingdatamysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

public interface UserRepository extends JpaRepository<User,Integer> {
        @Query("SELECT f FROM User f WHERE f.name = :Username and f.password = :Password")
        Collection<User> loginwith(@Param("Username") String username, @Param("Password") String password);
}

