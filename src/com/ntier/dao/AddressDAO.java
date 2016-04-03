package com.ntier.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.ntier.fff.Address;

public class AddressDAO extends AbstractDAO<Address> {

	@Override
	public Address add(Address entity) {
		Connection con=null;
		Statement stmnt=null;
		ResultSet rs = null;
		try {
			con = getConnection();
			stmnt = con.createStatement();
			String sql = "INSERT INTO Address (streetaddress, streetaddress2, city, state, zip)" +
			" VALUES ('" + entity.getStreetAddress() +"', '" + entity.getStreetAddress2() +"', '" + entity.getCity() +"', '" + entity.getState() +"', '" + entity.getZip() +"')";
			stmnt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			rs = stmnt.getGeneratedKeys();
			while(rs.next()){
				entity.setId(rs.getInt(1));
			}
			rs.close();
			stmnt.close();
			closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entity;
	}

	@SuppressWarnings("null")
	@Override
	public int delete(Address entity) {

		Connection con=null;
		Statement stmnt=null;
		ResultSet rs = null;
		int i = -1;
		try {
			con = getConnection();
			stmnt = con.createStatement();
			String sql = "DELETE FROM address WHERE user.id = " + entity.getId();
			i = stmnt.executeUpdate(sql);

			rs.close();
			stmnt.close();
			closeConnection(con);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	
	@Override
	public Collection<Address> find(Address entity) {
		Connection con=null;
		Statement stmnt=null;
		ResultSet rs = null;
		int colCount = 0;
		Collection<Address> addresses = new ArrayList<Address>();
		try {
			con = getConnection();
			stmnt = con.createStatement();
			String sql = "SELECT id, streetaddress, streetaddress2, city, state, zip FROM address WHERE ";

			if(entity.getId() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " id = '" + entity.getId() + "' " ;
				colCount++;
			}

			if(entity.getStreetAddress() != null && entity.getStreetAddress().length() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " streetaddress LIKE '" + entity.getStreetAddress() +  "'" ;
				colCount++;
			}
			if(entity.getStreetAddress2() != null && entity.getStreetAddress2() .length() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " streetaddress2 LIKE '" + entity.getStreetAddress2()  + "' " ;
				colCount++;
			}
			if(entity.getCity() != null && entity.getCity().length() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " city LIKE '" + entity.getCity()+ "' " ;
				colCount++;
			}
			if(entity.getState() != null && entity.getState() .length() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " state LIKE '" + entity.getState()  + "' " ;
				colCount++;
			}
			if(entity.getZip()!= null && entity.getZip().length() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " zip LIKE '" + entity.getZip()  + "' " ;
				colCount++;
			}
			
			rs = stmnt.executeQuery(sql);
			while(rs.next()){
				Address address= new Address();
				address.setId(rs.getInt("id"));
				address.setStreetAddress(rs.getString("streetaddress"));
				address.setStreetAddress2(rs.getString("streetaddress2"));
				address.setCity(rs.getString("city"));
				address.setState(rs.getString("state"));
				address.setZip(rs.getString("zip"));

				addresses.add(address);
			}

			rs.close();
			stmnt.close();
			closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return addresses;
	}
}
