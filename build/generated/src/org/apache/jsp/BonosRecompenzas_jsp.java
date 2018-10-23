package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BonosRecompenzas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charse=\"utf-8\">\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Nomina</title>\n");
      out.write("         <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300|Raleway\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("           <link rel=\"stylesheet\" href=\"Bootstrap/css/bootstrap.min.css\">     \n");
      out.write("         <script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("   \n");
      out.write("$(document).ready(function() {\n");
      out.write("     $(\".Formulario\").hide();\n");
      out.write("    setTimeout(function() {\n");
      out.write("        $(\".loading\").fadeOut(500);\n");
      out.write("    },200);\n");
      out.write("\t\n");
      out.write("\tsetTimeout(function() {\n");
      out.write("        $(\".Formulario\").fadeIn(500);\n");
      out.write("    },700);\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("        <style>*{\n");
      out.write("    margin: 0;\n");
      out.write("     padding:0;\n");
      out.write("      box-sizing: border-box;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".all{\n");
      out.write("    position: absolute;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write(".top{\n");
      out.write("    width: 100%;\n");
      out.write("    position: relative;\n");
      out.write("    background: #D84F4B;\n");
      out.write("    height: 80px;\n");
      out.write("    -webkit-box-shadow:0px 1px 5px 2px rgba(0,0,0,0.24);\n");
      out.write("   -moz-box-shadow:0px 1px 5px 2px rgba(0,0,0,0.24);\n");
      out.write("    box-shadow:0px 1px 5px 2px rgba(0,0,0,0.24);\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("nav{\n");
      out.write("  position: relative;\n");
      out.write("    top: 10px;\n");
      out.write("}\n");
      out.write(".top nav ul li{\n");
      out.write("    list-style: none;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    margin-left: 30px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("a{\n");
      out.write("    text-decoration: none;\n");
      out.write("    color: black;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write(".logo{\n");
      out.write("      position: relative;\n");
      out.write("      width:150px;\n");
      out.write("      bottom: 8px;\n");
      out.write("      vertical-align: middle;\n");
      out.write("    cursor: pointer;\n");
      out.write("   \n");
      out.write("\n");
      out.write("}\n");
      out.write(".loading{\n");
      out.write("    position: relative;\n");
      out.write("    left: 450px;\n");
      out.write("    top: 100px;\n");
      out.write("}\n");
      out.write(".Mostrar{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 10px;\n");
      out.write("    padding-top:40px;\n");
      out.write("    padding-bottom:27px;\n");
      out.write("    color: white;\n");
      out.write("     font-family: 'Raleway';\n");
      out.write("}\n");
      out.write(".Nuevo{\n");
      out.write("    margin: 0;\n");
      out.write("  \n");
      out.write("    padding: 10px;\n");
      out.write("    padding-top:40px;\n");
      out.write("    padding-bottom:27px;\n");
      out.write("    color: white;\n");
      out.write("     font-family: 'Raleway';\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".encabezado h2 span{ \n");
      out.write("    color: #3664aa;\n");
      out.write("    font-size: 35px;\n");
      out.write("     \n");
      out.write("}\n");
      out.write("\n");
      out.write("h2{\n");
      out.write("    font-family: 'Raleway';\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write(".Formulario{\n");
      out.write("    position: relative;\n");
      out.write("    top: 60px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("form{\n");
      out.write("    width: 80%;\n");
      out.write("    margin-left:20%;\n");
      out.write("}\n");
      out.write(".txta{\n");
      out.write("     resize: vertical;\n");
      out.write("    max-height: 100px;\n");
      out.write("    min-height: 150px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write(".Formulario h2{\n");
      out.write("    color: black;\n");
      out.write("    text-align: center;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("       <div class= \"all\">\n");
      out.write("           <div class=\"top\">\n");
      out.write("                 <nav>\n");
      out.write("                     <ul>\n");
      out.write("                         <li ><a href=\"#\"><h2 >Empleado</h2></a></li>\n");
      out.write("                        <li><a href=\"VerEmpleados.jsp\"><span  class=\"Mostrar\">Mostrar Datos</span></a></li>\n");
      out.write("                         <li><a href=\"AgregarEmpleados.jsp\"><span  class=\"Nuevo\">Nuevo</span></a></li>\n");
      out.write("                         <li><a href=\"#\"><span  class=\"Nuevo\">Bonos And Descuentos </span></a></li>\n");
      out.write("                     </ul>\n");
      out.write("                  </nav>\n");
      out.write("           </div>\n");
      out.write("             <img class=\"loading\" src=\"img/loading.gif\">\n");
      out.write("             <div class=\"Formulario\">\n");
      out.write("             <h2 >Formulario/Agregar | Nuevo Empleado</h2><br>\n");
      out.write("                 <div class=\"container\">\n");
      out.write("               <form class=\"form-horizontal\" action=\"AgregarE\"  method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                     <label  class=\"control-label col-md-2\">Sexo</label>\n");
      out.write("                     <div class=\"col-md-10\">\n");
      out.write("                         <select class=\"form-control\"  style=\"width: 50%;\" name= \"sexo\" required=\"\" > \n");
      out.write("                             <option value=\"Hombre\" >Hombre</option>\n");
      out.write("                             <option value=\"Mujer\">Mujer</option>\n");
      out.write("                        </select>\n");
      out.write("                         <br><br>\n");
      out.write("                          <button type=\"submit\" class=\"btn btn-primary\">Enviar Datos</button>  \n");
      out.write("                     </div>  \n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                      \n");
      out.write("                 </form>\n");
      out.write("                 </div>\n");
      out.write("            </div>\n");
      out.write("           </div>\n");
      out.write("       \n");
      out.write("  \n");
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
