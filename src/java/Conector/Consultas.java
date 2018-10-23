/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Consultas extends Conexion{
 
    public boolean Autentificacion(String Usuario, String Password) throws SQLException{
     
     PreparedStatement pst = null;
          ResultSet rs = null;
        try{
          String Consulta="Select * from usuario where Usuario = ? and Password = ?";
          pst = getConexion().prepareStatement(Consulta);
          pst.setString(1, Usuario);
          pst.setString(2, Password);
          rs = pst.executeQuery();
          if(rs.absolute(1)){
             return true;
          }
        }catch(SQLException e){
      System.err.println("Error "+e);
     }finally{
        if(getConexion()!=null){
           getConexion().close();
        }
        if(pst!=null){
           pst.close();
        }
        if(rs!=null){
           rs.close();
        }
     }
      return false;
    
     
    }
    public boolean Registrar(String Nombre,String Apellidos,String Usuario,String Password){
      PreparedStatement  pst = null;
        String Consulta="insert into usuario(Nombre,Apellidos,Usuario,Password) values(?,?,?,?)";
        try {
            pst = this.getConexion().prepareStatement(Consulta);
            pst.setString(1, Nombre);
            pst.setString(2, Apellidos);
            pst.setString(3, Usuario);
            pst.setString(4, Password);
            
            if (pst.executeUpdate()==1){
              return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
      try{
            if(getConexion()!=null){
           getConexion().close();
        }
        if(pst!=null){
           pst.close();
        }
      }catch(Exception e){System.err.println("Error"+ e);}
        }
        return false;
    }
 
  
    public static void main(String[] args){
        Consultas c = new Consultas();
        System.out.println(c.Registrar("Jancer ","Onil Rodriguez","MaricaCracks", "Mariquita"));
    
    }
}
