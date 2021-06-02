package com.crud;

import java.sql.SQLException;

import com.crud.entity.Student;
import com.crud.service.StudentService;

public class JdbcApp {

	public static void main(String[] args) throws SQLException {
		
		Student student = new Student();
		student.setName("Nafim");
		student.setEmail("nafim@gmail.com");
		
		StudentService.save(student);
		
		
	}

}
