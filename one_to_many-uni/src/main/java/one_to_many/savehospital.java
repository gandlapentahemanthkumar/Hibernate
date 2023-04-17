 package one_to_many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class savehospital {
public static void main(String[] args) {
	EntityManagerFactory facory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager=facory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	hosipal h=new hosipal();
	h.setFounder("ABC");
	h.setGst("abc123");
	h.setName("Apollo");
	Branch b1=new Branch();
	b1.setEmail("ApolloB@gmail.com");
	b1.setPhone(9999);
	b1.setName("ApolloB");
	Branch b2=new Branch();
	b2.setEmail("ApolloC@gmail.com");
	b2.setPhone(8888);
	b2.setName("ApolloC");
	Branch b3=new Branch();
	b3.setEmail("ApolloM@gmail.com");
	b3.setPhone(777);
	b3.setName("ApolloM");
	
	List<Branch> branch=new ArrayList<Branch>(Arrays.asList(b1,b2,b3));
	h.setBranchs(branch);
	manager.persist(h);
	manager.persist(b1);
	manager.persist(b2);
	manager.persist(b3);
	
	transaction.begin();
	transaction.commit();
	
	
}
}
