package exam;
import java.sql.*;
import java.util.Scanner;


public class Dictionary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
		final String DB="jdbc:mysql://localhost:3306/Dictionary";
		
		final String USER="anand";
		final String PWD="1234";
		
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			Class.forName(JDBC_DRIVER);
			con=DriverManager.getConnection(DB,USER,PWD);
			
			System.out.println("Enter the word to search:");
			String word=sc.next();
			
			ps=con.prepareStatement("select meaning from dictionary where word=?");
			
			ps.setString(1, word);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				String meaning=rs.getString("meaning");
				System.out.println("The meaning of the word "+word+ " is: "+meaning); 
			   } 
			else { 
			        System.out.println("Word " + word+ "Not found"); 
			       
			   }
		   }catch(SQLException e) {
			   e.printStackTrace();
		   }
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		

	}

}
