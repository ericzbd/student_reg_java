import java.sql.*;


public class Student {
	//Properties
        public String sid;
        public String pw;
        public String fName;
        public String lName;
        public String street;
        public String city;
        public String state;
        public String zip;
        public String email;
        double gpa = 0.0;
     
    //Constructors
    public Student() {
    	
    	 sid = "";
         
         pw = "";
         
         fName = "";
         
         lName = "";
         
         street = "";
         
         city = "";
         
         state = "";
         
         zip = "";
         
         email = "";
         
         gpa = 0.0;

    }//end constructor 1    

    public Student(String newSid, String newPw, String newFName, String newLName, String newStreet, String newCity, 
	String newState, String newZip, String newEmail, double newGPA){
	
	
    
        sid = newSid;           
        
        pw= newPw;
    
        fName = newFName;
        
        lName = newLName;
                
        street = newStreet;
        
        state = newState;
        
        zip = newZip;     
        
        email = newEmail;
        
        gpa = newGPA;
        
    }
        
        public void setSid(String newSid){

            sid = newSid;

        }
        public String getSid(){

            return sid;
        }    
        public void setPw(String newPw){

            pw = newPw;

        }
        public String getPw(){

            return pw;
        }    

        public void setFName(String newFName){

            fName = newFName;

        }
        public String getFName(){

            return fName;
        }    
        public void setLName(String newLName){

            lName = newLName;

        }

        public String getLName(){

            return lName;
        }

        public void setStreet(String newStreet){

            street = newStreet;

        }

        public String getStreet(){

            return street;

        }

        public void setCity(String newCity){

            city = newCity;

        }
        
        public String getCity(){

            return city;
        }        
        
        public void setState(String newState){
        
            state = newState;
                        
        }   

        public String getState(){

            return state;

        }

        public void setZip(String newZip){

            zip = newZip;

        }

        public String getZip(){

            return zip;

        }

        public void setEmail(String newEmail){

            email = newEmail;

        }

        public String getEmail(){

            return email;

        }

        public void setGpa(double newGpa){

            gpa = newGpa;

        }

        public double getGpa(){

            return gpa;

        }    
 
   
    
        public void display( ){

                System.out.println("ID: " + sid);
                System.out.println("Password: " + pw);                
		System.out.println("First name: " + fName);
		System.out.println("Last Name: " + lName);
		System.out.println("Street: " + street);
		System.out.println("City: " + city); 
		System.out.println("State: "+state); 
                System.out.println("Zip: " + zip); 
		System.out.println("Email: " + email); 
		System.out.println("GPA: " + gpa);
   
        }//end display    
    
   public void selectDB(String newSid){
    	sid = newSid;
        try {
    		
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    		System.out.println("Driver loaded");
    		
    		Connection c1= DriverManager.getConnection
    			("jdbc:odbc:RegistrationDB");
    		System.out.println("Database connected");
    		
    		Statement statement = c1.createStatement();
          
                String sql = "Select * from Students where ID="+sid;

                System.out.println(sql);
          
    		
    		ResultSet rs = statement.executeQuery(sql);
          
                rs.next();
                        pw=rs.getString(2);                
                        fName=rs.getString(3);
			lName=rs.getString(4);
			street=rs.getString(5);
			city=rs.getString(6);
			state=rs.getString(7);
			zip=rs.getString(8);
			email=rs.getString(9);
			gpa=rs.getDouble(10);
		    					
                   
                   
    			c1.close();
                   
         }//end try
                   
         catch(Exception e)
              {System.out.println("Foiled/Hogtied"); }
    	
    }//end selectDB
   
    public void insertDB(String newSid, String newPw, String newFName, String newLName, String newStreet, String newCity, String newState, String newZip, 
    String newEmail, double newGPA){
    	
        sid = newSid;          
        
        pw= newPw;
    
        fName = newFName;
        
        lName = newLName;
                
        street = newStreet;
        
        state = newState;
        
        zip = newZip;     
        
        email = newEmail;
        
        gpa = newGPA;

      
      
        try {
    		
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			
    		System.out.println("Driver loaded");
    		
    		Connection c1= DriverManager.getConnection("jdbc:odbc:RegistrationDB");
    			
    		System.out.println("Database connected");
    		
    		Statement statement = c1.createStatement();
          
          String sql = "INSERT into Students VALUES(" + newSid + ", '" + newPw + ", '" + newFName + "', '" + newLName + "', '" + newStreet + "', '" + 
                    newCity + "', '" + newState + "', " + newZip + ", '" + newEmail + "', " + newGPA + ")";
          
          System.out.println(sql);
          
    		
    		 int n = statement.executeUpdate(sql);
          
          if (n==1) 
          
            System.out.println("Successful");
            
         else
            
            System.out.println("Fail");
          
    			c1.close();
                   
         }//end try
                   
         catch(Exception e)
              {System.out.println("Foilage"); }
    	
    }//end insertDB
	

    
    public void updateDB(){
    	
        try {
    		
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    		System.out.println("Driver loaded");
    		
    		Connection c1= DriverManager.getConnection
    			("jdbc:odbc:RegistrationDB");
    		System.out.println("Database connected");
    		
    		Statement statement = c1.createStatement();
          
          String sql = "Update Students set Firstname='" + fName + "', " + 
          
          "Lastname = '" + lName + "', " +
          
          "Email = '" + email + "', " +
          
          "gpa = " + gpa +
          
          " where ID = " + sid ;
          
          
          System.out.println(sql);
          
    		
    		int n = statement.executeUpdate(sql);
          
         if (n==1) 
          
            System.out.println("Successful");
            
         else
            
            System.out.println("Fail"); 
          
          
                   
    			c1.close();
                   
         }//end try
                   
         catch(Exception e)
              {System.out.println("Foilage"); }
    	
    }//end updateDB
    
       public boolean login (String guipw){
        
        String pwdb = getPw();
        if (guipw.equals(pwdb)){
            
            return true;
            
        }
        
        else {
         return false;   
        }//end if
  
        
    }//end login
    	
  
   public static void main(String[] args) throws SQLException, ClassNotFoundException{
	   
   //Student s = new Student(4, "Frank", "Jones", "123 Main", "Atlanta", "GA", 30133, "fj@yahoo.com", 3.2);
   
   //s.display();
   
   
 Student s1 = new Student();
   s1.selectDB("2");
   s1.display();
   

 
   
   
      }//end main
  


}//end class