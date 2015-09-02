<%-- 
    Document   : AdministratorHome
    Created on : Mar 31, 2015, 10:09:03 AM
    Author     : mcalez031678
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
        <h1>Student Registration System</h1>
        <%--
        Create forms for administrator to add to database
        --%>
        <table>
            <tr><td>
         <h4>Add New Instructor</h4>
         <p>Please enter the instructor's information to add a new instructor.</p>
        <form action="http://localhost:8080/StudentRegistration/AdministratorInstructorUpdateServlet" method="post">
            <table>
                <tr><td>ID: </td><td><input type="text" name="instructorID"></td></tr>
                <tr><td>First Name: </td><td><input type="text" name="instructorFirstName"></td></tr>
                <tr><td>Last Name: </td><td><input type="text" name="instructorLastName"></td></tr>
                <tr><td>Street: </td><td><input type="text" name="instructorStreet"></td></tr>
                <tr><td>City: </td><td><input type="text" name="instructorCity"></td></tr>
                <tr><td>State: </td><td><input type="text" name="instructorState"></td></tr>
                <tr><td>Zip: </td><td><input type="text" name="instructorZip"></td></tr>
                <tr><td>Office: </td><td><input type="text" name="instructorOffice"></td></tr>
                <tr><td>Email: </td><td><input type="text" name="instructorEmail"></td></tr>
                <tr><td><input type="submit" value="Add New Instructor"></td></tr>
            </table>
        </form>
                </td>
                <td>
                    
        <h4>Add New Student</h4>
        <p>Please enter the student's information to add a new student.</p>
        <form action="http://localhost:8080/StudentRegistration/AdministratorStudentUpdateServlet" method="post">
            <table>
                <tr><td>ID: </td><td><input type="text" name="studentID"></td></tr>
                <tr><td>Password: </td><td><input type="text" name="studentPassword"></td></tr>
                <tr><td>First Name: </td><td><input type="text" name="studentFirstName"></td></tr>
                <tr><td>Last Name: </td><td><input type="text" name="studentLastName"></td></tr>
                <tr><td>Street: </td><td><input type="text" name="studentStreet"></td></tr>
                <tr><td>City: </td><td><input type="text" name="studentCity"></td></tr>
                <tr><td>State: </td><td><input type="text" name="studentState"></td></tr>
                <tr><td>Zip: </td><td><input type="text" name="studentZip"></td></tr>
                <tr><td>Email: </td><td><input type="text" name="studentEmail"></td></tr>
                <tr><td>GPA: </td><td><input type="text" name="studentGPA"></td></tr>
                <tr><td><input type="submit" value="Add New Student"></td></tr>
            </table>
        </form>
                </td>
                
        
            <tr><td>
        <h4>Add Course</h4>
        <p>Please enter the course information to add a course.</p>
        <form action="http://localhost:8080/StudentRegistration/AdministratorCourseUpdateServlet" method="post">
        
            <table>
                <tr><td>Course ID: </td><td><input type="text" name="courseID"></td></tr>
                <tr><td> Course Name: </td><td><input type="text" name="courseName"></td></tr>
                <tr><td>Description: </td><td><input type="text" name="courseDescription"></td></tr>
                <tr><td>Credit Hours: </td><td><input type="text" name="courseCreditHours"></td></tr>
                <tr><td><input type="submit" value="Add New Course"></td></tr>
            </table>
        </form>
                </td><td>
        <h4>Add New Section</h4>
        <p>Please enter the section information to add a new section.</p>
        <form action="http://localhost:8080/StudentRegistration/AdministratorSectionUpdateServlet" method="post">
            <table>
                <tr><td>CRN: </td><td><input type="text" name="sectionCRN"></td></tr>
                <tr><td>Course ID: </td><td><input type="text" name="sectionCourseID"></td></tr>
                <tr><td>Course Times/Days: </td><td><input type="text" name="sectionTimeDays"></td></tr>
                <tr><td>Room Number: </td><td><input type="text" name="sectionRoomNumber"></td></tr>
                <tr><td>Instructor: </td><td><input type="text" name="sectionInstructor"></td></tr>
                <tr><td><input type="submit" value="Add New Section"></td></tr>
            </table>
        </form>
                </td>
        </tr>
        </table>
        
        </body>
</html>
