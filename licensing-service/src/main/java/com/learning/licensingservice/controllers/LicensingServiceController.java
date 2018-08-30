package com.learning.licensingservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RequestMapping("/licensingservice")
@RestController
public class LicensingServiceController {

    @Value("${message:Licensing service welcomes you by default.}")
    private String message;

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String message(){
        return message;
    }
}
