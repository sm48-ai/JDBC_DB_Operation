package com.satish.jdbc;
import  java.sql.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loading..........");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","8576");
		System.out.println("Connection establishing.........");
		Statement st=con.createStatement();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Table Name    :");
		String tname=br.readLine();
		String query="create table  "
		+tname+" ( ENO int,ENAME varchar(10), ESAL float(10),EADDR varchar(10) )";
		st.executeUpdate(query);
		System.out.println("Table"  +"  "+tname+ "  "+"is Created Successfully");
		st.close();
		con.close();
		

	}



	}
