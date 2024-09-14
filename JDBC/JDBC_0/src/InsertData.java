import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = null;
		String sql = "INSERT INTO Events (event_name, event_date, location, organizer_name) VALUES (?, ?, ?, ?)";
		
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(sql);
			sc = new Scanner(System.in);
			
			System.out.print("Enter event name: ");
			pstmt.setString(1, sc.nextLine());
			System.out.print("Enter event datetime (DDDD-MM-YY HH:MM:SS): ");
			pstmt.setString(2, sc.nextLine());
			System.out.print("Enter event location: ");
			pstmt.setString(3, sc.nextLine());
			System.out.print("Enter event organizer name: ");
			pstmt.setString(4, sc.nextLine());
			
			int ra = pstmt.executeUpdate();
			
			if (ra == 1) {
				System.out.println("Event registered successfully.");
			} else {
				System.out.println("Failed to register event!");
			}
		} catch (Exception e) {
			System.out.println("Error registering for the event...");
			e.printStackTrace();
		} finally {
			try {
				if (sc != null) sc.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				System.out.println("Error Closing Connections...");
			}
		}
	}
	
}