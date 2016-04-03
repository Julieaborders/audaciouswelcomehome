package com.ntier.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.ntier.fff.User;

public class UserDAO extends AbstractDAO<User> {

	/* (non-Javadoc)
	 * @see com.ntier.fff.InterfaceDAO#add(java.lang.Object)
	 */
	@Override
	public User add(User entity) {
		Connection con=null;
		Statement stmnt=null;
		ResultSet rs = null;
		try {
			con = getConnection();
			stmnt = con.createStatement();
		
			String sql = "INSERT INTO User (fname,lname, email, password, phone)" +
			" VALUES ("
			+" '" + entity.getFname() +"', "
			+" '" + entity.getLname() +"', "
			+" '" + entity.getEmail() +"', "
			+" '" + entity.getPassword()+"',"
			+" '" + entity.getPhone() +"')";
			
			System.out.println(sql);
			stmnt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			rs = stmnt.getGeneratedKeys();
			while(rs.next()){
				entity.setId(rs.getInt(1));
			}
			rs.close();
			stmnt.close();
			closeConnection(con);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return entity;
	}

	@Override
	public int delete(User entity) {

		Connection con=null;
		Statement stmnt=null;
		int i = -1;
		try {
			con = getConnection();
			stmnt = con.createStatement();
			String sql = "DELETE FROM user WHERE user.id = " + entity.getId();
			i = stmnt.executeUpdate(sql);

			stmnt.close();
			closeConnection(con);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	
	@Override
	public Collection<User> find(User entity) {
		Connection con=null;
		Statement stmnt=null;
		ResultSet rs = null;
		int colCount = 0;
		Collection<User> users = new ArrayList<User>();
		try {
			con = getConnection();
			stmnt = con.createStatement();
			String sql = "SELECT id, fname, lname, email, password, phone FROM user WHERE ";

			if(entity.getId() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " id = '" + entity.getId() + "' " ;
				colCount++;
			}

			if(entity.getFname() != null && entity.getFname().length() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " fname LIKE '" + entity.getFname() +  "'" ;
				colCount++;
			}
			if(entity.getLname() != null && entity.getLname() .length() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " lname LIKE '" + entity.getLname()  + "' " ;
				colCount++;
			}
			if(entity.getEmail() != null && entity.getEmail().length() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " email LIKE '" + entity.getEmail()+ "' " ;
				colCount++;
			}
			if(entity.getPassword() != null && entity.getPassword() .length() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " password LIKE '" + entity.getPassword()  + "' " ;
				colCount++;
			}
			if(entity.getPhone() != null && entity.getPhone() .length() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " phone LIKE '" + entity.getPhone()  + "' " ;
				colCount++;
			}
			
			rs = stmnt.executeQuery(sql);
			while(rs.next()){
				User user= new User();
				user.setId(rs.getInt("id"));
				user.setFname(rs.getString("fname"));
				user.setLname(rs.getString("lname"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
			

				users.add(user);
			}

			rs.close();
			stmnt.close();
			closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}
}
