package model;

public class Hotel {
	private int id;
	private String name;
	private String location;
	private String description;
	
	public Hotel(int id, String name, String location, String description) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.description = description;
	}

	public Hotel(String name, String location, String description) {
		this.name = name;
		this.location = location;
		this.description  = description;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}
