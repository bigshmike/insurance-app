package com.example.insuranceapplication.entity;

public class SearchRequest {
    private String searchType;
    private Integer inputText; // Change the data type from int to Integer
    
    public SearchRequest() {
        
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public Integer getInputText() { // Change the return type from int to Integer
        return inputText;
    }

    public void setInputText(Integer inputText) { // Change the data type from int to Integer
        this.inputText = inputText;
    }

    @Override
    public String toString() {
        return "SearchRequest [searchType=" + searchType + ", inputText=" + inputText + "]";
    }
}

