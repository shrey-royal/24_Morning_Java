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
	
	public boolean updateUser(User user) {
		String sql = "UPDATE users SET password = ?, email = ?, phone_number = ? WHERE id = ?";
		try {
			pstmt = DBConnection.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getPassword());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPhoneNumber());
			pstmt.setInt(4, user.getId());
			
			if (pstmt.executeUpdate() == 1) {
				return true;
			}
		} catch (Exception e) {
			System.err.println("Error updating user: ");
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
	
	public boolean deleteUser(int userId) {
		String sql = "DELETE FROM users WHERE id = ?";
		try {
			pstmt = DBConnection.getConnection().prepareStatement(sql);
			pstmt.setInt(1, userId);
			
			if (pstmt.executeUpdate() == 1) {
				return true;
			}
		} catch (Exception e) {
			System.err.println("Error deleting user: ");
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
	
	public boolean validateUser(String username, String password) {
		String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
		try {
			pstmt = DBConnection.getConnection().prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			
			return rs.next();
		} catch (Exception e) {
			System.err.println("Error validating the user: ");
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
}
