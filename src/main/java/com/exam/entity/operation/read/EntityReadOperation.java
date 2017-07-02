package com.exam.entity.operation.read;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.model.EntityModel;
import com.exam.user.model.User;

@Repository
public class EntityReadOperation
{
	@Autowired
	private SessionFactory _sessionFactory;

	private Session getSession()
	{
		return _sessionFactory.getCurrentSession();
	}

	public void insert(EntityModel entity)
	{
		getSession().save(entity);
		return;
	}

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

	public void update(User user)
	{
		getSession().update(user);
	}

	public void save(User user)
	{
		getSession().saveOrUpdate(user);
	}
}
