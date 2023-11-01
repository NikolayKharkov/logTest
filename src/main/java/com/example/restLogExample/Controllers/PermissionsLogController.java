package com.example.restLogExample.Controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restLogExample.DTO.LogMessage;

@RestController
@RequestMapping("/permissions")
public class PermissionsLogController {

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public boolean logPermissionMessage(@RequestBody LogMessage logPermissionMessage) {
        System.out.println("Log permission message: " + logPermissionMessage.getMessage());
        return true;
    }

}
