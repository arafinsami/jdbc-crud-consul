package com.crud.serviceimpl;

import java.sql.SQLException;
import java.util.List;

import com.crud.dao.StudentDao;
import com.crud.daoimpl.StudentDaoImpl;
import com.crud.entity.Student;
import com.crud.service.StudentService;

public class StudentServiceImpl implements StudentService {

	private StudentDao dao = new StudentDaoImpl();

	@Override
	public boolean save(Student student) throws SQLException {
		return dao.save(student);
	}

	@Override
	public List<Student> getAll() throws SQLException {
		return dao.getAll();
	}

	@Override
	public boolean update(Student student) throws SQLException {
		return dao.update(student);
	}

	@Override
	public boolean delete(Student student) throws SQLException {
		return dao.delete(student);
	}

}
