package com.exam.spring.boot.example;

public class Employee
{
	private String name;
	private int age;
	public Employee(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	

}