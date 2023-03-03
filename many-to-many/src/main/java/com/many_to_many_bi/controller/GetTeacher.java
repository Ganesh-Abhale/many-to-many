package com.many_to_many_bi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.many_to_many_entity.Teacher;

public class GetTeacher {
 public static void main(String[] args) {
	
	 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
	 
	 EntityManager entityManager=entityManagerFactory.createEntityManager();
	 
	 //JPQL //
	 
	 String q="select t from Teacher t where t.id=?100";//position parameter
	 
	 Query query=entityManager.createQuery(q);
	 
	 query.setParameter(100, 2);
	 
	 Teacher teacher=(Teacher)query.getSingleResult();
	 
	 System.out.println(teacher);
	 	 
}
}
