<%-- 
    Document   : AgregarEmpleados
    Created on : 24-oct-2017, 5:54:40
    Author     : LonyStewart
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Statement"%>
<%@page import="Conector.Conexion"%>
<%@page import="Conector.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charse="utf-8">
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nomina</title>
         <link href="https://fonts.googleapis.com/css?family=Open+Sans:300|Raleway" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
    
        <link rel="stylesheet" href="style.css">
           <link rel="stylesheet" href="Bootstrap/css/bootstrap.min.css">     
         <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
        <script type="text/javascript">
   
$(document).ready(function() {
     $(".Formulario").hide();
    setTimeout(function() {
        $(".loading").fadeOut(500);
    },200);
	
	setTimeout(function() {
        $(".Formulario").fadeIn(500);
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

h2{
    font-family: 'Raleway';
    color: white;
}
.Formulario{
    position: relative;
    top: 60px;
    
}
form{
    width: 80%;
    margin-left:20%;
}
.txta{
     resize: vertical;
    max-height: 100px;
    min-height: 150px;
    }

.Formulario h2{
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
             <div class="Formulario">
             <h2 > BonosRecompenzas | Descuentos</h2><br>
                 <div class="container">
               <form class="form-horizontal" action="BD"  method="post">
                  <div class="form-group">
                     <label  class="control-label col-md-2">Elegir Empleado</label>
                     <div class="col-md-10">
                         <select class="form-control"  style="width: 50%;" name= "empleado" required="" > 
                             <%
                                 Conexion c = new Conexion(); 
                                 c.getConexion();
                                 Statement st ;
                                 String sql = "select * from empleado where Estado='n/s'";
                                 st =c.getConexion().createStatement();
                                 ResultSet rs =st.executeQuery(sql);
                                 while(rs.next()){
                                     String nombre=rs.getString(3);
                                 out.println("<option>"+nombre+"</option>");
                                 ;}
                             %>
                             
                         </select>
                    </div>  
                    </div>
                       <div class="form-group">
                       <label class="control-label col-md-2">Bonos/Recompenzas</label>
                       <div class="col-md-10">
                       <input class="form-control" style="width: 50%;" type="number" name="bono"  placeholder="Bonos"  required=""/>
                       
                       </div>  
                       </div>
                      <div class="form-group">
                       <label class="control-label col-md-2">Descuentos</label>
                       <div class="col-md-10">
                       <input class="form-control" style="width: 50%;" type="number" name="descuentos"  placeholder="Descuento"  required=""/>
                       </div>  
                       </div>
                         
                      <div class="form-group">
                     <label  class="control-label col-md-2">Descripcion</label>
                     <div class="col-md-10">
                         <textarea  rows="10" cols="50" class="txta" name="descripcion"placeholder="Descripcion de causa" required=""></textarea><br><br>
                    <button type="submit" class="btn btn-primary">Enviar Datos</button>  
                     </div>  
                    </div>     
                 </form>
                 </div>
            </div>
           </div>
       
  
   </body>
</html>
