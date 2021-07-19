package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController

public class MainController {

    @Autowired
    UserRepository userRepo;

    @PostMapping("/login")
    public Response login(@RequestParam() String username, @RequestParam String password) {

        Collection<User> users = userRepo.loginwith(username, password);
        if (users.isEmpty()) {
            Response respObj = new Response("Authentication failed", 0);
            return respObj;
        }
        Response respObj = new Response("Authentication success", 1);
        return respObj;
    }

}
