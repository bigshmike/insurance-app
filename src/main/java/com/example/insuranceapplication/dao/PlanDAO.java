package com.example.insuranceapplication.dao;

import java.util.List;

import com.example.insuranceapplication.entity.Plan;

public interface PlanDAO {
	public Plan getPlan(int id);

	public void savePlans(List<Plan> plans);

}
