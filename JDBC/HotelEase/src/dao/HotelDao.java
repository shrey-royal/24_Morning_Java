package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Hotel;
import util.DBConnection;

public class HotelDao {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	
	public boolean addHotel(Hotel hotel) {
		String sql = "INSERT INTO hotels (name, location, description) VALUES (?, ?, ?)";
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, hotel.getName());
			pstmt.setString(2, hotel.getLocation());
			pstmt.setString(3, hotel.getDescription());
			
			if (pstmt.executeUpdate() == 1) {
				return true;
			}
		} catch (Exception e) {
			System.out.println("Error adding hotel:");
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
	
	public Hotel getHotelById(int id) {
		String sql = "SELECT * FROM hotels WHERE id = ?";
		
		return null;
	}
}
