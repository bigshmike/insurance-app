package com.example.insuranceapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.insuranceapplication.dao.PlanDAO;
import com.example.insuranceapplication.entity.Plan;

@Service
public class PlanServiceImpl implements PlanService {
	
	@Autowired
	private PlanDAO planDAO;

	@Override
	@Transactional
	public Plan getPlan(int id) {
		// TODO Auto-generated method stub
		return planDAO.getPlan(id);
	}

	@Override
	@Transactional
	public void savePlans(List<Plan> plans) {
		// TODO Auto-generated method stub
		planDAO.savePlans(plans);
	}

	

}
