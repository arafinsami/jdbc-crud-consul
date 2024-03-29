package com.crud.service;

import java.sql.SQLException;
import java.util.List;

import com.crud.entity.Student;

public interface StudentService {
	
	public boolean save(Student student) throws SQLException;
	
	public boolean update(Student student) throws SQLException;
	
	public boolean delete(Student student) throws SQLException;
	
	public List<Student> getAll() throws SQLException;
}

