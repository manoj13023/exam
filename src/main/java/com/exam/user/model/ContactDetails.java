package com.exam.user.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.exam.model.EntityModel;

@Entity
@Table(name = "ContactDetails")
public class ContactDetails extends EntityModel
{
	@NotNull
	@Size(min = 3, max = 80)
	@Column(unique = true)
	private String email;
	
	@NotNull
	@OneToMany
	private List<Address> address;
	
	@NotNull
	@OneToMany
	private List<Phone> Phone;

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public List<Address> getAddress()
	{
		return address;
	}

	public void setAddress(List<Address> address)
	{
		this.address = address;
	}

	public List<Phone> getPhone()
	{
		return Phone;
	}

	public void setPhone(List<Phone> phone)
	{
		Phone = phone;
	}
	
	
}
