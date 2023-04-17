package org.jsp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetPerson {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session =factory.openSession();
		Person p=session.find(Person. class,2);
		if(p!=null) {
			System.out.println("ID:"+p.getId());
			System.out.println("name:"+p.getName());
			System.out.println("place:"+p.getPlace());
			System.out.println("State:"+p.getState());
			
		}else
			System.out.println("Reccod not Fount");
		
		
	}

}
