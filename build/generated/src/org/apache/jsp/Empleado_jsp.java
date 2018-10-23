package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Empleado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Nomina</title>\n");
      out.write("         <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300|Raleway\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilos/Styles.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("         <script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("$(document).ready(function() {\n");
      out.write("     $(\".Container\").hide();\n");
      out.write("    setTimeout(function() {\n");
      out.write("        $(\".loading\").fadeOut(500);\n");
      out.write("    },200);\n");
      out.write("\t\n");
      out.write("\tsetTimeout(function() {\n");
      out.write("        $(\".Container\").fadeIn(500);\n");
      out.write("    },700);\n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("       <div class= \"all\">\n");
      out.write("           <div class=\"top\">\n");
      out.write("              \n");
      out.write("                  <nav>\n");
      out.write("                     <ul>\n");
      out.write("                         <li><a href=\"#\"><img class=\"logo\" src=\"logo/Logo.png\"></a></li>\n");
      out.write("                         <li><a href=\"#\"><span class=\"icon-home2\">Inicio</span></a></li>\n");
      out.write("                         <li><a href=\"#\"><span class=\"icon-menu\">Accesos Directos</span></a></li>\n");
      out.write("                     </ul>\n");
      out.write("                  </nav>\n");
      out.write("           </div>\n");
      out.write("            <div class=\"encabezado\">\n");
      out.write("               <h2><span class=\"icon-clipboard-edit2\">Panel de Trabajo</span></h2> </div>\n");
      out.write("           <div class=\"Container\">\n");
      out.write("              \n");
      out.write("             <div class=\"Container-item\">\n");
      out.write("               <div class=\"item-nomina\"> \n");
      out.write("                    <div class=\"item-img-nomina\"> \n");
      out.write("                      <img src=\"img/dollar.png\">\n");
      out.write("                    </div>\n");
      out.write("                   <div class=\"texto\">\n");
      out.write("                   <h3>Nominas </h3>\n");
      out.write("                   <p>Nominas Realizadas</p></div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"item-empleado\"> \n");
      out.write("                    <div class=\"item-img-empleado\"> \n");
      out.write("                      <img src=\"img/group.png\">\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"texto\">\n");
      out.write("                   <h3>Empleados </h3>\n");
      out.write("                   <p>Ver/Gestion Empleados</p></div>\n");
      out.write("               </div>\n");
      out.write("                  <div class=\"item-usuarios\"> \n");
      out.write("                    <div class=\"item-img-usuarios\"> \n");
      out.write("                      <img src=\"img/users.png\">\n");
      out.write("                    </div>\n");
      out.write("                        <div class=\"texto\">\n");
      out.write("                   <h3>Usuarios </h3>\n");
      out.write("                   <p>Usuarios que pueden acceder al sistema</p></div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"item-m\"> \n");
      out.write("                    <div class=\"item-img-m\"> \n");
      out.write("                      <img src=\"img/lifebuoy.png\">\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"texto\">\n");
      out.write("                   <h3>En Mantenimiento</h3>\n");
      out.write("                   <p>Lo sentimos, estamos agregando algo aqui</p></div>\n");
      out.write("               </div>\n");
      out.write("             </div>\n");
      out.write("            \n");
      out.write("             </div>\n");
      out.write("             <img class=\"loading\" src=\"img/loading.gif\">\n");
      out.write("           </div>\n");
      out.write("       \n");
      out.write("        </div>\n");
      out.write("   </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
