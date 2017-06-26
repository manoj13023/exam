package com.exam.spring.boot.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController
{	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/")
	public String helloWorld()
	{
		return "Hello World !";
	}
	
	@RequestMapping("/employee")
	public List<Employee> getEmployee()
	{
        jdbcTemplate.update("INSERT INTO test(id, name, age) VALUES (?,?,?)",
                1, "manoj", 27);
        List<Employee> result = jdbcTemplate.query(
                "SE LECT id, name, age FROM test",
                (rs, rowNum) -> new Employee(rs.getString("name"), rs.getInt("age"))
        );
        return result;
	}
}
