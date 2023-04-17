package org.jsp;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("all")
public class GetAllPerson {
	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		String hql="select k from Person k";
		System.out.println("1");
		Query<Person> q=session.createQuery(hql);
		System.out.println("2");
		List<Person> ps=q.getResultList();
		System.out.println("3");
		for(Person p:ps) {
			System.out.println("name:"+p.getName());
			System.out.println("ID:"+p.getId());
			System.out.println("place:"+p.getPlace());
			System.out.println("State:"+p.getState());
			System.out.println("---------------------");
		}
		
	}

}
