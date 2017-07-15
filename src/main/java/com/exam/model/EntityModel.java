package com.exam.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.exam.user.model.Name;
import com.exam.user.model.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@MappedSuperclass
public class EntityModel
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	protected long id;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonIgnore
	protected Date modified;

	@OneToOne
	@JsonIgnore
	protected User modifiedBy;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public Date getModified()
	{
		return modified;
	}

	public void setModified(Date modified)
	{
		this.modified = modified;
	}

	public User getModifiedBy()
	{
		return modifiedBy;
	}

	public void setModifiedBy(User modifiedBy)
	{
		this.modifiedBy = modifiedBy;
	}

}
