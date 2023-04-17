package org.jsp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class savecourse {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager m = emf.createEntityManager();
	EntityTransaction transaction = m.getTransaction();
	student s1=new student();
	s1.setName("s1");
	s1.setPerc(55);
	s1.setPhone(888);
	
	student s2=new student();
	s2.setName("s2");
	s2.setPerc(65);
	s2.setPhone(777);
	
	student s3=new student();
	s3.setName("s3");
	s3.setPerc(70);
	s3.setPhone(999);
	
	course c1=new course();
	c1.setSubject("JAVA");
	c1.setDuration(65);
	
	course c2=new course();
	c2.setSubject("J2EE");
	c2.setDuration(55);
	
	course c3=new course();
	c3.setSubject("Fram Work");
	c3.setDuration(50);
	
	s1.setCourses(new ArrayList<course>(Arrays.asList(c1,c2,c3)));
	s1.setCourses(new ArrayList<course>(Arrays.asList(c1,c2,c3)));
	s1.setCourses(new ArrayList<course>(Arrays.asList(c1,c3)));

    c1.setStudents(new ArrayList<student>(Arrays.asList(s1,s2)));
    c1.setStudents(new ArrayList<student>(Arrays.asList(s1,s2,s3)));
    c1.setStudents(new ArrayList<student>(Arrays.asList(s1,s2,s3)));
    
    m.persist(s1);
    m.persist(s2);
    m.persist(s3);
    m.persist(c1);
    m.persist(c2);
    m.persist(c3);
    transaction.begin();
    transaction.commit();
	
}
}
