package com.satish.rset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Statement st=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/mysql","root","8576");
			st=con.createStatement();
			int rowCount=st.executeUpdate("select * from Employee");
			
		} catch (Exception e) {
			
		}

	}

}
