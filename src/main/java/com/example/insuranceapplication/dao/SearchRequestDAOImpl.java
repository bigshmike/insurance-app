package com.example.insuranceapplication.dao;

import java.util.Collections;
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
		String searchType = searchRequest.getSearchType();
		Integer inputText;
		String sql = "";
		TypedQuery<Subscriber> query;
		if (searchType.equals("ssn")) {
			String sanitizedInputText = String.valueOf(searchRequest.getInputText()).replaceAll("[^0-9]", "");
			if (sanitizedInputText.isEmpty()) {
				return Collections.emptyList();
			}
			inputText = Integer.parseInt(sanitizedInputText);
			sql = "SELECT s FROM Subscriber s WHERE s.person.ssn = :ssn ";
			query = entityManager.createQuery(sql, Subscriber.class);
			query.setParameter("ssn", inputText);
			return query.getResultList();
		} 
		else if (searchType.equals("id")) {
			Integer subscriberId = searchRequest.getInputText();
			if (subscriberId == null) {
				return Collections.emptyList();
			}
			sql = "SELECT s FROM Subscriber s WHERE s.subscriberId = :subscriberId ";
			query = entityManager.createQuery(sql, Subscriber.class);
			query.setParameter("subscriberId", subscriberId);
			return query.getResultList();
		}
		return null;
	}
}
