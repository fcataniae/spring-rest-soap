package com.franco.bothrestsoaptest.soap;

import com.franco.bothrestsoaptest.controller.HelloController;
import com.franco.bothrestsoaptest.soap.dto.DTOByte;
import com.franco.bothrestsoaptest.soap.dto.DTOConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import  org.apache.commons.io.IOUtils;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

@WebService(serviceName="SoapTestService2")
@Component
public class SoapTestService2 {


    @Autowired
    public SoapTestService2 (HelloController helloController){
    }

    @WebMethod
    public String getBase64Remote(@WebParam(name = "dtoConsulta") DTOByte dtoByte ){

        return getBase64( dtoByte.getBytes());
    }

    @WebMethod
    public String getBase64Local(@WebParam(name ="dtoConsulta") DTOConsulta consulta ) throws IOException {

        File file = new File(consulta.getPath());
        byte[] byteArray = IOUtils.toByteArray(new FileInputStream(file));

        return getBase64(byteArray);
    }

    private String getBase64(byte[] bytes){


        return Base64.getEncoder().encodeToString(bytes);
    }
}
