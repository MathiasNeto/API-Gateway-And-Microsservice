package com.arq.microsservices1.controllers;

import com.arq.microsservices1.utils.MessageHome;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class HomeController {

    @GetMapping()
    public String Welcome(){
        return MessageHome.MessageHome();
    }

}
