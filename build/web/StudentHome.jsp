<%-- 
    Document   : StudentHome
    Created on : Mar 31, 2015, 10:08:49 AM
    Author     : mcalez031678
--%>
<%@page session="true" %>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="business.Student"%>
<%@page import="business.Section"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="external.css" />
        <title>Student Registration System</title>
    </head>
    <body>
        <h1>Welcome to the Student Registration System!</h1>

   
         <h4>Student Information</h4>
         
     
       

      

        <h4>Add Course</h4>
        <p>Please enter the course CRN to add a course. <a href="http://localhost:8080/StudentRegistration/CourseList.jsp" target="_blank">View list of courses.</a></p>
        <form action="http://localhost:8080/StudentRegistration/StudentAddDropServlet" method="post">
        <input type="text" name="courseToAdd">
        <input type="submit" value="Add Course">
        </form>
        
        <h4>Drop Course</h4>
        <p>Please enter the course CRN to drop a course.</p>
        <form action="http://localhost:8080/StudentRegistration/StudentAddDropServlet" method="post">
            <input type="text" name="courseToDrop">
            <input type="submit" value="Drop Course">
        </form>
        
        <br><br><br>
        
         <form method="post" action="http://localhost:8080/StudentRegistration/EditStudentInfo.jsp">
            <input type="submit" value="Edit Student Information">
        </form>
       
         
        <br><br>
         <form method="post" action="http://localhost:8080/StudentRegistration/DisplayStudentInfo.jsp" target="_blank">
            <input type="submit" value="Display Student Information and Schedule">
        </form>
       
         

        
        
     </body>
</html>
