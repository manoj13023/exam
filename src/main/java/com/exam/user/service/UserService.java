package com.exam.user.service;

import org.springframework.stereotype.Service;

import com.exam.user.model.User;

@Service
public interface UserService
{
	public User getUserByEmail(String email);
}
