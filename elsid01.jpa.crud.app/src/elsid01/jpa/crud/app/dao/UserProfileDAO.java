package elsid01.jpa.crud.app.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import elsid01.jpa.crud.app.entities.UserProfile;

public class UserProfileDAO implements UserProfileDAOI {

	@Override
	public int insertUser(UserProfile user) throws SQLException, ClassNotFoundException {
		int result = 0;
		try {
		//1. Declare entity Factory manager and the entity manager
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("elsid01.jpa.crud.appFactory");
		EntityManager em= emf.createEntityManager();
		//2. Transaction (CRUD)
           //a.begining
		em.getTransaction().begin();
		   //b. execute operation
		em.persist(user);
		   //c. commit 
		em.getTransaction().commit();
		//3. Close connection
		em.close();
		emf.close();
		result =1;
		}catch(PersistenceException pe) {
			result = 0;
			pe.printStackTrace();
		}
		finally {
			System.out.println("This always happen");
			if (result==1) {
				System.out.println("More steps");
			}
		}

		return 0;
	}

	@Override
	public int deleteUserById(int userId) throws ClassNotFoundException, SQLException {
		//1. Declare entity Factory manager and the entity manager
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("elsid01.jpa.crud.appFactory");
		EntityManager em= emf.createEntityManager();
		//2. Transaction (CRUD)
		 //a.begining
		em.getTransaction().begin();
		   //b. execute operation
		
		   //c. commit 
		em.getTransaction().commit();
		//3. Close connection
		em.close();
		emf.close();
		
		return 0;
	}

	@Override
	public int updateUser(UserProfile user) throws ClassNotFoundException, SQLException {
		//1. Declare entity Factory manager and the entity manager
				EntityManagerFactory emf= Persistence.createEntityManagerFactory("elsid01.jpa.crud.appFactory");
				EntityManager em= emf.createEntityManager();
				//2. Transaction (CRUD)
				 //a.begining
				em.getTransaction().begin();
				   //b. execute operation
				
				   //c. commit 
				em.getTransaction().commit();
				//3. Close connection
				em.close();
				emf.close();
				
		return 0;
	}

	@Override
	public UserProfile getUserById(int userId) throws ClassNotFoundException, SQLException {
		//1. Declare entity Factory manager and the entity manager
				EntityManagerFactory emf= Persistence.createEntityManagerFactory("elsid01.jpa.crud.appFactory");
				EntityManager em= emf.createEntityManager();
				//2. Transaction (CRUD)
				 //a.begining
				em.getTransaction().begin();
				   //b. execute operation
				
				   //c. commit 
				em.getTransaction().commit();
				//3. Close connection
				em.close();
				emf.close();
				
		return null;
	}

	@Override
	public ArrayList<UserProfile> getAllUser() throws SQLException, ClassNotFoundException {
		//1. Declare entity Factory manager and the entity manager
				EntityManagerFactory emf= Persistence.createEntityManagerFactory("elsid01.jpa.crud.appFactory");
				EntityManager em= emf.createEntityManager();
				//2. Transaction (CRUD)
				 //a.begining
				em.getTransaction().begin();
				   //b. execute operation
				
				   //c. commit 
				em.getTransaction().commit();
				//3. Close connection
				em.close();
				emf.close();
				
		return null;
	}

}
