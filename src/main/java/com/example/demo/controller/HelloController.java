package com.example.demo.controller;

import com.example.demo.Status;
import com.example.demo.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private TextService textService;

    @Autowired
    private Status status;
    @Autowired
    private Status status1;
    @Autowired
    private Status status2;

    @GetMapping("/hello")
    public String sayHello() {


        System.out.println(status1.getStatus());
        System.out.println(status2.getStatus());
        System.out.println(Status.count);
        return textService.addSight(status.getStatus());
    }


}
