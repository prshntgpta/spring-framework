package org.prshntgpta.springaoplogger.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestHeader;

@Controller
@Log4j
public class HelloWorldResource {

    public ResponseEntity getEntityResponse(@RequestHeader(name = "client-id", defaultValue = "0000") String clientId, @RequestAttribute(name = "brand", required = true) String brandName, HttpRequest request){
        return ResponseEntity.ok("Success");


    }
}
