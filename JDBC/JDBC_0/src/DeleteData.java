import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {
	public static void main(String[] args) {
		PreparedStatement pstmt = null;
		Scanner sc = null;
		String deleteQuery = "DELETE FROM Events WHERE id = ?";
		
		try {
			pstmt = DBConn.getConnection().prepareStatement(deleteQuery);
			sc = new Scanner(System.in);
			
			System.out.print("Enter id to delete: ");
			pstmt.setInt(1, sc.nextInt());
			
			if (pstmt.executeUpdate() == 1) {
				System.out.println("Event deleted successfully.");
			} else {
				System.out.println("Failed to delete event!");
			}
		} catch (Exception e) {
			System.out.println("Error deleting the event...");
			e.printStackTrace();
		} finally {
			try {
				if (sc != null) sc.close();
				if (pstmt != null) pstmt.close();
			} catch (Exception e) {
				System.out.println("Error Closing Connections...");
			}
		}
	}
}
