package com.example;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void setup() {

		Properties prop = new Properties();

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa.example.fk", prop);
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Person person = em.find(Person.class, "ME");
		
		em.close();

	}

	@Test
	public void runTest() {
		System.out.println("DONE");
	}
}
