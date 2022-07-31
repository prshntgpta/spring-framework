package org.prshntgpta.springaoplogger.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloWorldResource {

    @Autowired
    Environment environment;

    @GetMapping("/hello")
    public ResponseEntity getEntityResponse(@RequestHeader(name = "client-id", defaultValue =
            "0000") String clientId,
                                            @RequestAttribute(name = "brand", required = false) String brandName, HttpServletRequest request,
                                            HttpServletResponse response){
        String applicationNameFromProperty = environment.getProperty("spring.application.name");
        System.out.println("applicationNameFromProperty:"+applicationNameFromProperty);
        String developerName = environment.getProperty("developer." +
                "name");
        System.out.println("developerName:"+developerName);

        return ResponseEntity.ok("Success");


    }
}
