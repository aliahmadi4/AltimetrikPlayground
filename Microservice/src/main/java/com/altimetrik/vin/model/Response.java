package com.altimetrik.vin.model;

import lombok.Data;


import java.util.List;


public class Response {
    private Integer count;
    private String message;
    private String searchCriteria;
    private List<Result> results;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Response{" +
                "count=" + count +
                ", message='" + message + '\'' +
                ", searchCriteria='" + searchCriteria + '\'' +
                ", results=" + results +
                '}';
    }
}
