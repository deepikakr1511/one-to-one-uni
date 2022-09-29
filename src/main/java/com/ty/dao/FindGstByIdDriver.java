package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Company;
import com.ty.dto.GST;



public class FindGstByIdDriver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		GST g = entityManager.find(GST.class,1);

		System.out.println(g.getId());
		System.out.println(g.getNumber());
		System.out.println(g.getStatus());

		Company c = g.getCompany();
		if (c != null) {
			System.out.println("*****************pan details**************");
			System.out.println(c.getId());
			System.out.println(c.getName());
			System.out.println(c.getAddress());
		}
	}

}
