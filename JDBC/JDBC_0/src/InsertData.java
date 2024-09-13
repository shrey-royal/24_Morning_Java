import java.sql.Connection;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String sql = "INSERT INTO Event (event_name, event_date, location, organizer_name) VALUES ('Annual Employee Awards Ceremony', '2024-12-15 17:00:00', 'The Grand Ballroom, City Hotel', 'Victoria Harris');";
		
		try {
			conn = DBConn.getConnection();
			stmt = conn.createStatement();
			
			int ra = stmt.executeUpdate(sql);
			
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
				if (conn != null) conn.close();
				if (stmt != null) stmt.close();
			} catch (Exception e) {
				System.out.println("Error Closing Connections...");
			}
		}
	}
	
}