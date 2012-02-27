package com.swaggacreation.likemysound.dao;

import java.util.List;

import com.swaggacreation.likemysound.entity.User;

public interface UserDao{
	public List<User> getAllUser();
	public User getUserById(long UserId);
	public void addUser(User campus);
	public void removeUser(long campusId);
}
