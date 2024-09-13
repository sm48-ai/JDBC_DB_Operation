package com.satish.Execute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Test {

	public static void main(String[] args) throws Exception {
		Statement st=null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mysql","root","8576");
	    st=con.createStatement();
		int rs=st.executeUpdate
				("update employee set esal=esal+3000 where esal<70000");
		System.out.println(rs);
		int rowCount=st.getUpdateCount();
		System.out.println("Record updated :"+rowCount);
		con.close();
		

	}catch(Exception e) {
		e.printStackTrace();
	}

}}
