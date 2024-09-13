package com.satish.DropTable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","8576");
		Statement st=con.createStatement();
		int rowCount1=st.executeUpdate("create table emp1(eno int)");
		System.out.println(rowCount1);
		int rowCount2=st.executeUpdate("drop table emp1");
		System.out.println(rowCount2);
		con.close();

	}

}
