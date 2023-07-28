package com.example.insuranceapplication.entity;

public class SearchRequest {
    private String searchType;
    private Integer inputText; 
    
    public SearchRequest() {
        
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public Integer getInputText() { 
        return inputText;
    }

    public void setInputText(Integer inputText) { 
        this.inputText = inputText;
    }

    @Override
    public String toString() {
        return "SearchRequest [searchType=" + searchType + ", inputText=" + inputText + "]";
    }
}

