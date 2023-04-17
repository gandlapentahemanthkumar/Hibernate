package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
        EntityManager manager=factory.createEntityManager();
        EntityTransaction transaction=manager.getTransaction();
        Person p=new Person();
        p.setName("hemant");
        p.setAge(24);
        PersonId id=new PersonId();
        id.setEmail("hemanthppd@gmail.com");
        id.setPhone(999);
        p.setId(id);
        manager.persist(p);
        transaction.begin();
        transaction.commit();
        
	}

}
