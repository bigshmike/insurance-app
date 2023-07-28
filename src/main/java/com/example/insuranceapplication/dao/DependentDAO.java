package com.example.insuranceapplication.dao;

import java.util.List;

import com.example.insuranceapplication.entity.Dependent;
import com.example.insuranceapplication.entity.SearchRequest;

public interface DependentDAO {
	List<Dependent> getDependent(SearchRequest searchRequest);
}
