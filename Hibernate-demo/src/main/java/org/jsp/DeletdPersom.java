package org.jsp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 

public class DeletdPersom {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction=session.beginTransaction();
		Person p=session.find(Person.class,2);
		if(p!=null) {
			session.delete(p);
			System.out.println("Person Delets");
			transaction.commit();
		}else
			System.out.println("ID IS NOT FOUND");
		
	
	}
}
