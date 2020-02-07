package com.altimetrik.vin.service;

import com.altimetrik.vin.model.Vehicle;
import org.springframework.http.ResponseEntity;

public interface MainService {
    Vehicle getVehicles(String vin);
}
