package com.collabera.day19_maven;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTestApp {

	public static void main(String[] args) {
		
		
		Connection conn = null;
		
		try {
			
			conn = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost:3306/world", "root", "991335323");
			
				if(conn!=null) {	
					System.out.println("mysql connection successfully acquired!");	
				}
				
				String sql = "select * from city";
				PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();
				
				while(rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));	
				}
				
				rs.close();
				conn.close();
				
		}catch (Exception ex) {
			
			System.out.println(ex.getMessage());
		}
		

	}

}
