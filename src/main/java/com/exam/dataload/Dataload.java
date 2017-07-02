package com.exam.dataload;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.exam.entity.operation.read.EntityReadOperation;
import com.exam.model.EntityModel;
import com.exam.user.model.Address;
import com.exam.user.model.ContactDetails;
import com.exam.user.model.Name;
import com.exam.user.model.Phone;
import com.exam.user.model.User;
import com.exam.user.model.UserStatus;
import com.exam.user.model.UserType;

public class Dataload
{
	@Autowired
	private EntityReadOperation entityOperation;

	public static void main(String[] args)
	{
		Dataload dataload = new Dataload();
		dataload.entityOperation.insert(dataload.prepareUser());
	}

	public EntityModel prepareUser()
	{
		User user = new User();
		user.setUsername("manoj13023");
		user.setPassword("test");
		user.setName(prepareName());
		user.setModified(new Date());
		user.setUserStatus(UserStatus.ACTIVE);
		user.setUserType(UserType.ADMIN);
		user.setContactDetails(prepareContactDetails());
		user.setModifiedBy(user);

		return user;
	}

	private ContactDetails prepareContactDetails()
	{
		ContactDetails contactDetails = new ContactDetails();
		contactDetails.setAddress(prepareAddress());
		contactDetails.setEmail("manoj13023@gmail.com");
		contactDetails.setPhone(preparePhone());

		return contactDetails;
	}

	private List<Phone> preparePhone()
	{
		Phone phone = new Phone();
		phone.setCountryCode("+91");
		phone.setNumber(9876543210L);
		return Arrays.asList(phone);
	}

	private List<Address> prepareAddress()
	{
		Address address = new Address();
		address.setAddressLine1("48, DEL RES");
		address.setAddressLine2("1st cross road");
		address.setCity("Bangalore");
		address.setState("KT");
		address.setCountry("India");
		address.setZipcode("13123");
		
		return Arrays.asList(address);
	}

	private Name prepareName()
	{
		Name name = new Name();
		name.setFirstName("Manoj");
		name.setLastName("Kumar");
		return name;
	}

}
