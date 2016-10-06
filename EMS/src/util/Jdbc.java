package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Jdbc {
public static Properties props = new Properties();
	static {
		FileInputStream file;
		try {
			file = new FileInputStream("dbDetails.properties");
			props.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String driver = props.getProperty("jdbc.driver");

	}

	public static Connection connection() throws SQLException {
		String url = props.getProperty("jdbc.url");

		Connection dbConnection;
		dbConnection = DriverManager.getConnection(url);

		System.out.println("Connection Successfult?" + (dbConnection != null));
		return dbConnection;
	}

}
