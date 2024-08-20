package com.SQL_server_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQL_server_connection {
	public static void main(String args[]) throws ClassNotFoundException
	{
		try
		{
			String connectionURL="jdbc:sqlserver://WIN2019;Databases=movie_online_ticket;integratedSecurity=true;encrypt=false";
			Connection conn=DriverManager.getConnection(connectionURL);
			System.out.println("The connection has been succesfully established");
		}
		catch(SQLException e)
		{
			System.out.println("Connection failed");
			e.printStackTrace();
		}
	}
}
