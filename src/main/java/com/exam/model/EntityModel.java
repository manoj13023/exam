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

import com.exam.user.model.User;

@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
public class EntityModel
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected long id;
	
	@DateTimeFormat
	protected Date modified;
	
	@OneToOne
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
