package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Company;
import com.ty.dto.GST;

public class InsertDriver1 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Company c=new Company();
		c.setName("tyss");
		c.setAddress("banglore");
		GST g=new GST();
		g.setNumber("dfd56768");
		g.setStatus("active");
		g.setCompany(c);
		entityTransaction.begin();
		entityManager.persist(c);
		entityManager.persist(g);
		entityTransaction.commit();
		
	}

}
