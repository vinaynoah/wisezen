package com.fboy.wisezen.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Statement;
import com.mysql.jdbc.Driver;

public class DbManager {
	private static final String USER = "test";
	private static final String PASS = "test";
	String DB_URL = "jdbc:mysql://localhost:3306/test";
	
	
	//String DB_URL = "jdbc:mysql://127.0.0.1:3306/test" ;
	//private Connection con = null;
	private Connection con = null;
	private java.sql.Statement stmt = null;
	private ResultSet rs = null;
	static Logger log = Logger.getLogger(DbManager.class.getName());
	
	
	private Connection getConnection() {
		try {
			log.info("loading mysql driver");
			Class.forName("com.mysql.jdbc.Driver");		
		}
		catch(Exception x){
			System.out.println( "Unable to load the driver class!");
			log.info(x.toString());
		}	

		try {
			System.out.println("Connecting to database...");
			log.info("Connecting to db with parameters URL : " + DB_URL + " USER NAME " + USER );
			con = DriverManager.getConnection(DB_URL,USER,PASS);
		} catch (SQLException e) {
			System.out.println("Connection to database failed");
			e.printStackTrace();
		}
		return con;
	}
	
	
	public ResultSet insert(String query) {
		 try {
			 	stmt =  con.createStatement();
				//ResultSet rs = stmt.executeQuery(query);
				rs = stmt.executeQuery(query);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				return rs;
	}
	
	public ResultSet select(String query) {
		try {
			this.con = this.getConnection();
			stmt =  con.createStatement();
			System.out.println("executing query \"" + query + "\"");
			//ResultSet rs = stmt.executeQuery(query);
			rs = stmt.executeQuery(query);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return rs;
	}
	
	public void update(String stmt) {
		
		//Assignment
		
	}
	
public static boolean delete(String stmt) {
	return false;
	}
	
	public void closeResource() {
		if(this.stmt != null){
			try {
				this.stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(this.con != null){
			try {
				this.con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
}
