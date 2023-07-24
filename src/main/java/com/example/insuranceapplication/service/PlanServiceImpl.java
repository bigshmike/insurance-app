package com.example.insuranceapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.insuranceapplication.dao.PlanDAO;
import com.example.insuranceapplication.entity.Plan;

@Service
public class PlanServiceImpl implements PlanService {
	
	@Autowired
	private PlanDAO planDAO;

	@Override
	public Plan getPlan(int id) {
		// TODO Auto-generated method stub
		return planDAO.getPlan(id);
	}

}
