import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = null;
		String getDataQuery = "SELECT * FROM events WHERE id = ?";
		String setDataQuery = "UPDATE events SET event_name = ?, event_date = ?, location = ?, organizer_name = ? WHERE id = ?";
		
		int id = 0;
		String event_name = "";
		String event_date = "";
		String location = ""; 
		String organizer_name = "";
		String input = "";
		
		
		
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(getDataQuery);
			sc = new Scanner(System.in);
			
			System.out.print("Enter the id for update: ");
			pstmt.setInt(1, sc.nextInt());
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				id = rs.getInt("id");
				event_name = rs.getString("event_name");
				event_date = rs.getString("event_date");
				location = rs.getString("location");
				organizer_name = rs.getString("organizer_name");
			} else {
				System.out.println("Failed to fetch the data!");
			}
			
			// 2nd statement for update
			pstmt = conn.prepareStatement(setDataQuery);
			pstmt.setInt(5, id);
			
			sc.nextLine();
			System.out.print("Enter the event name ('-' to use the same): ");
			input = sc.nextLine();
			pstmt.setString(1, input.equals("-") ? event_name : input);
			
			System.out.print("Enter the event date ('-' to use the same): ");
			input = sc.nextLine();
			pstmt.setString(2, input.equals("-") ? event_date : input);
			
			System.out.print("Enter the event location ('-' to use the same): ");
			input = sc.nextLine();
			pstmt.setString(3, input.equals("-") ? location : input);
			
			System.out.print("Enter the event organizer name ('-' to use the same): ");
			input = sc.nextLine();
			pstmt.setString(4, input.equals("-") ? organizer_name : input);
			
			if (pstmt.executeUpdate() == 1) {
				System.out.println("Data updated successfully.");
			} else {
				System.out.println("Failed to update data.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (sc != null) sc.close();
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				System.out.println("Error Closing Connections...");
			}
		}
	}
}
