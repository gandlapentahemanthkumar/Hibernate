package org.jsp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdatePerson {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session= factory.openSession();
		Transaction transaction=session.beginTransaction();
		Person p=new Person();
		p.setId(2);
		p.setName("hemanth");
		p.setPlace("unknow");
		p.setState("AP");
		session.saveOrUpdate(p);
		transaction.commit();
	}

}
