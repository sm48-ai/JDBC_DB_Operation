package com.satish.fetchdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Test {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mysql","root","8576");
		Statement st=con.createStatement();
		Resultset rs=(Resultset) st.executeQuery("select * from Employee");
		System.out.println("ENO\t ENAME\t ESAL\t EADDR");
		System.out.println("----------------------");
		while(((ResultSet) rs).next()) {
			int id=((ResultSet) rs).getInt(1);
			String name=((ResultSet) rs).getString(2);
			Float f=((ResultSet) rs).getFloat(3);
			String add=((ResultSet) rs).getString(4);
			System.out.println(id+"\t"+name+"\t"+f+"\t"+add);
		}
		con.close();

	}

}
