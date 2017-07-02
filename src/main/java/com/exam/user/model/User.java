package com.exam.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.exam.model.EntityModel;

@Table
@Entity
public class User extends EntityModel
{
	@NotNull
	@Size(min = 5, max = 20)
	@Column(unique = true)
	private String username;
	
	@NotNull
	@Size(min = 8, max = 30)
	private String password;

	@NotNull
	@OneToOne
	private Name name;
	
	@NotNull
	@OneToOne
	private ContactDetails contactDetails;
	
	@NotNull
	private UserStatus userStatus;
	
	@NotNull
	private UserType userType;

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public Name getName()
	{
		return name;
	}

	public void setName(Name name)
	{
		this.name = name;
	}

	public ContactDetails getContactDetails()
	{
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails)
	{
		this.contactDetails = contactDetails;
	}

	public UserStatus getUserStatus()
	{
		return userStatus;
	}

	public void setUserStatus(UserStatus userStatus)
	{
		this.userStatus = userStatus;
	}

	public UserType getUserType()
	{
		return userType;
	}

	public void setUserType(UserType userType)
	{
		this.userType = userType;
	}
}
