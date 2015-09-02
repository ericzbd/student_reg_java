<%-- 
    Document   : EditStudentInfo
    Created on : Apr 2, 2015, 8:07:44 PM
    Author     : 9632587841'
--%>
<%@ page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="external.css" />
        <title>Student Registration System</title>
    </head>
    <body>
        <%--
        Create form for student to edit their information
        --%>
        <h1>Student Information</h1>
        <form action="http://localhost:8080/StudentRegistration/EditStudentInfoServlet" method="post">
            First Name: <input type="text" name="firstName"><br>
        Last Name: <input type="text" name="lastName"><br>
        Street: <input type="text" name="street"><br>
        City: <input type="text" name="city"><br>
        State: <input type="text" name="state"><br>
        Zip: <input type="text" name="zip"><br>
        Email: <input type="text" name="email"><br>
        <input type="submit" value="Submit Form">
        </form>
    </body>
</html>
