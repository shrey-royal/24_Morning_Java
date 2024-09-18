package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;

public class InputValidator {
	
	public static boolean isValidEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(emailRegex);
		if(email == null) {
			return false;
		}
		return pattern.matcher(email).matches();
	}
	
	public static boolean isValidPhoneNumber(String phoneNumber) {
		String phoneRegex = "^(\\+\\d{1,3})?\\d{10,15}$";
		Pattern pattern = Pattern.compile(phoneRegex);
		if(phoneNumber == null) {
			return false;
		}
		return pattern.matcher(phoneNumber).matches();
	}
	
	public static boolean isValidDate(String dateStr) {
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		try {
			LocalDate date = LocalDate.parse(dateStr, dateFormatter);
			return !date.isBefore(LocalDate.now());
		} catch (DateTimeParseException e) {
			return false;
		}
	}
}
