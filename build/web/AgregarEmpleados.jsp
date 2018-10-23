<%-- 
    Document   : AgregarEmpleados
    Created on : 24-oct-2017, 5:54:40
    Author     : LonyStewart
--%>

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
             <h2 >Formulario/Agregar | Nuevo Empleado</h2><br>
                 <div class="container">
               <form class="form-horizontal" action="AgregarE"  method="post">
                    <div class="form-group">
                    <label class="control-label col-md-2">Cedula</label>
                    <div class="col-md-10">
                    <input class="form-control" style="width: 50%;" type="text" name="cedula"  placeholder="Cedula"  required=""/>
                    </div>    
                </div>
                    <div class="form-group">
                     <label  class="control-label col-md-2">Nombre</label>
                     <div class="col-md-10">
                     <input class="form-control" style="width: 50%;" type="text" name="nombres"  placeholder="Nombre" required=""/>
                     </div>  
                    </div>      
                   <div class="form-group">
                     <label  class="control-label col-md-2">Apellidos</label>
                     <div class="col-md-10">
                     <input class="form-control" style="width: 50%;" type="text" name="apellidos"  placeholder="Apellidos" required=""/>
                     </div>  
                    </div>     
                   <div class="form-group">
                     <label  class="control-label col-md-2">Telefono</label>
                     <div class="col-md-10">
                     <input class="form-control" style="width: 50%;" type="number" name="telefono"  min="0" placeholder="Telefono" required=""/>
                     </div>  
                    </div>     
                   <div class="form-group">
                     <label  class="control-label col-md-2">Hijos</label>
                     <div class="col-md-10">
                     <input class="form-control" style="width: 50%;" type="number" name="hijos"  min="0" placeholder="Cantidad de Hijos" required=""/>
                     </div>  
                    </div>     
                    <div class="form-group">
                     <label  class="control-label col-md-2">Estado Civil</label>
                     <div class="col-md-10">
                     <input class="form-control" style="width: 50%;" type="text" name="estadocivil"  placeholder="Estado Civil" required=""/>
                     </div>  
                    </div>     
                   <div class="form-group">
                     <label  class="control-label col-md-2">Direccion</label>
                     <div class="col-md-10">
                    <textarea  rows="10" cols="50" class="txta" name="direccion"placeholder="Escribe aquÃ­ tu direccion" required=""></textarea>
                     </div>  
                    </div>     
                   <div class="form-group">
                     <label  class="control-label col-md-2">Cargo</label>
                     <div class="col-md-10">
                     <input class="form-control" style="width: 50%;" type="text" name="cargo"  placeholder="Cargo" required=""/>
                     </div>  
                    </div>     
                     <div class="form-group">
                     <label  class="control-label col-md-2">Sueldo</label>
                     <div class="col-md-10">
                     <input class="form-control" style="width: 50%;" type="number" name="sueldo"  min="0" placeholder="Asignar Sueldo" required=""/>
                       
                      
                     </div>  
                    </div> 
                   <div class="form-group">
                     <label  class="control-label col-md-2">Sexo</label>
                     <div class="col-md-10">
                         <select class="form-control"  style="width: 50%;" name= "sexo" required="" > 
                             <option value="Hombre" >Hombre</option>
                             <option value="Mujer">Mujer</option>
                        </select>
                         <br><br>
                          <button type="submit" class="btn btn-primary">Enviar Datos</button>  
                     </div>  
                    </div>
                   
                      
                 </form>
                 </div>
            </div>
           </div>
       
  
   </body>
</html>
