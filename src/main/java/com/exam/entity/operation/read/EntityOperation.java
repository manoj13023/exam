package com.exam.entity.operation.read;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.model.EntityModel;
import com.exam.user.model.User;

@Repository
public class EntityOperation
{
	@Autowired
	private SessionFactory _sessionFactory;

	private Session getSession()
	{
		return _sessionFactory.getCurrentSession();
	}

	@Transactional(rollbackOn = Exception.class)
	public void insert(EntityModel entity)
	{
		getSession().save(entity);
		return;
	}
	
	@Transactional
	public void delete(User user)
	{
		getSession().delete(user);
		return;
	}

	@SuppressWarnings("unchecked")
	public List<User> getAll()
	{
		return getSession().createQuery("from User").list();
	}

	public User getByEmail(String email, String entityName)
	{
		return (User) getSession().createQuery("from " + entityName + " where contactDetails.email = :email")
				.setParameter("email", email).uniqueResult();
	}

	public User getById(long id)
	{
		return (User) getSession().load(User.class, id);
	}

	@Transactional
	public void update(User user)
	{
		getSession().update(user);
	}

	@Transactional
	public void save(User user)
	{
		getSession().saveOrUpdate(user);
	}
}
