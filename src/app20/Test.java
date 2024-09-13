package app20;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Test {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:"
				+ "//localhost:3306/mysql","root","8576");
		Statement st=con.createStatement();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.print("Employee Number  :");
			int eno=Integer.parseInt(br.readLine());
			System.out.print("Employee name  :");
			String Ename=br.readLine();
			System.out.print("Employee Salary  :");
			float esal=Float.parseFloat(br.readLine());
			System.out.print("Employee Address  :");
			String eaddr=br.readLine();
			
			st.executeUpdate("insert into employee values("+eno+", '"+Ename+"', "+esal+", '"+eaddr+"')" );
			System.out.println("Employee inserted Successfully");
			System.out.println("One More Employee [YES/NO]:");
			String option=br.readLine();
			if(option.equals("no")) {
				break;
			}
		}
		con.close();

	}

}
