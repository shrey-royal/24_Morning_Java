package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Booking;
import util.DBConnection;

public class BookingDao {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	
	public boolean addBooking(Booking booking) {
		String sql = "INSERT INTO bookings (user_id, hotel_id, start_date, end_date, booking_status) VALUES (?, ?, ?, ?, ?)";
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, booking.getUser_id());
			pstmt.setInt(2, booking.getHotel_id());
			pstmt.setString(3, booking.getStartDate());
			pstmt.setString(4, booking.getEndDate());
			pstmt.setString(5, booking.getBooking_status());
			
			if (pstmt.executeUpdate() == 1) {
				return true;
			}
		} catch (Exception e) {
			System.out.println("Error adding booking: ");
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
	
	public ArrayList<Booking> getBookingsByUserId(int user_id) {
		ArrayList<Booking> bookings = null;
		String sql = "SELECT * FROM bookings WHERE user_id = ?";
		
		try {
	        conn = DBConnection.getConnection();
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setInt(1, user_id);
	        ResultSet rs = pstmt.executeQuery();
	        bookings = new ArrayList<>();
	        
	        while (rs.next()) {
	            bookings.add(new Booking(
	                rs.getInt("id"),
	                rs.getInt("user_id"),
	                rs.getInt("hotel_id"),
	                rs.getString("start_date"),
	                rs.getString("end_date"),
	                rs.getString("booking_status")
	            ));
	        }
	    } catch (Exception e) {
	        System.out.println("Error booking hotel:");
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
		
		return bookings;
	}
}
