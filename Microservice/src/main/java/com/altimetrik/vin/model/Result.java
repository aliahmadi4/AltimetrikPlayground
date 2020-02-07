package com.altimetrik.vin.model;

import lombok.Data;


public class Result {
    String value;
    String valueId;
    String variable;
    Integer variableId;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueId() {
        return valueId;
    }

    public void setValueId(String valueId) {
        this.valueId = valueId;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public Integer getVariableId() {
        return variableId;
    }

    public void setVariableId(Integer variableId) {
        this.variableId = variableId;
    }

    @Override
    public String toString() {
        return "Result{" +
                "value='" + value + '\'' +
                ", valueId='" + valueId + '\'' +
                ", variable='" + variable + '\'' +
                ", variableId=" + variableId +
                '}';
    }

}
