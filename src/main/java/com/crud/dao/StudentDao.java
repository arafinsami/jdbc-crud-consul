package com.crud.dao;

import java.sql.SQLException;
import java.util.List;

import com.crud.entity.Student;

public interface StudentDao {

	public boolean save(Student student) throws SQLException;
	
	public boolean update(Student student) throws SQLException;
	
	public boolean delete(Student student) throws SQLException;
	
	public List<Student> getAll() throws SQLException;
	
}
