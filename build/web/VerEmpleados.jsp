<%-- 
    Document   : Index
    Created on : 23-oct-2017, 3:54:55
    Author     : LonyStewart
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Conector.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
     
        <meta charset="utf-8">
        <title>Nomina</title>
         <link href="https://fonts.googleapis.com/css?family=Open+Sans:300|Raleway" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
    
        <link rel="stylesheet" href="style.css">
           <link rel="stylesheet" href="Bootstrap/css/bootstrap.min.css">     
         <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
        <script type="text/javascript">
   
$(document).ready(function() {
     $(".MostrarDatos").hide();
    setTimeout(function() {
        $(".loading").fadeOut(500);
    },200);
	
	setTimeout(function() {
        $(".MostrarDatos").fadeIn(500);
    },700);
});
</script>
        <style>*{
    margin: 0;
     padding:0;
      box-sizing: border-box;
    
}
.all{
    position: absolute;
    width: 100%;
}
.top{
    width: 100%;
    position: relative;
    background: #D84F4B;
    height: 80px;
    -webkit-box-shadow:0px 1px 5px 2px rgba(0,0,0,0.24);
   -moz-box-shadow:0px 1px 5px 2px rgba(0,0,0,0.24);
    box-shadow:0px 1px 5px 2px rgba(0,0,0,0.24);


}
nav{
  position: relative;
    top: 10px;
}
.top nav ul li{
    list-style: none;
    text-decoration: none;
    display: inline-block;
    margin-left: 30px;

}
a{
    text-decoration: none;
    color: black;
    font-size: 20px;
}
.logo{
      position: relative;
      width:150px;
      bottom: 8px;
      vertical-align: middle;
    cursor: pointer;
   

}
.loading{
    position: relative;
    left: 450px;
    top: 100px;
}
.Mostrar{
    margin: 0;
    padding: 10px;
    padding-top:40px;
    padding-bottom:27px;
    color: white;
     font-family: 'Raleway';
}
.Nuevo{
    margin: 0;
  
    padding: 10px;
    padding-top:40px;
    padding-bottom:27px;
    color: white;
     font-family: 'Raleway';
}


.encabezado h2 span{ 
    color: #3664aa;
    font-size: 35px;
}
.MostrarDatos{
 position: relative;
top: 100px;
    
}

h2{
    font-family: 'Raleway';
    color: black;
    text-align: center;
}

    </style>
    </head>

    <body>
       <div class= "all">
           <div class="top">
                 <nav>
                     <ul>
                         <li ><a href="#"><h2 >Empleado</h2></a></li>
                         <li><a href="VerEmpleados.jsp"><span  class="Mostrar">Mostrar Datos</span></a></li>
                         <li><a href="AgregarEmpleados.jsp"><span  class="Nuevo">Nuevo</span></a></li>
                         <li><a href="BonosRecompenzas.jsp"><span  class="Nuevo">Bonos And Descuentos </span></a></li>
                          <li><a href="Historial.jsp"><span  class="Nuevo">Historial </span></a></li>
                            <li><a href="Index.jsp"><span  class="Nuevo">>Inicio </span></a></li>
                     </ul>
                  </nav>
           </div>
             <img class="loading" src="img/loading.gif">
             <div class="MostrarDatos">
                 <h2 >Lista de Empleados</h2><br>
                 <div class="container">
                 <table class="table table-bordered table-hover">
                    <tr class="danger">
                       <th>Cedula</th>
                       <th>Nombre</th>
                       <th>Apellidos</th>
                       <th>Telefono</th>    
                       <th>Hijos</th>
                       <th>Sexo</th>
                       <th>Estado_Civil</th>
                       <th>Direccion</th> 
                       <th>Cargo</th>
                       <th>Sueldo </th>
                       <th>Fecha_Contracto</th> 
                     </tr>
                    <%
                     Conexion c=new Conexion();
                     Statement st=null;
                     String sql="select * from empleado";
                     st = c.getConexion().createStatement();
                     ResultSet rs = st.executeQuery(sql);
                    while(rs.next()){                     
                   out.println("<tr>");
                   out.println("<td>"+rs.getString(2)+"</td>");
                   out.println("<td>"+rs.getString(3)+"</td>");
                   out.println("<td>"+rs.getString(4)+"</td>");
                   out.println("<td>"+rs.getString(5)+"</td>");
                   out.println("<td>"+rs.getString(6)+"</td>");
                   out.println("<td>"+rs.getString(7)+"</td>");
                   out.println("<td>"+rs.getString(8)+"</td>");
                   out.println("<td>"+rs.getString(9)+"</td>");
                   out.println("<td>"+rs.getString(10)+"</td>");
                   out.println("<td>"+rs.getString(11)+"</td>");
                   out.println("<td>"+rs.getString(12)+"</td>");
                   out.println("</tr>"); }
                   %>
                 </table>
                     </div>
            </div>  
           </div>
       
  
   </body>
</html>
