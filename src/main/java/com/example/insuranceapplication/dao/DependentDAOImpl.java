package com.example.insuranceapplication.dao;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.insuranceapplication.entity.Dependent;
import com.example.insuranceapplication.entity.SearchRequest;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class DependentDAOImpl implements DependentDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Dependent> getDependent(SearchRequest searchRequest) {
		// TODO Auto-generated method stub
		String searchType = searchRequest.getSearchType();
		String sql = "";
		TypedQuery<Dependent> query;
		if (searchType.equals("ssn")) {
			Integer ssn = searchRequest.getInputText();
			if (ssn == null) {
				return Collections.emptyList();
			}
			sql = "FROM Dependent d WHERE d.subscriber.person.ssn = :ssn ";
			query = entityManager.createQuery(sql, Dependent.class);
			query.setParameter("ssn", ssn);
			return query.getResultList();
		} 
		else if (searchType.equals("id")) {
			Integer subscriberId = searchRequest.getInputText();
			if (subscriberId == null) {
				return Collections.emptyList();
			}
			sql = "FROM Dependent d WHERE d.subscriberId = :subscriberId ";
			query = entityManager.createQuery(sql, Dependent.class);
			query.setParameter("subscriberId", subscriberId);
			return query.getResultList();
		}
		return null;
	}

}
