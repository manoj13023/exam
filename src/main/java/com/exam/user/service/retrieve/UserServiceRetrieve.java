package com.exam.user.service.retrieve;

import org.springframework.transaction.annotation.Transactional;

import com.exam.user.model.User;
import com.exam.user.service.UserService;

@Transactional
public class UserServiceRetrieve implements UserService
{
	@Override
	public User getUserByEmail(String email)
	{
		User user = new User();
		user.setEmail(email);
		user.setName("Manoj");
		return user;
	}
}
