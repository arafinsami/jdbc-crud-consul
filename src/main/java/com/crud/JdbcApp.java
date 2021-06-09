package com.crud;

import java.sql.SQLException;

import com.crud.entity.Student;
import com.crud.service.StudentService;
import com.crud.serviceimpl.StudentServiceImpl;

public class JdbcApp {

	public static void main(String[] args) throws SQLException {
		
		Student student = new Student();
		student.setId(1);
		student.setName("Nafisa");
		student.setEmail("nafisa@gmail.com");
		
		StudentService service = new StudentServiceImpl();
		
		//service.save(student);
		//service.update(student);
		service.delete(student);
		
		//System.out.println(service.getAll());
		
	}

}
