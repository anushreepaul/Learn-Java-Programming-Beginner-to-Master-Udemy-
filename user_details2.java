//JDBC Program : ---->
import java.sql.*;
import java.util.*;
public class user_details2
{
    public static void main (String[] args)throws Exception
    {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\Student_Detail.db");

        //Statement stm = con.createStatement() ;
        PreparedStatement pstm = con.prepareStatement("Select stud_name from student_data where stud_id = ?");

        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter the student id : "+" ");
        
        int id = sc.nextInt();
        pstm.setInt(1, id);

        //ResultSet = stm.executeQuery("   ");
        ResultSet rs = pstm.executeQuery();
        while(rs.next())
        {
            System.out.println("Student_Name : "+rs.getString("stud_name"));
        }

        pstm.close();
        sc.close();
        con.close();


    }
    
}