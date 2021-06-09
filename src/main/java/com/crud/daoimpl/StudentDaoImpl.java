package com.crud.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.crud.dao.StudentDao;
import com.crud.entity.Student;
import com.crud.utils.Dabaseutils;

public class StudentDaoImpl implements StudentDao {

	@Override
	public boolean save(Student student) throws SQLException {
		Connection connection = Dabaseutils.connect();
		String query = "INSERT into student(name,email) VALUES(?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, student.getName());
		preparedStatement.setString(2, student.getEmail());

		boolean row = preparedStatement.executeUpdate() > 0;
		return row;
	}

	@Override
	public List<Student> getAll() throws SQLException {

		List<Student> list = new ArrayList<Student>();

		Connection connection = Dabaseutils.connect();
		String query = "SELECT * FROM student";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		ResultSet rs = preparedStatement.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String email = rs.getString("email");
			list.add(new Student(id, name, email));
		}
		return list;
	}

	@Override
	public boolean update(Student student) throws SQLException {

		Connection connection = Dabaseutils.connect();
		String query = "UPDATE student SET name = ?, email = ?  WHERE id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, student.getName());
		preparedStatement.setString(2, student.getEmail());
		preparedStatement.setInt(3, student.getId());
		boolean row = preparedStatement.executeUpdate() > 0;
		return row;
	}

	@Override
	public boolean delete(Student student) throws SQLException {
		Connection connection = Dabaseutils.connect();
		String query = "DELETE FROM student WHERE id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, student.getId());
		boolean row = preparedStatement.executeUpdate() > 0;
		return row;
	}

}
