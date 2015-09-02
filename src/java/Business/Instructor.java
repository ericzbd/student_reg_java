/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Eric
 */
public class Instructor {
    

    public String instructorId;
    public String instructorFirstName;
    public String instructorLastName;
    public String instructorStreet;
    public String instructorCity;
    public String instructorState;
    public String instructorZip;
    public String instructorOffice;
    public String instructorEmail;

    
    public Instructor(){   
        
        instructorId = "";
        instructorFirstName = "";
        instructorLastName = "";
        instructorStreet = "";
        instructorCity = "";
        instructorState = "";
        instructorZip = "";
        instructorOffice="";
        instructorEmail = "";

    }
    
    
    /****************************************************************************************************************
     * 
     * This method takes the instructor's ID and pulls out the Instructor object info from database
     *
     * 
    ****************************************************************************************************************/
       public void selectDB(String instructorId){

        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection c1 = DriverManager.getConnection("jdbc:odbc:RegistrationDB");
                System.out.println("Database connected");
                
                Statement statement = c1.createStatement();
                
                String sql = "Select * from Instructors where ID="+instructorId;
                
                System.out.println(sql);
                
                
                ResultSet rs = statement.executeQuery(sql);
                
                rs.next();
             //   instructorId=rs.getInt(1);
                instructorFirstName=rs.getString(2);
                instructorLastName=rs.getString(3);
                instructorStreet=rs.getString(4);
                instructorCity=rs.getString(5);
                instructorState=rs.getString(6);
                instructorZip=rs.getString(7);
                instructorOffice=rs.getString(8);
                instructorEmail=rs.getString(9);

            		    					
                   
         }//end try
                   
         catch(Exception e)
              {System.out.println("Foiled/Hogtied"+e); }
       
        
        
    }//end selectDB
      
       
           public void insertDB(String newInstructorId, String newInstructorPassword, String newInstructorFirstName, String newInstructorLastName, 
                   String newInstructorStreet, String newInstructorCity, String newInstructorState, String newInstructorZip, String newInstructorOffice, 
                   String newInstructorEmail){
    	
        instructorId = newInstructorId;           
          
        instructorFirstName = newInstructorFirstName;
                
        instructorLastName = newInstructorLastName;
        
        instructorStreet = newInstructorStreet;
        instructorCity = newInstructorCity;
        instructorState = newInstructorState;
        instructorZip = newInstructorZip;
        
        instructorOffice = newInstructorOffice;
        instructorEmail = newInstructorEmail;     

      
      
        try {
    		
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			
    		System.out.println("Driver loaded");
    		
                Connection c1 = DriverManager.getConnection("jdbc:odbc:RegistrationDB");
    			
    		System.out.println("Database connected");
    		
    		Statement statement = c1.createStatement();
          
                String sql = "INSERT into Instructors VALUES('" + newInstructorId + "', '" + newInstructorFirstName + "', '" + newInstructorLastName + "', '" + 
                          newInstructorStreet + "', '" + newInstructorCity + "', '" + newInstructorState + "', '" + newInstructorZip + "', '" + newInstructorOffice + "', '" + 
                          newInstructorEmail + "')";

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

            public String getInstructorId(){

            return instructorId;
            
            }   
            
            public void setInstructorId(String newInstructorId){

            instructorId = newInstructorId;

            }
            

                    public String getInstructorFirstName(){

            return instructorFirstName;
        }    
        public void setInstructorFirstName(String newInstructorFirstName){

            instructorFirstName = newInstructorFirstName;

        }
        
        public String getInstructorLastName(){

            return instructorLastName;
        }    
        public void setInstructorLastName(String newInstructorLastName){

            instructorLastName = newInstructorLastName;

        }
        
        public String getInstructorStreet(){

            return instructorStreet;
        }    
        public void setInstructorStreet(String newInstructorStreet){

            instructorStreet = newInstructorStreet;

        }
        
                public String getInstructorCity(){

            return instructorStreet;
        }    
        public void setInstructorCity(String newInstructorCity){

            instructorCity = newInstructorCity;

        }
        
         
        
                public String getInstructorState(){

            return instructorState;
        }    
        public void setInstructorState(String newInstructorState){

            instructorState = newInstructorState;

        }
        
        public String getInstructorZip(){

            return instructorZip;
        }    
        public void setInstructorZip(String newInstructorZip){

            instructorZip = newInstructorZip;

        }                
		
		public String getInstructorOffice(){

            return instructorOffice;
        }    
        public void setInstructorOffice(String newInstructorOffice){

            instructorOffice = newInstructorOffice;

        }
        
        


        public String getInstructorEmail(){

            return instructorEmail;
        }    
        public void setInstructorEmail(String newInstructorEmail){

            instructorEmail = newInstructorEmail;

        }
/*
    public boolean login (String guipw){
        
        String pwdb = getInstructorPassword();
        if (guipw.equals(pwdb)){
            
            return true;
            
        }
        
        else {
         return false;   
        }//end if
  
        
    }//end login
       */
    
       public void display() {
        System.out.println("Instructor ID = "+this.getInstructorId());
        System.out.println("Instructor First Name = "+this.getInstructorFirstName());
        System.out.println("Instructor Last Name = "+this.getInstructorLastName());
        System.out.println("Instructor Street = "+this.getInstructorStreet());
        System.out.println("Instructor City = "+this.getInstructorCity());
        System.out.println("Instructor State = "+this.getInstructorState());
        System.out.println("Instructor Zip = "+this.getInstructorZip());
        System.out.println("Instructor Office = "+this.getInstructorOffice());        
        System.out.println("Instructor Email = "+this.getInstructorEmail());
                
    }
    
    
    
    public static void main(String args[]) {
        
        Instructor i1 = new Instructor();
        i1.selectDB("3");
        i1.display();
        
    
    }
    
    
    
    
}//end class
         
    

