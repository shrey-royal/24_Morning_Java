import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	private static final String URL = "jdbc:mysql://localhost:3306/morning_java";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
	
//	public static void main(String[] args) {
//		try {
//			System.out.println(getConnection());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
