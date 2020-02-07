package com.altimetrik.vin;

import com.altimetrik.vin.controller.MainController;
import com.altimetrik.vin.model.Vehicle;
import com.altimetrik.vin.service.MainService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;



@SpringBootTest
@RunWith(SpringRunner.class)
class VinApplicationTests {

    @Autowired
    MainController mainController;

    @Autowired
    MainService mainService;



    @Test
    void contextLoads() {
    }

    @Test
    void controllerTest(){
        String vin = "WAUFFAFM3CA000000";

        Vehicle vehicle = new Vehicle();
        vehicle.setMake("AUDI");
        vehicle.setModel("A3");
        vehicle.setPlantCountry("GERMANY");
        vehicle.setPlantState("null");
        Vehicle vehicle1 = (Vehicle) mainController.getVehicles("WAUFFAFM3CA000000").getBody();
        System.out.println(vehicle1);
        Assert.assertEquals("AUDI", vehicle1.getMake());
        Assert.assertEquals("A3", vehicle1.getModel());
        Assert.assertEquals("GERMANY", vehicle1.getPlantCountry());
    }



}
