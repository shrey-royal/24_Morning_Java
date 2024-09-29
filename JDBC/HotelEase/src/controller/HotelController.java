package controller;

import java.util.ArrayList;

import dao.HotelDao;
import model.Hotel;

public class HotelController {
	private HotelDao hotelDao;
	
	public HotelController() {
		this.hotelDao = new HotelDao();
	}
	
	public String addHotel(String name, String location, String description) {
		Hotel hotel = new Hotel(name, location, description);
		
		if(hotelDao.addHotel(hotel)) return "Hotel added successfully!";
		else return "Failed to add Hotel.";
	}
	
	public Hotel getHotelById(int id) {
		return hotelDao.getHotelById(id);
	}
	
	public ArrayList<Hotel> getAllHotels() {
		return hotelDao.getAllHotels();
	}
	
	public String updateHotel(int old_id, String new_name, String new_location, String new_description) {
		Hotel hotel = new Hotel(old_id, new_name, new_location, new_description);
		
		if(hotelDao.updateHotel(hotel)) return "Hotel updated successfully!";
		else return "Failed to update hotel.";
	}
	
	public String deleteHotel(int id) {
		if (hotelDao.deleteHotel(id)) return "Hotel deleted successfully!";
		else return "Failed to delete hotel.";
	}
}
