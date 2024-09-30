package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import model.Booking;

public class BookingDao {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	
	public boolean addBooking(Booking booking) {
		// 
	}
	
	public ArrayList<Booking> getBookingsByUserId(int user_id) {
		// 
	}
}
