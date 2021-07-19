package com.example.accessingdatamysql;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

public class DemoBss {

    @PostMapping("/login2")
    public void login(@RequestParam() String username, @RequestParam String password) {

    }
    @PostMapping("/login3")
    public Response login3(@RequestParam() String username, @RequestParam String password) {
return null;

    }
    @PostMapping("/login4")
    public Response login4(@RequestParam() String username, @RequestParam String password) {
        return null;

    }
}
