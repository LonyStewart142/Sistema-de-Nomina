/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento;
 import Bean.Empleado;
 import Conector.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrudEmpleado  extends Conexion{
  
    public boolean GuardarEmpleado(Empleado nuevo){
      PreparedStatement pst =null;
      String sql="insert into empleado(Cedula,Nombres,Apellidos,Telefono,Hijos,Sexo,Estado_Civil,Direccion,Cargo,Sueldo,Estado) values(?,?,?,?,?,?,?,?,?,?,?)";
       try{
         pst = this.getConexion().prepareStatement(sql);
         pst.setString(1,nuevo.getCedula());
         pst.setString(2, nuevo.getNombres());
         pst.setString(3, nuevo.getApellidos());
         pst.setString(4, nuevo.getTelefono());
         pst.setInt(5, nuevo.getHijos());
         pst.setString(6, nuevo.getSexo());
         pst.setString(7, nuevo.getEstadoCivil());
         pst.setString(8, nuevo.getDireccion());
         pst.setString(9, nuevo.getCargo());
         pst.setInt(10, nuevo.getSueldo());
         pst.setString(11, nuevo.getEstado());
       
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
     public boolean Guardarnomina(Nomina nuevo){
      PreparedStatement pst =null;
      String sql="insert into nommina(Nombre,SueldoBase,SueldoNeto,SFS,AFP,ISR) values(?,?,?,?,?,?)";
       try{
         pst = this.getConexion().prepareStatement(sql);
         pst.setString(1,nuevo.getNombre());
         pst.setDouble(2, nuevo.getSueldo());
         pst.setDouble(3, nuevo.getSueldoNeto());
           pst.setDouble(4, nuevo.getSFS());
            pst.setDouble(5, nuevo.getAFP());
              pst.setDouble(6, nuevo.getISR());
       
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
    public boolean EliminarEmpleado(Empleado Eliminar){
       PreparedStatement pst =null;
       String sql="delete from empleado where id=?";
       try{
         pst = this.getConexion().prepareStatement(sql);
         pst.setInt(1, Eliminar.getId());
         pst.executeUpdate();
          if(pst.executeUpdate()==1){
         return true;
         }
       }catch(Exception e){System.err.println("error"+ e);}finally{
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
        public boolean ModificarEmpleado(Empleado Modificar){
       PreparedStatement pst =null;
       String sql= "UPDATE empleado SET Estado=? where Nombres=?";
       try{
         pst = this.getConexion().prepareStatement(sql);
           pst = this.getConexion().prepareStatement(sql);
         pst.setString(1,Modificar.getEstado());
         pst.setString(2,Modificar.getNombres());
         pst.executeUpdate();
          if(pst.executeUpdate()==1){
         return true;
         }
       }catch(Exception e){System.err.println("error"+ e);}finally{
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
        try {
            Conexion c=new Conexion();
            Statement st=null;
            String sql="select * from empleado where estado='Espera'";
            try {
                st = c.getConexion().createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(CrudEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
            ResultSet rs = st.executeQuery(sql);
            try {
                while(rs.next()){
                 String nombre =rs.getString(3);
                 double sueldo=Double.valueOf(rs.getString(11));
                 Nomina n =new Nomina(sueldo);
                double sueldoneto= n.calcularSueldoNeto(sueldo);
                double sfs = n.calcularSFS(sueldo);
                double afp =n.calcularAFP(sueldo);
                double irs=n.calcularIRS(sueldo);
                Nomina nc =new Nomina(nombre,sueldo,sueldoneto,sfs,afp,irs);
                 CrudEmpleado cee =new CrudEmpleado();
                 cee.Guardarnomina(nc);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CrudEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CrudEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
     }   
}
