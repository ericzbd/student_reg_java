import java.sql.*;


public class StudentSchedule {
	//Properties
        public String sid;
        public String crn;

     
    //Constructors
    public StudentSchedule() {
    	
    	 sid = "";
         
         crn = "";
         

    }//end constructor 1    

    public StudentSchedule(String newSid, String newCrn){
	
        sid = newSid;           
        
        crn= newCrn;
        
    }
	
	//	GETTERS AND SETTERS
        
        public void setSid(String newSid){

            sid = newSid;

        }
        public String getSid(){

            return sid;
        }    
        public void setCrn(String newCrn){

            crn = newCrn;

        }
        public String getCrn(){

            return crn;
        }    

        public void display( ){

			System.out.println("ID: " + sid);
			System.out.println("Crn: " + crn);                
   
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

				String sql = "Select * from StudentSchedule where ID="+sid;

				System.out.println(sql);


				ResultSet rs = statement.executeQuery(sql);

				rs.next();
				
				crn=rs.getString(2);      
				
				c1.close();
                   
         }//end try
                   
         catch(Exception e)
		 
              {System.out.println("Foiled/Hogtied"); }
    	
    }//end selectDB
   
    public void insertDB(String newSid, String newCrn){
    	
        sid = newSid;          
        
        crn= newCrn;
    
        try {
    		
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			System.out.println("Driver loaded");

			Connection c1= DriverManager.getConnection("jdbc:odbc:RegistrationDB");
				
			System.out.println("Database connected");

			Statement statement = c1.createStatement();

			String sql = "INSERT into StudentSchedule VALUES(" + newSid + ", '" + newCrn + "')";
                        
                        

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

   public static void main(String[] args) throws SQLException, ClassNotFoundException{
	   
   
        StudentSchedule s1 = new StudentSchedule();
          s1.selectDB("1");
    //      s1.insertDB("1", "30104");
          s1.display();


 
   
   
      }//end main
  


}//end class