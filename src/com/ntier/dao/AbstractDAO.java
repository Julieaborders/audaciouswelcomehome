package com.ntier.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public abstract class AbstractDAO<T> implements InterfaceDAO<T> {
	
	
	public Connection getConnection() throws SQLException {
		
		MysqlDataSource msds = new MysqlDataSource();
		try{
			msds.setServerName("localhost");
			msds.setDatabaseName("fresh_food_finds");
			msds.setUser("imhotep");
			msds.setPassword("ase");
			
		} catch(Exception e){
			e.printStackTrace();
		}
		return msds.getConnection();
	}
	
	public void closeConnection(Connection conn){
        if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				conn = null;
			}
	}

}
