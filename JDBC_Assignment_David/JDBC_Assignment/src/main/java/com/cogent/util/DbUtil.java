package com.cogent.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
		
	}
	public static void closeResources(Connection con, Statement stmt) {
		
		try {
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		
		} catch(SQLException e) {
			
		}
		
	}
	public static void closeResources(Connection con, Statement stmt, ResultSet rs) {
		
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
