package com.swaggacreation.likemysound.dao;

import com.swaggacreation.likemysound.dao.jpa.JpaUserDao;
import com.swaggacreation.likemysound.util.PersistenceManager;


public class DaoFactory {

	private DaoFactory() {
		super();
	}
	public static JpaUserDao getUserDao() {
		return new JpaUserDao(PersistenceManager.getEmf());
	}
	
}

