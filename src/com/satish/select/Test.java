package com.satish.select;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
		 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=
			DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","8576");
			Statement st=con.createStatement();
			ResultSet rowCount=st.executeQuery("select * from Employee");
		
				ResultSet rs=st.getResultSet();
				String data="";
				data=data+"<html><body><center><table border='1' bgcolor='lightblue'";
				data=data+"<tr><td>ENO</td><td>ENAME</td><td>ESAL</td><td>EADDR</td></tr>";
				System.out.println("ENO\tENAME\tESAL\tEADDR");
				System.out.println("-----------------------------");
				while(rs.next()) {
					data=data+"<tr>";
					data=data+"<td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"
							+rs.getFloat(3)+"</td><td>"+rs.getString(4)+"</td>";
					data=data+"</tr>";
					
				}
				data=data+"</table></center></body></html>";
				FileOutputStream fos=new FileOutputStream("E:/document/emp.html",true);
				byte[] b=data.getBytes();
				fos.write(b);
				System.out.println("Open E:/document emp.html file to get Employee data");
				fos.close();
				con.close();
	}
}