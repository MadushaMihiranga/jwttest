package com.security.securityjwt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin()
public class EmployeeController {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String getEmployees() {
        return "Welcome!";
    }

    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    public String getEmployees1() {
        return "Welcomeasdfg!";
    }

}
