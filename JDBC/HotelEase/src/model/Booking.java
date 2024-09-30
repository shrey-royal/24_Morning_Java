package model;

public class Booking {
	private int id;
	private int user_id;
	private int hotel_id;
	private String startDate;
	private String endDate;
	private String booking_status;
	
	public Booking() {}
	
	public Booking(int id, int user_id, int hotel_id, String startDate, String endDate, String booking_status) {
		this.id = id;
		this.user_id = user_id;
		this.hotel_id = hotel_id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.booking_status = booking_status;
	}
	
	public Booking(int user_id, int hotel_id, String startDate, String endDate, String booking_status) {
		this.user_id = user_id;
		this.hotel_id = hotel_id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.booking_status = booking_status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getBooking_status() {
		return booking_status;
	}
	public void setBooking_status(String booking_status) {
		this.booking_status = booking_status;
	}
}
