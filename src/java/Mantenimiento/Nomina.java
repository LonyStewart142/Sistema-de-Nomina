/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento;

import Bean.Empleado;

public class Nomina {
 public String Nombre;
public double SueldoBase;
public double SueldoNeto;
public double SFS;
public double AFP;
public double ISR;
public double Sueldo;

public Nomina(String nombre,double sueldobase,double sueldoneto,double sfs ,double afp,double isr){
this.Nombre =nombre;
this.SueldoBase = sueldobase;
this.SueldoNeto=sueldoneto;
this.SFS =sfs;
this.AFP = afp;
this.ISR=isr;

}
public Nomina(double sueldo){
   this.Sueldo= sueldo;
}

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(double SueldoBase) {
        this.SueldoBase = SueldoBase;
    }

    public double getSueldoNeto() {
        return SueldoNeto;
    }

    public void setSueldoNeto(double SueldoNeto) {
        this.SueldoNeto = SueldoNeto;
    }

    public double getSFS() {
        return SFS;
    }

    public void setSFS(double SFS) {
        this.SFS = SFS;
    }

    public double getAFP() {
        return AFP;
    }

    public void setAFP(double AFP) {
        this.AFP = AFP;
    }

    public double getISR() {
        return ISR;
    }

    public void setISR(double ISR) {
        this.ISR = ISR;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public double calcularAFP(double sueldo)
    {   
        this.Sueldo =sueldo;
        if (Sueldo > 172900)
        {
            AFP = 4962;
        } else {
            AFP = Sueldo * 0.0287;
        }
        
        return AFP;
    }
    
    public double calcularSFS(double sueldo)
    {   
       this.Sueldo = sueldo;
        if(Sueldo > 56450)
        {
            SFS = 2628;
        } else {
            SFS = Sueldo * 0.0304;
        }
        
        return SFS;
    }
    
    public double calcularIRS(double sueldo)
            
    {
         this.Sueldo=sueldo;
        double sueldoAnual = 0;
        sueldoAnual = (Sueldo * 12);
        
        if(sueldoAnual > 567123)
        {
            ISR = (79776+((sueldoAnual-567123)*0.25))/12;
        } 
        else if(sueldoAnual > 624329) 
        {
            ISR = (31216 + ((sueldoAnual - 624329)*0.2))/12;
        }
        else if (sueldoAnual > 416220)
        {
            ISR = ((sueldoAnual - 416220)*0.15)/12;
        }
        
        return ISR;
    }
    
    public double calcularSueldoNeto(double sueldo)
    {  
        this.Sueldo =sueldo;
        SueldoNeto = Sueldo - AFP - SFS - ISR;
        return SueldoNeto ;
    }
}
