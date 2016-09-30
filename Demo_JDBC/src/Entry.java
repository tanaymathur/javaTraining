import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class Entry {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
// TODO LOAD JDBC PROPERTIES FROM FILE SYSTEM
		Properties props = new Properties();
		FileInputStream file = new FileInputStream("dbDetails.properties");
		props.load(file);
		
		
// TODO  Load  And Register JDBC DRIVER
    String driver = props.getProperty("jdbc.driver");
//	Class.forName(driver);
    
    
//TODO GET DATABASE CONNECTION USING JDBC URL
		
    String url= props.getProperty("jdbc.url");
    
    Connection dbConnection;
    dbConnection = DriverManager.getConnection(url);
    
    System.out.println("Connection Successfult?"+(dbConnection!=null));
    
    /*Statement insertStatement = null;
    try{
    insertStatement=dbConnection.createStatement();
    
    String insertQuery=props.getProperty("jdbc.query.insert");
    
    int rows;
    rows=insertStatement.executeUpdate(insertQuery);
    System.out.println(rows+"  record is(are) added successfully");
    }
    finally{
    	if(insertStatement!=null)
    		insertStatement.close();
    }*/
    
    try(Statement selectStatement = dbConnection.createStatement()){
    	String selectQuery = props.getProperty("jdbc.query.select");
    	
    	ResultSet result;
    	result=selectStatement.executeQuery(selectQuery);
    	
    	while(result.next()){
    		String message=result.getString(1);
    		System.out.println(message);
    	}
    }
    String insertQuery=props.getProperty("jdbc.query.parmeterizedInsert");
    try(PreparedStatement insertStatement=dbConnection.prepareStatement(insertQuery)){
    	
    	String msg = "THIS IS JAVA";
    	insertStatement.setString(1, msg);
    	insertStatement.executeUpdate();
       }
    
	}

}
