/*
In a banking application, an account should not allow transactions that would result in an overdraft (i.e., the account balance falls below zero). If a user tries to withdraw more money than they have in their account, you want to handle this situation gracefully.

Custom Exception:
We'll create a custom exception called InsufficientFundsException to represent this specific error condition.
*/

//Custom Exception Class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String errorMessage) {
        super(errorMessage);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance) {
            throw new InsufficientFundsException("Attempted to withdraw " + amount + " but only " + balance + " is available.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: " + balance);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(100);
            account.withdraw(101);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
/*
Tasks:

1. Library Management System: Overdue Book Exception

Problem Statement:
In a library management system, you need to handle cases where a book is returned after the due date. Create a custom exception `OverdueBookException` to manage this scenario.

2. Online Shopping Platform: Invalid Coupon Code Exception

Problem Statement:
In an online shopping platform, handle cases where an invalid coupon code is applied during checkout. Create a custom exception `InvalidCouponCodeException` to represent this error.

3. Healthcare System: Patient Not Found Exception

Problem Statement:
In a healthcare system, handle cases where a patient is not found in the system during a search or update operation. Create a custom exception `PatientNotFoundException` to represent this condition.

4. Travel Booking System: Flight Not Available Exception

Problem Statement:
In a travel booking system, handle cases where a flight is not available for booking. Create a custom exception `FlightNotAvailableException` to manage this scenario.

5. E-Commerce Platform: Product Out of Stock Exception

Problem Statement:
In an e-commerce platform, handle cases where a product is out of stock. Create a custom exception `ProductOutOfStockException` to represent this situation.

*/