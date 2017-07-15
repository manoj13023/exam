package com.exam.user.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exam.user.model.User;
import com.exam.user.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserResource
{
	@Autowired
	private UserServiceImpl userSerive;

	@RequestMapping(method = RequestMethod.GET)
	public User getUser(@RequestParam(value = "email", required = true) String email)
	{
		return userSerive.getUserByEmail(email);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void saveUser(@RequestBody User user)
	{
		userSerive.insert(user);;
	}
}
