package com.franco.bothrestsoaptest.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    private static final String HELLO = "Hello World!";

    public String helloWorld(){


        return HELLO;
    }
}
