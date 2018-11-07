package com.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.app.bean.Student;

public interface StudentDAO {
	
	//void registration(String univ_no, String gender, String name);
//create
	List<Student> getAllStudents();
//getAllStudents	
	
	void registrationStudent(Student e) throws SQLException;

	
}
