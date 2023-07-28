package com.example.insuranceapplication.service;

import java.util.List;

import com.example.insuranceapplication.entity.Plan;

public interface PlanService {
	public Plan getPlan(int id);
	
	public void savePlans(List<Plan> plans);

}
