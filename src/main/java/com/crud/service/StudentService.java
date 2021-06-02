package com.crud.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.crud.entity.Student;
import com.crud.utils.Dabaseutils;

public class StudentService {

	public static boolean save(Student student) throws SQLException {

		Connection connection = Dabaseutils.connect();
		String query = "INSERT into student(name,email) VALUES(?,?)";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, student.getName());
		preparedStatement.setString(2, student.getEmail());

		boolean row = preparedStatement.executeUpdate() > 0;
		return row;
	}
}
