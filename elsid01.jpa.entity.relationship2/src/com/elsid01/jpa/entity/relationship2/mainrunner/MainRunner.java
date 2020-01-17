package com.elsid01.jpa.entity.relationship2.mainrunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.elsid01.jpa.entity.relationship2.entities.NonTeachingStaff;
import com.elsid01.jpa.entity.relationship2.entities.TeachingStaff;

public class MainRunner {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("elsid01.jpa.entity.relationship2");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		TeachingStaff ts = new TeachingStaff(1, "Mike", "Something", "Computers");
		NonTeachingStaff ns = new NonTeachingStaff(2, "Zamira", "Finding people jobs");
		
		manager.persist(ts);
		manager.persist(ns);
		
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

}
