package com.cogent.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.cogent.model.Library;
import com.cogent.util.DbUtil;

public class DaoImpl implements Dao {
	
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	

	public void addBooks(Library library) {
		
		try {
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			String query = "insert into library values(" + library.getId() +", '" + library.getName() +"','" + library.getAuthor()+"')";
			System.out.println(query);
			stmt.executeUpdate(query);
			System.out.println("book added..");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DbUtil.closeResources(con, stmt);
		}

	}
		

	public List<Library> displayBooks() {
		
		try {
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			String query = "select * from library";
			rs = stmt.executeQuery(query);
			List<Library> lib = new ArrayList<Library>();
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String author = rs.getString(3);
				Library l = new Library(id, name, author);
				lib.add(l);
			}
			return lib;
			
		} catch (SQLException e) {
		
			e.printStackTrace();
			return null;
		}
		
		finally {
			DbUtil.closeResources(con, stmt, rs);
		}
	}

	public boolean updateBooks(int id, String name) {
		
		try {
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			String query = "update library set name = '" + name + "' where id = '" + id + "'";
			stmt.executeUpdate(query);
			System.out.println("book updated");
			return true;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			DbUtil.closeResources(con, stmt, rs);
		}
		
		
	
	}

	public void deleteBook(int id) {
		
		try {
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			String query = "delete from library where id = '" + id + "'";
			stmt.executeUpdate(query);
			System.out.println("book deleted...");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
