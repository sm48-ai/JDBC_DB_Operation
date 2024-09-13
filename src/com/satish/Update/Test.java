package com.satish.Update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
		Statement st=null;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/mysql","root","8576");
			st=con.createStatement();
			ResultSet rs=st.executeQuery
					("update employee set esal=esal+9000 where esal<70000");
			int rowCount=((Statement) rs).getUpdateCount();
			System.out.println("Row Count :"+rowCount);


	}

}
