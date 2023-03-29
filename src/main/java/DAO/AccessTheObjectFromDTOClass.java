package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DTO.CreateTable;

public class AccessTheObjectFromDTOClass {
	 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
     EntityManager entityManager=entityManagerFactory.createEntityManager();
     EntityTransaction entityTransaction=entityManager.getTransaction();
     
     public void insert(CreateTable createTable) {
    	 entityTransaction.begin();
    	 entityManager.persist(createTable);
    	 entityTransaction.commit();
     }
}
