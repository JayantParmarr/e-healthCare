import java.sql.*;  
class FetchRecord{  
	public static void mains()throws Exception{  

		try{  
			//Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/company","root","Jackieee@987");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from empolyee");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4)+"  "+rs.getInt(5));  
			con.close();  
		}catch(Exception e){ System.out.println(e);}   
	}
}  