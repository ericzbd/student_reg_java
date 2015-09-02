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
public class Section {
    

    public String sectionCrn;
    public String sectionCourseId;
    public String sectionTimeDays;
    public String sectionRoomNo;
    public String sectionInstructor;


    
    public Section(){   
        
        sectionCrn = "";
        sectionCourseId = "";
        sectionTimeDays = "";
        sectionRoomNo = "";
        sectionInstructor = "";


    }
    
    
    /****************************************************************************************************************
     * 
     * This method takes the Section's CRN and pulls out the Section object info from database
     *
     * 
    ****************************************************************************************************************/
       public void selectDB(String sectionCrn){

        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection c1 = DriverManager.getConnection("jdbc:odbc:RegistrationDB");
                System.out.println("Database connected");
                
                Statement statement = c1.createStatement();
                
                String sql = "Select * from Sections where CRN="+sectionCrn;
                
                System.out.println(sql);
                
                
                ResultSet rs = statement.executeQuery(sql);
                
                rs.next();
             //   sectionCrn=rs.getInt(1);
                sectionCourseId=rs.getString(2);
                sectionTimeDays=rs.getString(3);
                sectionRoomNo=rs.getString(4);
                sectionInstructor=rs.getString(5);


            		    					
                   
         }//end try
                   
         catch(Exception e)
              {System.out.println("Foiled/Hogtied"+e); }
       
        
        
    }//end selectDB
      
       
           public void insertDB(String newSectionCrn, String newSectionCourseId, String newSectionTimeDays, 
                   String newSectionRoomNo, String newSectionInstructor){
    	
        sectionCrn = newSectionCrn;           
          
        sectionCourseId = newSectionCourseId;
                
        sectionTimeDays = newSectionTimeDays;
        
        sectionRoomNo = newSectionRoomNo;
		
        sectionInstructor = newSectionInstructor;

      
        try {
    		
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			
    		System.out.println("Driver loaded");
    		
                Connection c1 = DriverManager.getConnection("jdbc:odbc:RegistrationDB");
    			
    		System.out.println("Database connected");
    		
    		Statement statement = c1.createStatement();
          
                String sql = "INSERT into Sections VALUES('" + newSectionCrn + "', '" + newSectionCourseId + "', '" + newSectionTimeDays + "', '" + 
                          newSectionRoomNo + "', '" + newSectionInstructor + "')";

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

        public String getSectionCrn(){

        return sectionCrn;

        }   

        public void setSectionCrn(String newSectionCrn){

        sectionCrn = newSectionCrn;

        }


        public String getSectionCourseId(){

            return sectionCourseId;
        }    
        public void setSectionCourseId(String newSectionCourseId){

            sectionCourseId = newSectionCourseId;

        }
        
        public String getSectionTimeDays(){

            return sectionTimeDays;
        }    
        public void setSectionTimeDays(String newSectionTimeDays){

            sectionTimeDays = newSectionTimeDays;

        }
        
        public String getSectionRoomNo(){

            return sectionRoomNo;
        }    
        public void setSectionRoomNo(String newSectionRoomNo){

            sectionRoomNo = newSectionRoomNo;

        }
        
                public String getSectionInstructor(){

            return sectionInstructor;
        }    
        public void setSectionInstructor(String newSectionInstructor){

            sectionInstructor = newSectionInstructor;

        }
        
         
        
        
    
    
       public void display() {
        System.out.println("Section Course Id = "+this.getSectionCourseId());
        System.out.println("Section Time/Days = "+this.getSectionTimeDays());
        System.out.println("Section Room No = "+this.getSectionRoomNo());
        System.out.println("Section Instructor = "+this.getSectionInstructor());

                
    }
    
    
    
    public static void main(String args[]) {
        
        Section s1 = new Section();
        s1.selectDB("30101");
        s1.display();
        
    
    }
    
    
    
    
}//end class
         
    

