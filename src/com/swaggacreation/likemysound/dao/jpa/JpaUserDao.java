package com.swaggacreation.likemysound.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.swaggacreation.likemysound.dao.UserDao;
import com.swaggacreation.likemysound.entity.User;



public class JpaUserDao implements UserDao {
	private EntityManagerFactory emf;
	public  JpaUserDao(EntityManagerFactory emf) {
		super();
		this.emf=emf;
	}
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User getUserById(long UserId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addUser(User user) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
		} finally {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			em.close();
		}
		
	}
	@Override
	public void removeUser(long userId) {
		// TODO Auto-generated method stub
		
	}
	
}
