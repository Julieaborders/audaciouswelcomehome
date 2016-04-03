package com.ntier.dao;

import java.sql.Connection;
import com.ntier.fff.*;
import java.sql.DriverManager;

abstract public class DBConnect implements DAOInterface {

	public static void main(String[] args) { 
	}
	public static Connection getConnection() throws Exception{
		Connection connect = null;
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/Fresh_Food_Finds";
			String username = "imhotep";
			String password = "ase";
			Class.forName(driver).newInstance();
			connect = DriverManager.getConnection(url, username, password);
			System.out.println("Database Connection Successful!");
		} catch (ClassNotFoundException e) {
			System.out.println("Unable to load driver");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return connect;
	}
	
}
