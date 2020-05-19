package com.franco.bothrestsoaptest.soap;

import com.franco.bothrestsoaptest.controller.HelloController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="SoapTestService")
@Component
public class SoapTestService {

    private final HelloController helloController;

    @Autowired
    public SoapTestService (HelloController helloController){

        this.helloController = helloController;
    }

    @WebMethod
    public String getTest(){


        return helloController.helloWorld();
    }

}
