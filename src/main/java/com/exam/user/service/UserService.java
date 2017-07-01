package com.exam.user.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exam.user.model.User;

@Service
@Transactional
public interface UserService
{
	public User getUserByEmail(String email);
	public void insert(User user);
	public void update(User user);
}
