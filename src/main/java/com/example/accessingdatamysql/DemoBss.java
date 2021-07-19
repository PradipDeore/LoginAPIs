package com.example.accessingdatamysql;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

public class DemoBss {
    @PostMapping("/login2")
    public void login(@RequestParam() String username, @RequestParam String password) {

    }
}
