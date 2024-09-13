package com.satish.deleteQuery;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:"
				+ "//localhost:3306/mysql","root","8576");
		Statement st=con.createStatement();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Bonus Amount  :");
		//int bonus_Amount=Integer.parseInt(br.readLine());
		System.out.println("salary Range  :");
		float sal_range=Float.parseFloat(br.readLine());
		int rowCount=st.executeUpdate(
				"delete from employee where esal<"+sal_range);
		System.out.println("Employee Updated  :"+rowCount);
		con.close();

	}

}
