package com.altimetrik.vin.service.impl;

import com.altimetrik.vin.model.Response;
import com.altimetrik.vin.model.Result;
import com.altimetrik.vin.service.MainService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainServiceImpl implements MainService {

    @Autowired
    RestTemplate restTemplate;
    String baseUrl = "https://vpic.nhtsa.dot.gov/api/vehicles/DecodeVinExtended/";

    @Override
    public ResponseEntity getVehicles(String vin) {
        //if input is less than 17
        if (vin.length() != 17) {
            System.out.println("invlid number");
            return ResponseEntity.notFound().build();
        }
        String url = baseUrl + vin + "?format=json";
//        System.out.println(url);
//        ResponseEntity<Response> response = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<Response>() {});
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
//        System.out.println(response.getBody());
        JSONObject json = new JSONObject(response.getBody());
//        System.out.println(json);
        Response response1 = new Response();
        response1.setCount(json.getInt("Count"));
        response1.setMessage(json.getString("Message"));
        response1.setSearchCriteria(json.getString("SearchCriteria"));
//        System.out.println(response1);

        List<Result> results = new ArrayList<>();

        JSONArray jsonArray = json.getJSONArray("Results");
        for (int i = 0; i < jsonArray.length(); i++) {
            Result tempResult = new Result();
            JSONObject object = jsonArray.getJSONObject(i);
            if (object.getString("Value") != null)
                tempResult.setValue(object.getString("Value"));
            if (object.getString("ValueId") != null)
                tempResult.setValueId(object.getString("ValueId"));
            if (object.getString("Variable") != null)
                tempResult.setVariable(object.getString("Variable"));

                tempResult.setVariableId(object.getInt("VariableId"));
            results.add(tempResult);
        }

        //add the results to response
        response1.setResults(results);

        System.out.println(results);


        return null;
    }
}
