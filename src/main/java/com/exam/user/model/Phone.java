package com.exam.user.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import com.exam.model.EntityModel;

@Entity
public class Phone extends EntityModel
{
	@NotNull
	private PhoneType phoneType;
	@NotNull
	private String countryCode;

	@NotNull
	private Long number;

	public String getCountryCode()
	{
		return countryCode;
	}

	public void setCountryCode(String countryCode)
	{
		this.countryCode = countryCode;
	}

	public Long getNumber()
	{
		return number;
	}

	public void setNumber(Long number)
	{
		this.number = number;
	}

	public PhoneType getPhoneType()
	{
		return phoneType;
	}

	public void setPhoneType(PhoneType phoneType)
	{
		this.phoneType = phoneType;
	}

}
