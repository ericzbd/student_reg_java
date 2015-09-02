<%-- 
    Document   : CourseList
    Created on : Apr 7, 2015, 4:01:49 PM
    Author     : mcalez031678
--%>
<%@ page session="true" %>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="external.css" />
        <title>Student Registration System</title>
    </head>
    <body>
        <h3>List of available sections</h3>
        <%
            /**
             * Create connection to database and output available sections
             * 
             *
             */
            try {
	                    
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String connURL="jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "F:\\Java Programming III\\StudentRegistration\\src\\java\\login\\RegistrationMDB.mdb";

            Connection con = DriverManager.getConnection(connURL, "","");
            Statement stmt = con.createStatement();
            
            
          /**
            String query = "SELECT Sections.CRN, Courses.CourseID, Courses.CourseName, "
                    + "Courses.Description, Courses.CreditHours, "
                    + "Sections.TimeDays, Sections.RoomNo, Instructors.FirstName, Instructors.LastName "
                    + "FROM Instructors, Sections, Courses WHERE Instructors.ID = Sections.Instructor AND Sections.CourseID = Courses.CourseID";
            */
            
            String query = "SELECT * FROM Sections";
            
            stmt.execute("SELECT * FROM Sections");
            ResultSet rs = stmt.getResultSet(); // get any Result that came from our query
           %>
                          <table>
                   <tr>
                       <td>CRN&nbsp;&nbsp;</td>
                       <td>Course ID&nbsp;</td>
                       <td>Days/Times&nbsp;&nbsp;&nbsp;&nbsp;</td>
                       <td>Room</td>
                       <td>Instructor</td>
                   </tr>
               </table>
           <table>
           <%
           while (rs.next()) {
            %>   
            <tr>
    <td><%= rs.getString("CRN") %></td>
    <td> <%= rs.getString("CourseID") %></td>
    <td><%= rs.getString("TimeDays") %></td>
<td><%= rs.getString("RoomNo") %></td>
<td><%= rs.getString("Instructor") %></td>
            </tr>
              
          <%
            }
            %>
           </table>
            <%
           
           stmt.close();
            con.close();
            
            }
            catch (Exception ex) {
              ex.printStackTrace();      
            }
            
            
            
            
            
        %>
        
        <h3>List of available courses</h3>
        <%
            /**
             * Create connection to database and display list of available courses
             * 
             * 
             */
            
            try {
	                    
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String connURL="jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "F:\\Java Programming III\\StudentRegistration\\src\\java\\login\\RegistrationMDB.mdb";

            Connection con = DriverManager.getConnection(connURL, "","");
            Statement stmt = con.createStatement();
            
            
          /**
            String query = "SELECT Sections.CRN, Courses.CourseID, Courses.CourseName, "
                    + "Courses.Description, Courses.CreditHours, "
                    + "Sections.TimeDays, Sections.RoomNo, Instructors.FirstName, Instructors.LastName "
                    + "FROM Instructors, Sections, Courses WHERE Instructors.ID = Sections.Instructor AND Sections.CourseID = Courses.CourseID";
            */
            
            String query = "SELECT * FROM Courses";
            
            stmt.execute("SELECT * FROM Courses");
            ResultSet rs = stmt.getResultSet(); // get any Result that came from our query
           %>
           <table>
               
               
           </table>  
           </table>
           
           
           <table>
           <%
           while (rs.next()) {
            %>  
            
            <tr>
                <td><%= rs.getString("CourseID") %></td>
                <td><%= rs.getString("CourseName") %></td>
                <td>  <%= rs.getString("Description") %></td>
                <td> <%= rs.getString("CreditHours") %></td>
            </tr>
          
          
               
            
          <%
            }
           %>
           </table>
           <%
           
           stmt.close();
            con.close();
            
            }
            catch (Exception ex) {
              ex.printStackTrace();      
            }
            
            
            
            
            
        %>
    </body>
</html>
