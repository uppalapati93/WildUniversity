package com.app.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.app.bean.Student;

public class StudentDAOImpl implements StudentDAO {

	ConnectionFactory factory = new ConnectionFactory();
	Connection con = null;

	@Override
	public void registrationStudent(Student e) throws SQLException {

		con = factory.getConnection();
		String name = e.getName();
		String gender = e.getGender();
		int univ_num = e.getUniv_num();
		String query = "insert into student values('" + name + "','"  + gender + "'," + univ_num + ")";

		Statement stmt = con.createStatement();
		stmt.executeUpdate(query);
		

		con.close();
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> list = new ArrayList<Student>();
		con = factory.getConnection();
		String query = "select * from student";
		try {
			Statement stmt= con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				String name = rs.getString(1);
				String gender = rs.getString(2);
				int univ_num = rs.getInt(3); 
				Student e = new Student(name, gender, univ_num);
				list.add(e);
				
			}
			
			return list;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return null;
	}
}


