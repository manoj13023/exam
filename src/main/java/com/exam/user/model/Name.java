package com.exam.user.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.exam.model.EntityModel;

@Entity
@Table
public class Name extends EntityModel
{
	@NotNull
	@Size(min = 3, max = 20)
	private String firstName;
	
	@Size(min = 3, max = 20)
	private String middleName;
	
	@NotNull
	@Size(min = 3, max = 20)
	private String lastName;

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getMiddleName()
	{
		return middleName;
	}

	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	
}
