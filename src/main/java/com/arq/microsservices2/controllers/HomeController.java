package com.arq.microsservices2.controllers;

import com.arq.microsservices2.utils.MessageHome;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home2")
@CrossOrigin
public class HomeController {

    @GetMapping()
    public String Welcome(){
        return MessageHome.MessageHome();
    }

}
