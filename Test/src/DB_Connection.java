import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB_Connection {

	public static void main(String[] args) {
		{
	        try{
	            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3308/loccms?useUnicode=true", "root", "password");

	            Statement mystmt = myConn.createStatement();

	            ResultSet myRs = mystmt.executeQuery("select * from loccms.user");

	            while (myRs.next()){
	                System.out.println(myRs.getString("username") + ", " + myRs.getString("display_name"));
	            }
	        }
	        catch (Exception ex){
	            ex.printStackTrace();
	        }
	    }

	}

}
