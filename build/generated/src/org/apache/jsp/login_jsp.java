package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\n");
      out.write("<html><head>\n");
      out.write("<meta content=\"text/html; charset=ISO-8859-1\" http-equiv=\"content-type\"><title>login</title>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("form {\n");
      out.write("    padding : 100px;}\n");
      out.write("body { background-color: lightblue; font-weight: bold; text-align: center;}\n");
      out.write("label { width: 4em;  text-align: right; margin-right: 0.5em; display: block; font-family: Arial, sans-serif; float: left; }\n");
      out.write("input { color: #781351; background: #fee3ad;  }\n");
      out.write("legend { font-family: Georgia, \"Times New Roman\", serif; font-weight: bold; }\n");
      out.write("fieldset {  width: 320px; border: 2px ridge #f00700; padding: 50px; margin-bottom: 10px; }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<center>\n");
      out.write("<div id=\"form\">\n");
      out.write("<form method=\"post\" action=\"login.php\">\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("\n");
      out.write("<fieldset><legend>Please enter your login info:</legend>\n");
      out.write("\n");
      out.write("    <label id=\"id\">Login: </label>\n");
      out.write("\n");
      out.write("    <input name=\"id\" type=\"text\">\n");
      out.write("\n");
      out.write("    <p>\n");
      out.write("\n");
      out.write("    <label id=\"pw\"> Password: </label>\n");
      out.write("\n");
      out.write("    <input name=\"pw\" type=\"password\">\n");
      out.write("\n");
      out.write("\n");
      out.write("</fieldset>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</center>\n");
      out.write("</body></html>");
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
