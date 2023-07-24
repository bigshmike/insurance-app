package com.example.insuranceapplication.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.insuranceapplication.dao.SubscriberDAO;
import com.example.insuranceapplication.entity.Subscriber;

@Service
public class SubscriberServiceImpl implements SubscriberService {
	
	private SubscriberDAO subscriberDAO;

	@Override
	@Transactional
	public Subscriber getSubscriber(int id) {
		// TODO Auto-generated method stub
		return subscriberDAO.getSubscriber(id);
	}

}
