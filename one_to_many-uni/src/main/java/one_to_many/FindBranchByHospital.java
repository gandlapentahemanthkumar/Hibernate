package one_to_many;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindBranchByHospital {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the hospital Id to find Branches");
		int hid =s. nextInt();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		Query q=manager.createQuery("select b from Branch b where b.hospital.id=1");
		q.setParameter(1, hid);
		List<Branch> branchs=q.getResultList();
		for(Branch b:branchs) {
			System.out.println("ID:"+b.getId());
	    	System.out.println("name:"+b.getName());
	    	System.out.println("phone:"+b.getPhone());
	    	System.out.println("Email Id:"+b.getEmail());
	    	System.out.println("________________________________");
		}
		
	}

}
