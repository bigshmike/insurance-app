package com.example.insuranceapplication.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.insuranceapplication.entity.Subscriber;

import jakarta.persistence.EntityManager;

@Repository
public class SubscriberDAOImpl implements SubscriberDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public Subscriber getSubscriber(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Subscriber.class, id);
	}

}
