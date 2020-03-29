package database;



import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.*;

public class Database {


	static Connection conn=null;
	Statement st=null;
	ResultSet rs= null;
	


public Connection getConnection()throws Exception{
    
    
    try {
    	String drv="sun.jdbc.odbc.JdbcOdbcDriver";
    	Class.forName(drv);
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/travelplaner","root","");
    //JOptionPane.showMessageDialog(null, "Connected");
    
    return con;
    
    } 
    catch(SQLException ex){
    JOptionPane.showMessageDialog(null,ex);
    
    return null;
    
    
    }
   
    }

public Database() throws Exception {
	 conn=getConnection();
	 st= conn.createStatement();
	 rs=null;
	String s="select * from addplace";
	System.out.println("connected");
	rs=st.executeQuery(s);
	while( rs.next()){
		System.out.println("connected");
//	System.out.println(rs.getString(1));	
	}
	
}


public static void main(String [] args) throws Exception {
	
	new Database();
}}
