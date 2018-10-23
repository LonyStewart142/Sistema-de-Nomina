/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento;

import Bean.BonoDescuento;
import Bean.Empleado;
import Conector.Conexion;
import java.sql.PreparedStatement;

/**
 *
 * @author LonyStewart
 */


public class CrudBonoDescuento extends Conexion {
  public boolean GuardarBonoDescuento(BonoDescuento nuevo){
      PreparedStatement pst =null;
      String sql="insert into bonos_descuentos2(NombreEmpleado,Bonos,Descuentos,Descripcion) values(?,?,?,?)";
       try{
         pst = this.getConexion().prepareStatement(sql);
         pst.setString(1,nuevo.getNombre_Empleado());
         pst.setDouble(2,nuevo.getBono());
         pst.setDouble(3, nuevo.getDescuento());
          pst.setString(4, nuevo.getDescripcion());
         if(pst.executeUpdate()==1){
         return true;
         }
         
       }catch(Exception e){System.err.println("Error"+e);}finally{
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

 
}
