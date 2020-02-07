package com.altimetrik.vin.controller;

import com.altimetrik.vin.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin("*")
@RestController
public class MainController {
    @Autowired
    MainService mainService;

    @RequestMapping(value = "/vehicles", method = RequestMethod.GET)
    public ResponseEntity getVehicles(@RequestParam("vin") String vin){
        if (vin.length() != 17) {
            System.out.println("invlid number");
            return ResponseEntity.status(400).build();
        }
        return ResponseEntity.ok(mainService.getVehicles(vin));
    }
}
