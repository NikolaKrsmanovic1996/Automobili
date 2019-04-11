package Automobili;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Metode {
	
	private Connection konektujSe(String baza) throws SQLException{
		
	    final String url="jdbc:mysql://localhost:3306/" + baza +"?useSSL=false";
	    final String userName= "root";
		final String password= "root";
		
		
		
		
		return DriverManager.getConnection(url, userName, password);
		
		
	}
	
	
	
	

}
