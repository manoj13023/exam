package com.exam.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.exam.entity.operation.read.EntityOperation;
import com.exam.user.model.User;
import com.exam.user.model.UserStatus;

@Transactional
@Component
@Repository
public class UserServiceImpl implements UserService
{
	@Autowired
	private EntityOperation operation;
	
	@Override
	public User getUserByEmail(String email)
	{
		return operation.getByEmail(email, User.class.getSimpleName());
	}

	@Override
	public void insert(User user)
	{
		user.setUserStatus(UserStatus.INITIATED);
		operation.insert(user);	
	}

	@Override
	public void update(User user)
	{
		User userDbInstance = operation.getByEmail(user.getContactDetails().getEmail(), user.getClass().getSimpleName());
		userDbInstance.setName(user.getName());
		// TODO apply all the user details from request
		operation.save(userDbInstance);
	}
}
