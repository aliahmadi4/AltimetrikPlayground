package com.altimetrik.vin.service;

import org.springframework.http.ResponseEntity;

public interface MainService {
    ResponseEntity getVehicles(String vin);
}
