class Calculator {
    double division(double a, double b) throws ArithmeticException {
        if(b == 0) throw new ArithmeticException("Denominator can't be Zero!");
        return a/b;
    }
}

class Shubham {
    public static void study(int milliseconds) {
        if(milliseconds >= 1000) throw new ArithmeticException("Leave it!");
        else System.out.println("Study Now...");
    }
}

public class Throwww {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Before Exception");
        try {
            Shubham.study(5000);
            // System.out.println(c.division(23, 0));
        } catch (Exception e) {
            e.printStackTrace();
            // System.out.println(e.getMessage());
        }
        System.out.println("After Exception");
    }
}
/*
Tasks:

1. Custom Exception in Banking System: Develop a simplified banking system in Java that utilizes custom exceptions using the 'throw' keyword. Implement scenarios where 'throw' is used to handle insufficient balance or invalid transaction exceptions.

2. Input Validation in a User Registration System: Write a Java program for a user registration system where the 'throw' keyword is employed to manage input validation errors. For instance, use 'throw' to handle cases like invalid email formats or missing required fields during user registration.

3. Exception Handling in a Calculator: Design a calculator program in Java that employs the 'throw' statement to manage arithmetic exceptions. Create situations where 'throw' is used to handle divide-by-zero errors or invalid mathematical operations.

4. Network Connection Error Handling: Develop a network handling module in Java where the 'throw' keyword is used to manage connection errors. Simulate scenarios where 'throw' is employed to handle cases like timeouts or unreachable hosts during network operations.

*/