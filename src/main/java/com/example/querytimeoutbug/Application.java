package com.example.querytimeoutbug;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

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
