import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;


public class user_details 
{
    public static void main (String[] args) throws Exception
    {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\Student_Detail.db");
        PreparedStatement pstm = con.prepareStatement("select * from student_data where stud_id = ?") ;
        
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the student id : "+" ");
        int student_id = sc.nextInt() ;

        pstm.setInt(1, student_id);

        ResultSet rs = pstm.executeQuery();

        while(rs.next())
        {
            System.out.println("Id : "+rs.getInt("stud_id")+" ");
            System.out.println("Name : "+rs.getString("stud_name")+" ");
            System.out.println("Address : "+rs.getString("address")+" ");
            System.out.println("Phone_No :"+rs.getString("phone_no")+" ");
            System.out.println("Class :"+rs.getString("class_enrolled")+" ");
            System.out.println("Marks : "+rs.getInt("marks_obtained_final_exam")+" ");


        }

        pstm.close();
        sc.close();
        con.close();
        
        
    }
    
}
