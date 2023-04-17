package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.User;

public class UserDao {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	
	public User saveUser(User user) {
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(user);
		transaction.begin();
		transaction.commit();
		return user;
		
	}
	public User UpdateUser(User user) {
		EntityTransaction transaction=manager.getTransaction();
		manager.merge(user);
		transaction.begin();
		transaction.commit();
		return user;
	}
	public boolean deleteUser(int id) {
		EntityTransaction transaction=manager.getTransaction();
		User u=manager.find(User. class, id);
		if (u !=null) {
			manager.remove(u);
			transaction.begin();
			transaction.commit();
			return true;
		}
		return false;
	}
	


 public User findUserById(int id) {
	return manager.find(User. class, id);
}
 

 public List<User> findAllUsers(){
	Query q= manager.createQuery("select u from User u");
		return q.getResultList();
}

 public User virifyUser(long phone,String password) {
	 Query q = manager.createQuery("select u from user u where u.phone=?1 and u.password=?2");
	 q.setParameter(1, phone);
	 q.setParameter(2, password);
	 List<User> users = q.getResultList();
	 if(users.size()> 0)
		 return  users.get(0);
	 return null;
				 
}
 }
 



