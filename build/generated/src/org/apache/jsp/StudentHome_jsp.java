package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import business.*;
import login.*;

public final class StudentHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Welcome to the Student Registration System!</h1>\n");
      out.write("    \n");
      out.write("        ");
 Student s1 = (Student) session.getAttribute("student"); 
      out.write(" \n");
      out.write("         <h4>Student Information</h4>\n");
      out.write("        ");
      out.print( s1.getFirstName() );
      out.write("\n");
      out.write("        ");
      out.print( s1.getLastName() );
      out.write("<br>\n");
      out.write("        ");
      out.print( s1.getStreet() );
      out.write("<br>\n");
      out.write("        ");
      out.print( s1.getCity() );
      out.write(",&nbsp;");
      out.print( s1.getState() );
      out.write("&nbsp;");
      out.print( s1.getZip() );
      out.write("<br>\n");
      out.write("        ");
      out.print( s1.getEmail() );
      out.write("<br>\n");
      out.write("        ");
   DecimalFormat df = new DecimalFormat("#.##");
             out.println(df.format(s1.getGPA()));
        
      out.write("\n");
      out.write(" \n");
      out.write("        <form method=\"post\" action=\"http://localhost:8080/StudentRegistration/EditStudentInfoServlet\">\n");
      out.write("            <input type=\"submit\" value=\"Edit Student Information\">\n");
      out.write("        </form>\n");
      out.write("        <table>\n");
      out.write("\n");
      out.write("        ");
 
            s1.getScheduleCRNs(s1.getId());
            s1.getStudentSections();
            for (int i = 0; i < s1.sectionList.length; i++) {
            
        
      out.write("\n");
      out.write("  \n");
      out.write("    <tr>\n");
      out.write("        <td><p>CRN</p>\n");
      out.write("            ");

            Section temp = s1.sectionList[i];
            out.println(temp.getCrn());
            
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td><p>Course ID</p>\n");
      out.write("            ");
      out.print( temp.getCourseId() );
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td><p>Time & Days</p>\n");
      out.write("            ");
      out.print( temp.getTimeDays() );
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td><p>Room Number</p>\n");
      out.write("            ");
      out.print( temp.getRoomNo() );
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td><p>Instructor</p>\n");
      out.write("            ");
      out.print( temp.getInstructor() );
      out.write("\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    ");

        }
     
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <h4>Add Course</h4>\n");
      out.write("        <p>Please enter the course CRN to add a course.</p>\n");
      out.write("        <form action=\"http://localhost:8080/StudentRegistration/StudentAddDropServlet\" method=\"post\">\n");
      out.write("        <input type=\"text\" name=\"courseToAdd\">\n");
      out.write("        <input type=\"submit\" value=\"Add Course\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <h4>Drop Course</h4>\n");
      out.write("        <p>Please enter the course CRN to drop a course.</p>\n");
      out.write("        <form action=\"http://localhost:8080/StudentRegistration/StudentAddDropServlet\" method=\"post\">\n");
      out.write("            <input type=\"text\" name=\"courseToDrop\">\n");
      out.write("            <input type=\"submit\" value=\"Drop Course\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("     </body>\n");
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
