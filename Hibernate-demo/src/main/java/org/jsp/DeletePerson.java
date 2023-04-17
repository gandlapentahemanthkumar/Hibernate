package org.jsp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeletePerson {
	public static void main(String[] args) {
		Person p=new Person();
		p.setId(1);
		p.setName("kumar");
		p.setPlace("AP");
		p.setPercetage(7.55);
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.update(p);
		t.commit();
		
		
	}

}
