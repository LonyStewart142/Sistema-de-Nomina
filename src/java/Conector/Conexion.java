/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private String Username = "Lonys";
    private String Password = "Lafamilia7686";
    private String port =  "3306";
    private String  host  = "localhost";
    private String DataBase = "nominax";
    private String ClassName= "com.mysql.jdbc.Driver";
    private String Url="jdbc:mysql://"+host+":"+port+"/"+DataBase;
    private Connection cn;
    
    public Conexion(){
 
        try {
               Class.forName(ClassName);
            cn = DriverManager.getConnection(Url, Username, Password);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public Connection getConexion(){
     return cn;
    
    }
    public static void main (String[] args){
     Conexion cn = new Conexion();  
    }
    
    
}
