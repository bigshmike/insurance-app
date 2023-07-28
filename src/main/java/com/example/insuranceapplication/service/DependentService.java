package com.example.insuranceapplication.service;

import java.util.List;

import com.example.insuranceapplication.entity.Dependent;
import com.example.insuranceapplication.entity.SearchRequest;

public interface DependentService {
	public List<Dependent> getDependents(SearchRequest searchRequest);

}
