package controller;

import java.util.ArrayList;

import dao.BookingDao;
import model.Booking;

public class BookingController {
	private BookingDao bookingDao;
	
	public boolean bookHotel(int userId, int hotelId, String startDate, String endDate, String booking_status) {		
		return bookingDao.addBooking(new Booking(userId, hotelId, startDate, endDate, booking_status));
    }

    public ArrayList<Booking> viewUserBookings(int userId) {
        return bookingDao.getBookingsByUserId(userId);
    }
}
