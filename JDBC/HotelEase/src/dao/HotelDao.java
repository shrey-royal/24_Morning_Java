package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
	    try {
	        conn = DBConnection.getConnection();
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setInt(1, id);
	        ResultSet rs = pstmt.executeQuery();
	        
	        if (rs.next()) {
	            return new Hotel(
	                rs.getInt("id"),
	                rs.getString("name"),
	                rs.getString("location"),
	                rs.getString("description")
	            );
	        }
	    } catch (Exception e) {
	        System.out.println("Error finding hotel:");
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
	
	public ArrayList<Hotel> getAllHotels() {
		ArrayList<Hotel> hotels = null;
		
		String sql = "SELECT * FROM hotels";
		
		try {
	        conn = DBConnection.getConnection();
	        pstmt = conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        hotels = new ArrayList<>();
	        
	        while (rs.next()) {
	            hotels.add(new Hotel(
	                rs.getInt("id"),
	                rs.getString("name"),
	                rs.getString("location"),
	                rs.getString("description")
	            ));
	        }
	    } catch (Exception e) {
	        System.out.println("Error finding hotel:");
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
		
		return hotels;
	}
	
	public boolean updateHotel(Hotel hotel) {
		String sql = "UPDATE hotels SET name = ?, location= ?, description = ? WHERE id = ?";
		try {
			pstmt = DBConnection.getConnection().prepareStatement(sql);
			pstmt.setInt(4, hotel.getId());
			pstmt.setString(1, hotel.getName());
			pstmt.setString(2, hotel.getLocation());
			pstmt.setString(3, hotel.getDescription());
			
			if (pstmt.executeUpdate() == 1) {
				return true;
			}
		} catch (Exception e) {
			System.err.println("Error updating Hotel: ");
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
	
	public boolean deleteHotel(int Id) {
		String sql = "DELETE FROM hotels WHERE id = ?";
		try {
			pstmt = DBConnection.getConnection().prepareStatement(sql);
			pstmt.setInt(1, Id);
			
			if (pstmt.executeUpdate() == 1) {
				return true;
			}
		} catch (Exception e) {
			System.err.println("Error deleting Hotel: ");
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
