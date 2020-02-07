package com.altimetrik.vin.model;

import lombok.Data;

import java.util.Objects;


public class Vehicle {
    String make;
    String model;
    String plantCountry;
    String plantState;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlantCountry() {
        return plantCountry;
    }

    public void setPlantCountry(String plantCountry) {
        this.plantCountry = plantCountry;
    }

    public String getPlantState() {
        return plantState;
    }

    public void setPlantState(String plantState) {
        this.plantState = plantState;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", plantCountry='" + plantCountry + '\'' +
                ", plantState='" + plantState + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(o==null) return false;
        Vehicle vehicle = (Vehicle) o;
        if(o instanceof Vehicle){

        }else{
            return false;
        }
        return (vehicle.getMake().equals(this.make) &&
                vehicle.getModel().equals(this.model) &&
                vehicle.getPlantCountry().equals(this.plantCountry) &&
                vehicle.getPlantState().equals(this.plantState));

    }

    @Override
    public int hashCode(){
        return Objects.hash(this.make, this.model, this.plantCountry, this.plantState);
    }
}
