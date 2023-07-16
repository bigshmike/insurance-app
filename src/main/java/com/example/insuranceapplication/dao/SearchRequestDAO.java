package com.example.insuranceapplication.dao;

import java.util.List;

import com.example.insuranceapplication.entity.SearchRequest;
import com.example.insuranceapplication.entity.Subscriber;

public interface SearchRequestDAO {
	public List<Subscriber> getSubscribers(SearchRequest searchRequest);

}
