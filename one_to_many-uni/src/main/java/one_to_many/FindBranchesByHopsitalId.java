package one_to_many;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindBranchesByHopsitalId {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter type Hospital Id fing Branches");
		int his = s.nextInt();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		hosipal hospital = manager.find(hosipal.class, his);
		List<Branch> branchs = hospital.getBranchs();
		for (Branch b : branchs) {
			System.out.println("ID:" + b.getId());
			System.out.println("name:" + b.getName());
			System.out.println("phone:" + b.getPhone());
			System.out.println("Email Id:" + b.getEmail());
		}

	}

}
