package com.satish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class UserService {
	Connection con;
	Statement st;
	Resultset rs;
	String status="";
	public UserService() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/mysql","root","8576");
			st=con.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public String checkLogin(String uname,String  upwd) {
		try {
			st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Registered_User"
					+ " where uname='"+uname+"' and upwd='"+upwd+"'");
			boolean b=rs.next();
			if(rs.next()) {
				status="Logion Success";
			}else {
				status="Login Failure";
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
		
	}

}
