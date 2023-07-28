package com.example.insuranceapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.insuranceapplication.dao.DependentDAO;
import com.example.insuranceapplication.entity.Dependent;
import com.example.insuranceapplication.entity.SearchRequest;

@Service
public class DependentServiceImpl implements DependentService {
	
	@Autowired
	private DependentDAO dependentDAO;

	@Override
	@Transactional
	public List<Dependent> getDependents(SearchRequest searchRequest) {
		// TODO Auto-generated method stub
		return dependentDAO.getDependent(searchRequest);
	}

}
