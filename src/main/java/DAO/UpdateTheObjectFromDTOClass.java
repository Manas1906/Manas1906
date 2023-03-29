package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DTO.CreateTable;

public class UpdateTheObjectFromDTOClass {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

public void update(CreateTable createTable) {
	entityTransaction.begin();
	entityManager.merge(createTable);
	entityTransaction.commit();
	System.out.println("updated successfully");
}

}
