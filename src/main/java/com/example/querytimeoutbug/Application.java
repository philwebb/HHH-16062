package com.example.querytimeoutbug;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;

public class Application {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.example.querytimeoutbug");
		EntityManager entityManager = factory.createEntityManager();
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<TestEntity> criteriaQuery = criteriaBuilder.createQuery(TestEntity.class);
		criteriaQuery.select(criteriaQuery.from(TestEntity.class));
		TypedQuery<TestEntity> query = entityManager.createQuery(criteriaQuery);
		System.out.println(query.getResultList());
	}

}
