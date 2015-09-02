<%-- 
    Document   : DisplayStudentInfo
    Created on : Apr 9, 2015, 8:57:07 AM
    Author     : mcalez031678
--%>

<%@page import="business.Section"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="business.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Registration System</title>
        <link rel="stylesheet" type="text/css" href="external.css" />
    </head>
    <body>
        <h1>Student Information</h1>
        
        
          <% 
            /**
            Extract student object from session        
            */     
    
            Student s1 = (Student) request.getSession().getAttribute("student");
            if (s1 == null) {
                System.out.println("s1 is null on StudentHome.jsp");
                
            }
            
        if (s1 != null) { %> 
        
        
         <h4>Student Information</h4>
         
       <%--
       Output student information
       --%>
       Student Name: <%= s1.getFirstName() %>
        <%= s1.getLastName() %><br>
        Address: <%= s1.getStreet() %><br>
        Address: <%= s1.getCity() %>,&nbsp;<%= s1.getState() %>&nbsp;<%= s1.getZip() %><br>
        Email Address: <%= s1.getEmail() %><br>
        GPA: 
        <%  /** 
         boolean bool = false;
         while (!bool) {
           if (s1 != null) {
           bool = true;
           }
        */%>
           <%
        DecimalFormat df = new DecimalFormat("#.##");
             out.println(df.format(s1.getGPA()));
           
        %>
        <br><br>
        <form method="post" action="http://localhost:8080/StudentRegistration/EditStudentInfo.jsp">
            <input type="submit" value="Edit Student Information">
        </form>
        <table>
            <h3>Current Schedule</h3>
        <% 
            s1.getScheduleCRNs(s1.getId());
            s1.getStudentSections();
            for (int i = 0; i < s1.sectionList.length; i++) {
            Section temp = s1.sectionList[i];
            if (temp.getCrn() != 9999) {
        %>
    <tr>
        <td><p>CRN</p>
            <%
            out.println(temp.getCrn());
            %>
        </td>
        <td><p>Course ID</p>
            <%= temp.getCourseId() %>
        </td>
        <td><p>Time & Days</p>
            <%= temp.getTimeDays() %>
        </td>
        <td><p>Room Number</p>
            <%= temp.getRoomNo() %>
        </td>
        <td><p>Instructor</p>
            <%= temp.getInstructor() %>
        </td>
    </tr>
    
    <%
            }
        }
        } else {
            out.println("Please log in again to see your updated schedule and information.");
           %>
            <h4>Student Login</h4>
            <form action="http://localhost:8080/StudentRegistration/StudentLoginServlet" method="get">
            Student&nbsp;ID: <input type="text" name="studentID"><br><br>
            Password:&nbsp;&nbsp;<input type="password" name="studentPassword">
            <br><br>
            <input type="submit" value="Submit">
            </form>
  
           <%
            // response.setHeader("Refresh", "0; URL=http://localhost:8080/StudentRegistration/StudentHome.jsp");
        }
     %>
    </body>
</html>
