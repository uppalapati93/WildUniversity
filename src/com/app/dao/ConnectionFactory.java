package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;



public class ConnectionFactory {

	public  String URL = "jdbc:mysql://localhost:3306/registration";
    public  String USER = "root";
    public  String PASS = "admin";
    
    public Connection getConnection()
    {
      try {
          DriverManager.registerDriver(new Driver());
          return DriverManager.getConnection(URL, USER, PASS);
      } catch (SQLException ex) {
          throw new RuntimeException("Error connecting to the database", ex);
      }
    }
	
	
}
