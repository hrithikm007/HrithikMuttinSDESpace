package com.eazybytes.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @GetMapping("helloworld")
    public String getAccounts() {
        return "Hello World";
    }
}
