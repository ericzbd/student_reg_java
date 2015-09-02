<%----------------------------------------------------------------------------
* Class: CIST 2373
* Semester: Spring 2015
* Instructor: Ron Enz
* Description: Lab 2
* Due: 2/4/2015
* @author Eric Horne

----------------------------------------------------------------------------%>

<%@page import="Business.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Foilage</title>
    </head>
    <body>
                    	<%@page import ="Business.*;" %>
        <%


            Customer c1;
            
	    c1=(Customer)session.getAttribute("c1");
            c1.display();
            	int id = c1.getCustId();
                String i = id+"";
                
            
         %>   
         <h1>Error logging in for User with ID = <%=  i %></h1>
         

        
    </body>
</html>
