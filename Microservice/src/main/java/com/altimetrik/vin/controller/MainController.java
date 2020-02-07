package com.altimetrik.vin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping(value = "/vehicles", method = RequestMethod.GET)
    public ResponseEntity<Object> getVehicles(@RequestParam("vin") String vin){
        return null;
    }
}
