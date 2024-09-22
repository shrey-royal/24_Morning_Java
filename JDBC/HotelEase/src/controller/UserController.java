package controller;

import dao.UserDao;
import model.User;
import util.InputValidator;

public class UserController {
	private UserDao userDao;
	
	public UserController() {
		this.userDao = new UserDao();
	}
	
	public String registerUser(String username, String password, String email, String phoneNumber) {
		if (!InputValidator.isValidUsername(username)) {
			return "Invalid username. Username should be alphanumeric and 3-20 characters long.";
		}
		
		if (!InputValidator.isValidEmail(email)) {
            return "Invalid email format.";
        }
        
		if (!InputValidator.isValidPhoneNumber(phoneNumber)) {
            return "Invalid phone number format.";
        }
        
        User user = new User(username, password, email, phoneNumber);
        
        boolean result = userDao.addUser(user);
        if (result) {
        	return "User Registered Successfully!";
        } else {
        	return "Registration failed. Username may already exist.";
        }
	}
	
	public boolean loginUser(String username, String password) {
		return userDao.validateUser(username, password);
	}
	
	public String updateUserProfile(int userId, String newPassword, String newEmail, String newPhoneNumber) {
		if (!InputValidator.isValidEmail(newEmail)) {
            return "Invalid email format.";
        }
        
		if (!InputValidator.isValidPhoneNumber(newPhoneNumber)) {
            return "Invalid phone number format.";
        }
		
		User user = new User(userId, null, newPassword, newEmail, newPhoneNumber);
		boolean result = userDao.updateUser(user);
		if (result) {
        	return "Profile updated Successfully!";
        } else {
        	return "Profile Update failed.";
        }
	}
	
	public String deleteUserAccount(int userId) {
		boolean result = userDao.deleteUser(userId);
		if (result) {
        	return "Profile deleted Successfully!";
        } else {
        	return "Failed to delete user profile.";
        }		
	}
}
