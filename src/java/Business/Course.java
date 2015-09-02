/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import java.sql.*;

/**
 *
 * @author Eric
 */
public class Course {
    

    public String courseId;
    public String courseName;
    public String courseDescription;
    public String courseCreditHours;


    
    public Course(){   
        
        courseId = "";
        courseName = "";
        courseDescription = "";
        courseCreditHours = "";

    }
    
    
    /****************************************************************************************************************
     * 
     * This method takes the course's ID and pulls out the Course object info from database
     *
     * 
    ****************************************************************************************************************/
       public void selectDB(String courseId){

        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection c1 = DriverManager.getConnection("jdbc:odbc:RegistrationDB");
                System.out.println("Database connected");
                
                Statement statement = c1.createStatement();
                
                String sql = "Select * from Courses where CourseID="+courseId;
                
                System.out.println(sql);
                
                
                ResultSet rs = statement.executeQuery(sql);
                
                rs.next();
             //   courseId=rs.getInt(1);
                courseName=rs.getString(2);
                courseDescription=rs.getString(4);
                courseCreditHours=rs.getString(5);

         }//end try
                   
         catch(Exception e)
              {System.out.println("Foiled/Hogtied"+e); }
       
        
        
    }//end selectDB
      
       
           public void insertDB(String newCourseId, String newCourseName, 
                   String newCourseDescription, String newCourseCreditHours){
    	
                courseId = newCourseId;                
                courseName = newCourseName;
                courseDescription = newCourseDescription;
                courseCreditHours = newCourseCreditHours;

      
        try {
    		
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			
    		System.out.println("Driver loaded");
    		
                Connection c1 = DriverManager.getConnection("jdbc:odbc:RegistrationDB");
    			
    		System.out.println("Database connected");
    		
    		Statement statement = c1.createStatement();
          
                String sql = "INSERT into Courses VALUES('" + newCourseId + "', '" + newCourseName + "', '" + 
                          newCourseDescription + "', '" + newCourseCreditHours + "')";

                System.out.println(sql);
          
    		
    		 int n = statement.executeUpdate(sql);
          
          if (n==1) 
          
            System.out.println("Successful");
            
         else
            
            System.out.println("Fail");
          
    			c1.close();
                   
         }//end try
                   
         catch(Exception e)
              {System.out.println("Foilage"+e); }
    	
    }//end insertDB
   
           
//      GETTERS AND SETTERS - pulls the info from the text box and 

            public String getCourseId(){

            return courseId;
            
            }   
            
            public void setCourseId(String newCourseId){

            courseId = newCourseId;

            }
            

        public String getCourseName(){

            return courseName;
        }    
        public void setCourseName(String newCourseName){

            courseName = newCourseName;

        }
        
        
        public String getCourseDescription(){

            return courseDescription;
        }    
        public void setCourseDescription(String newCourseDescription){

            courseDescription = newCourseDescription;

        }
        
        public String getCourseCreditHours(){
  
            return courseCreditHours;
        }    
        public void setCourseCreditHours(String newCourseCreditHours){

            courseCreditHours = newCourseCreditHours;

        }
        
         
        
    
       public void display() {
        System.out.println("Course ID = "+this.getCourseId());
        System.out.println("Course  Name = "+this.getCourseName());
        System.out.println("Course Description = "+this.getCourseDescription());
        System.out.println("Course Credit Hours = "+this.getCourseCreditHours());

    }
    
    
    
    public static void main(String args[]) {
        
        Course c1 = new Course();
        c1.selectDB("CIST 1001");
        c1.display();
        
    
    }
    
    
    
    
}//end class
         
    

