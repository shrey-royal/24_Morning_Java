package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.User;
import util.DBConnection;

public class UserDao {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	
	public boolean addUser(User user) {
		String sql = "INSERT INTO users (username, password, email, phone_number) VALUES (?, ?, ?, ?)";
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getPhoneNumber());
			
			if (pstmt.executeUpdate() == 1) {
				return true;
			}
		} catch (Exception e) {
			System.err.println("Error adding new user: ");
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				System.err.println("Error Closing Connections: ");
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public User getUserByUsername(String username) {
		String sql = "SELECT * FROM users WHERE username = ?";
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return new User(
						rs.getInt("id"),
						rs.getString("username"),
						rs.getString("password"),
						rs.getString("email"),
						rs.getString("phone_number")
						);
			}
		} catch (Exception e) {
			System.err.println("Error finding user: ");
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				System.err.println("Error Closing Connections: ");
				e.printStackTrace();
			}
		}
		return null;
	}
	
}
