package com.many_to_many_bi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.many_to_many_entity.Subject;
import com.many_to_many_entity.Teacher;

public class SaveTeacher {

	
	public static void main(String[] args) {
		
		
		List<Teacher> techers=new ArrayList<Teacher>();
		List<Subject> subjects=new ArrayList<Subject>();
		
		
		Teacher teacher1=new Teacher();
		
		teacher1.setName("Rahul");
		teacher1.setAddress("bombay");
		teacher1.setAge(29);
		
		teacher1.setSubjects(subjects);
		
		
		Teacher teacher2=new Teacher();
		
		teacher2.setName("Pankaj");
		teacher2.setAddress("Nashik");
		teacher2.setAge(28);
		
		teacher2.setSubjects(subjects);
		
		
	Teacher teacher3=new Teacher();
		
		teacher3.setName("Ranni");
		teacher3.setAddress("Karnataka");
		teacher3.setAge(20);
		
		teacher3.setSubjects(subjects);
		
		techers.add(teacher1);
		techers.add(teacher2);
		techers.add(teacher3);
		
		
		Subject subject1=new Subject();
		
		subject1.setName("Mathematics");
		subject1.setDuration(50);
		subject1.setTeachers(techers);
		
		
		Subject subject2=new Subject();
		
		subject2.setName("C++");
		subject2.setDuration(35);
		subject2.setTeachers(techers);	
		
		
		Subject subject3=new Subject();
		
		subject3.setName("Python");
		subject3.setDuration(55);
		subject3.setTeachers(techers);
		
		
		
		
		subjects.add(subject1);
		subjects.add(subject2);
		subjects.add(subject3);
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
		entityManager.persist(teacher1);
		entityManager.persist(teacher2);
		entityManager.persist(teacher3);
		
		entityTransaction.commit();
		

}
}