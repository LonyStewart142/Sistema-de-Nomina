/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;
public class Empleado {
    public int Id;
    public String cedula;
    public String Nombres;
    public String Apellidos;
    public String Fecha_Contrato;
    public String Telefono;
    public int Hijos;
    public String Sexo;
    public String EstadoCivil;
    public String Direccion;
    public String Cargo;
    public int Sueldo;
    public String estado;

    public Empleado(String cedula,String nombres,String apellidos,String telefono,int hijos,String sexo, String estadocivil,String direccion,String cargo,int sueldo){
    this.cedula =cedula;
    this.Nombres = nombres;
    this.Apellidos = apellidos;
   
    this.Telefono = telefono;
    this.Hijos = hijos;
    this.Sexo = sexo;
    this.EstadoCivil = estadocivil;
    this.Direccion =direccion;
    this.Cargo =cargo;
    this.Sueldo=sueldo;
    }
     public Empleado(String estado,String nombres){
   
    this.Nombres = nombres;
    this.estado = estado;
    }
        public Empleado(int sueldo){
        this.Sueldo =sueldo;
    }
       public Empleado(String cedula,String nombres,String apellidos,String telefono,int hijos,String sexo, String estadocivil,String direccion,String cargo,int sueldo,String estado){
    this.cedula =cedula;
    this.Nombres = nombres;
    this.Apellidos = apellidos;
    this.Telefono = telefono;
    this.Hijos = hijos;
    this.Sexo = sexo;
    this.EstadoCivil = estadocivil;
    this.Direccion =direccion;
    this.Cargo =cargo;
    this.Sueldo=sueldo;
    this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Empleado(int id,String cedula,String nombres,String apellidos,String telefono,int hijos,String sexo, String estadocivil,String direccion,String cargo,int sueldo){
    this.Id = id;
    this.cedula =cedula;
    this.Nombres = nombres;
    this.Apellidos = apellidos;

    this.Telefono = telefono;
    this.Hijos = hijos;
    this.Sexo = sexo;
    this.EstadoCivil = estadocivil;
    this.Direccion =direccion;
    this.Cargo =cargo;
    this.Sueldo =sueldo;
    }
  
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getFecha_Contrato() {
        return Fecha_Contrato;
    }

    public void setFecha_Contrato(String Fecha_Contrato) {
        this.Fecha_Contrato = Fecha_Contrato;
    }



    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getHijos() {
        return Hijos;
    }

    public void setHijos(int Hijos) {
        this.Hijos = Hijos;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    
    
}
