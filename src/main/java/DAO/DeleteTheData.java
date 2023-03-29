package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DTO.CreateTable;

public class DeleteTheData {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

public void delete(CreateTable createTable) {
	CreateTable createTable1=entityManager.find(CreateTable.class, 2);
entityTransaction.begin();
entityManager.remove(createTable1);
entityTransaction.commit();
}
}