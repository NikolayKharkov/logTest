package com.example.restLogExample.Controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restLogExample.DTO.LogMessage;

@RestController
@RequestMapping("/auth")
public class AuthLogController {


    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public boolean logAuthLogMessage(@RequestBody LogMessage logAuthMessage) {
        System.out.println("Auth permission message: " + logAuthMessage.getMessage());
        return true;
    }
}
