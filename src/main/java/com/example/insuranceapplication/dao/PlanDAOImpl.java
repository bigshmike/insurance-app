package com.example.insuranceapplication.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.insuranceapplication.entity.Plan;

import jakarta.persistence.EntityManager;

@Repository
public class PlanDAOImpl implements PlanDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public Plan getPlan(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Plan.class, id);
	}

	@Override
	public void savePlans(List<Plan> plans) {
		// TODO Auto-generated method stub
		for (Plan plan : plans) {
            entityManager.persist(plan);
        }
		
	}


}
