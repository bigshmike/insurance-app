package com.example.insuranceapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.insuranceapplication.dao.SearchRequestDAO;
import com.example.insuranceapplication.entity.SearchRequest;
import com.example.insuranceapplication.entity.Subscriber;

@Service
public class SearchRequestServiceImpl implements SearchRequestService {
	
	@Autowired
	private SearchRequestDAO searchRequestDAO;

	@Override
	@Transactional
	public List<Subscriber> getSubscribers(SearchRequest searchRequest) {
		// TODO Auto-generated method stub
		return searchRequestDAO.getSubscribers(searchRequest);
	}

}
