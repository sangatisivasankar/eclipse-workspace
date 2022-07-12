package com.sapient.endur.util;

import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLConnection {	
	private static Properties properties=null;
	
	//Load MySQL driver explicitly for downward compatibility
	static {				
		try {
			properties= new Properties();
			Reader reader= 
					new FileReader("C:\\Users\\Admin\\sfcc3-ws\\emp-management-app\\src\\main\\resource\\jdbc.properties");
			properties.load(reader);
			
			Class.forName(properties.getProperty("db.driver.name"));
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		return DriverManager
				.getConnection(properties.getProperty("db.conn.url"),
						properties.getProperty("db.username"), 
						properties.getProperty("db.password"));
	}
}
