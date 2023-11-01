package com.example.restLogExample.Controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restLogExample.DTO.LogMessage;

@RestController
@RequestMapping("/usersManagments")
public class UsersManagmentsController  {

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public boolean logUsersManagmentsMessage(@RequestBody LogMessage logUsersManagmentsMessage) {
        System.out.println("Log usersManagments message: " + logUsersManagmentsMessage.getMessage());
        return true;
    }

}
