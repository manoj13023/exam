package com.exam.user.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exam.user.model.User;
import com.exam.user.service.retrieve.UserServiceRetrieve;

@RestController
@RequestMapping("/user")
public class UserResource
{
	@Autowired
	private UserServiceRetrieve userSerive;

	@RequestMapping(method = RequestMethod.GET)
	public User getUser(@RequestParam(value = "email", required = true) String email)
	{
		return userSerive.getUserByEmail(email);
	}
}
