/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

public class BonoDescuento {
    public double Bono;
    public  double Descuento;
    public String Descripcion;
    public String Nombre_Empleado;
    
    public BonoDescuento(String nombre_empleado,double bono,double descuento, String descripcion){
     this.Bono = bono;
     this.Descuento = descuento;
     this.Descripcion = descripcion;
     this.Nombre_Empleado = nombre_empleado;
    }

    public String getNombre_Empleado() {
        return Nombre_Empleado;
    }

    public void setNombre_Empleado(String Nombre_Empleado) {
        this.Nombre_Empleado = Nombre_Empleado;
    }

  

    public double getBono() {
        return Bono;
    }

    public void setBono(int Bono) {
        this.Bono = Bono;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(int Descuento) {
        this.Descuento = Descuento;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
}
