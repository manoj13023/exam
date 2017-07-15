package com.exam.user.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class ContactDetails
{
	@NotNull
	@Size(min = 3, max = 80)
	@Column(unique = true)
	private String email;

	@NotNull
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Address> address;

	@NotNull
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Phone> phone;

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
		return phone;
	}

	public void setPhone(List<Phone> phone)
	{
		this.phone = phone;
	}

}
