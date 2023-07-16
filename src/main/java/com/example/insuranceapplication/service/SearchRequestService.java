package com.example.insuranceapplication.service;

import java.util.List;

import com.example.insuranceapplication.entity.SearchRequest;
import com.example.insuranceapplication.entity.Subscriber;

public interface SearchRequestService {
	public List<Subscriber> getSubscribers(SearchRequest searchRequest);
}
