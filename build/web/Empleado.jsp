<%-- 
    Document   : Index
    Created on : 23-oct-2017, 3:54:55
    Author     : LonyStewart
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <title>Nomina</title>
         <link href="https://fonts.googleapis.com/css?family=Open+Sans:300|Raleway" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
        <link rel="stylesheet" href="estilos/Styles.css">
        <link rel="stylesheet" href="style.css">
         <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
        <script type="text/javascript">

$(document).ready(function() {
     $(".Container").hide();
    setTimeout(function() {
        $(".loading").fadeOut(500);
    },200);
	
	setTimeout(function() {
        $(".Container").fadeIn(500);
    },700);
});


</script>
    </head>

    <body>
       <div class= "all">
           <div class="top">
              
                  <nav>
                     <ul>
                         <li><a href="#"><img class="logo" src="logo/Logo.png"></a></li>
                         <li><a href="#"><span class="icon-home2">Inicio</span></a></li>
                         <li><a href="#"><span class="icon-menu">Accesos Directos</span></a></li>
                     </ul>
                  </nav>
           </div>
            <div class="encabezado">
               <h2><span class="icon-clipboard-edit2">Panel de Trabajo</span></h2> </div>
           <div class="Container">
              
             <div class="Container-item">
               <div class="item-nomina"> 
                    <div class="item-img-nomina"> 
                      <img src="img/dollar.png">
                    </div>
                   <div class="texto">
                   <h3>Nominas </h3>
                   <p>Nominas Realizadas</p></div>
               </div>
               <div class="item-empleado"> 
                    <div class="item-img-empleado"> 
                      <img src="img/group.png">
                    </div>
                     <div class="texto">
                   <h3>Empleados </h3>
                   <p>Ver/Gestion Empleados</p></div>
               </div>
                  <div class="item-usuarios"> 
                    <div class="item-img-usuarios"> 
                      <img src="img/users.png">
                    </div>
                        <div class="texto">
                   <h3>Usuarios </h3>
                   <p>Usuarios que pueden acceder al sistema</p></div>
               </div>
               <div class="item-m"> 
                    <div class="item-img-m"> 
                      <img src="img/lifebuoy.png">
                    </div>
                     <div class="texto">
                   <h3>En Mantenimiento</h3>
                   <p>Lo sentimos, estamos agregando algo aqui</p></div>
               </div>
             </div>
            
             </div>
             <img class="loading" src="img/loading.gif">
           </div>
       
        </div>
   </body>
</html>
