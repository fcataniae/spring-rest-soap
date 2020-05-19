package com.franco.bothrestsoaptest.rest;


import com.franco.bothrestsoaptest.controller.HelloController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/api-rest")
public class RestTestService {

    private final HelloController helloController;

    @Autowired
    public RestTestService (HelloController helloController){

        this.helloController = helloController;
    }

    @GetMapping("/test")
    public @ResponseBody Map<String, String> getTest(){


        return Collections.singletonMap("Controller",helloController.helloWorld());
    }
}
