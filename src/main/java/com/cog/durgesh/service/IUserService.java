package com.cog.durgesh.service;

import java.util.List;
import java.util.Optional;

import com.cog.durgesh.model.User;

public interface IUserService {

	void createUser(User user);
	List<User> getAllUsers();
	Optional<User> getOneUser(Integer Id);
}