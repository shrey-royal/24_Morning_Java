import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class RetrieveData {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM events";
		
		try {
			conn = DBConn.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			boolean isDataAvailable = false;
			int c = 0;
			
			while (rs.next()) {
				isDataAvailable = true;
				c++;
				System.out.println("Event ID: " + rs.getInt(1));
				System.out.println("Event name: " + rs.getString(2));
				System.out.println("Event datetime: " + rs.getString(3));
				System.out.println("Event location: " + rs.getString(4));
				System.out.println("Event oraganizer name: " + rs.getString(5));
				System.out.println("==========================================================");
			}
			
			if (isDataAvailable) {
				System.out.println(c + " rows Fetched!");
				System.out.println("Event data fetched successfully.");
			} else {
				System.out.println("Failed to fetch event data!");
			}
		} catch (Exception e) {
			System.out.println("Error registering for the event...");
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				System.out.println("Error Closing Connections...");
			}
		}
	}

}
