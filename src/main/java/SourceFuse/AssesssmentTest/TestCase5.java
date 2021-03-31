package SourceFuse.AssesssmentTest;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.testng.annotations.BeforeClass;
import com.mongodb.connection.Connection;

public class TestCase5 {
	 // Connection object
    static Connection con = null;
    // Statement object
    private static Statement stmt;
    // Constant for Database URL
    public static String DB_URL = "jdbc:mysql://localhost:3306/user";   
    // Constant for Database Username
    public static String DB_USER = "root";
    // Constant for Database Password
    public static String DB_PASSWORD = "root";

    @BeforeClass
    public void setUp() throws Exception {
           try{
                  // Make the database connection
                  String dbClass = "com.mysql.jdbc.Driver";
                  Class.forName(dbClass).newInstance();
                  // Get connection to DB
                  Connection con = (Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                  // Statement object to send the SQL statement to the Database
                  stmt = ((java.sql.Connection) con).createStatement();
                  }
                  catch (Exception e)
                  {
                        e.printStackTrace();
                  }
    }

    
    public void VerifyDBentry() {
           try{
           String query = "select * from userinfo";
           // Get the contents of userinfo table from DB
           ResultSet res = stmt.executeQuery(query);
           // Print the result untill all the records are printed
           // res.next() returns true if there is any next record else returns false
           while (res.next())
           {
                  System.out.print(res.getString(1));
           System.out.print("\t" + res.getString(2));
           System.out.print("\t" + res.getString(3));
           System.out.println("\t" + res.getString(4));
           }
           }
           catch(Exception e)
           {
                  e.printStackTrace();
           }     
    }

}
