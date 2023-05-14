import java.sql.*;

class Database
 {
  /**
   * @param args
   */
  public static void main(String[] args) {
    try {
      
        Class.forName("org.sqlite.JDBC");

      Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\college");

      Statement stm = con.createStatement();

      ResultSet rs = stm.executeQuery("SELECT * FROM college_student");

      while (rs.next()) {
        int stud_id = rs.getInt("college_id");
        String stud_name = rs.getString("student_name");

        System.out.println(stud_id+ "|" +stud_name);
      }


    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}