import java.sql.*;
import java.util.Scanner;

public class buoi5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement stmt = conn.createStatement();
        ) {

            // DELETE 1 book with user-entered id
            System.out.println("\n\nEnter the book  id you want to DELETE: "); Integer deleteID = sc.nextInt();
            String sqlDelete = "delete from books where id = " + deleteID;
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}