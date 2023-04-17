package org;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class SaveUser {
	

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		User u=new User();
		u.setId(3);
		u.setName("ABc");
		u.setEmail("b@gmail.com");
		u.setPhone(222);
		
		manager.detach(u);
		u.setName("R");
		u.setEmail("R@gmail.com");
		manager.find(User.class,2);
	    manager.remove(u);
		
		transaction.commit();
	
	}

}