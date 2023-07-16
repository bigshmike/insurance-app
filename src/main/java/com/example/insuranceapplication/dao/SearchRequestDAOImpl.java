package com.example.insuranceapplication.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.insuranceapplication.entity.SearchRequest;
import com.example.insuranceapplication.entity.Subscriber;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class SearchRequestDAOImpl implements SearchRequestDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Subscriber> getSubscribers(SearchRequest searchRequest) {
		// TODO Auto-generated method stub
		String searchType = searchRequest.getSearchType();
		String inputText = searchRequest.getInputText();
		String sql = "";
		TypedQuery<Subscriber> query;
		if (searchType.equals("ssn")) {
			sql = "from Subscriber s join Person p on p.ssn = s.personId where p.ssn like :inputText ";
			query = entityManager.createQuery(sql, Subscriber.class);
			query.setParameter("inputText", inputText);
			return query.getResultList();
		}
		else if (searchType.equals("id")) {
			sql = "from Subscriber s join Person p on p.ssn = s.personId where s.subscriberId like :inputText ";
			query = entityManager.createQuery(sql, Subscriber.class);
			query.setParameter("inputText", inputText);
			return query.getResultList();
		}
		return null;
	}

}
