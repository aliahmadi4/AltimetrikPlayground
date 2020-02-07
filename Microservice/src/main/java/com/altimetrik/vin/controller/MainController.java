package com.altimetrik.vin.controller;

import com.altimetrik.vin.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    MainService mainService;

    @RequestMapping(value = "/vehicles", method = RequestMethod.GET)
    public ResponseEntity<Object> getVehicles(@RequestParam("vin") String vin){
        return null;
    }
}
