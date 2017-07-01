package com.exam.user.service.retrieve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.exam.entity.operation.read.EntityReadOperation;
import com.exam.user.model.User;
import com.exam.user.service.UserService;

@Transactional
@Component
@Repository
public class UserServiceRetrieve implements UserService
{
	@Autowired
	private EntityReadOperation operation;
	
	@Override
	public User getUserByEmail(String email)
	{
		return operation.getByEmail(email, User.class.getSimpleName());
	}

	@Override
	public void insert(User user)
	{
		operation.insert(user);	
	}

	@Override
	public void update(User user)
	{
		User userDbInstance = operation.getByEmail(user.getEmail(), user.getClass().getSimpleName());
		userDbInstance.setName(user.getName());
		operation.save(userDbInstance);
	}
}
