import java.sql.*;
public class retrivingdata {
   

    public static void main(String[] args) throws ClassNotFoundException{
       String url="jdbc:mysql://localhost:3306/neeraj";
       String username="root";
       String password="2004";
       String query="select *from nkj;";
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           System.out.println("drivers loaded SuccessFully");
       }catch (ClassNotFoundException e)
       {
           System.out.println(e.getMessage());
       }
       try {
           Connection con = DriverManager.getConnection(url, username, password);
           System.out.println("connection esteblished");
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(query);
          rs.next() ;
              String title = rs.getString("title");
              double sallery = rs.getDouble("sallery");
              int id = rs.getInt("id");
              System.out.println();
              System.out.println("==================");
              System.out.println("id:" + id);
              System.out.println("title:" + title);
              System.out.println("sallery:" + sallery);



           rs.close();
           st.close();
           con.close();
           System.out.println();
           System.out.println("connection closed succesfully");
       }
       catch (SQLException e){
           System.out.println(e.getMessage());
       }
    
}
}
