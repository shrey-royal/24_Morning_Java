// final class ChhotaBheem {   //constant - stops inheritance
//     final String strength = "immense";

//     void showStrength() {
//         System.out.println("Chhota Bheem Strength is: " + strength);
//     }
    
//     final void powerPunch() {   //constant - stops overriding
//         System.out.println("Chhota Bheem performs the Power Punch!");
//         // strength = "Low";   //stops value change
//     }
// }

// class Dholakpur extends ChhotaBheem {
//     @Override
//     void showStrength() {
//         System.out.println("Immense strength of bheem");
//     }

//     @Override
//     void powerPunch() {
//         System.out.println("Power Punch!");
//     }
// }


public class Final_KW {
    public static void main(String[] args) {
        // Dholakpur dholakpur = new Dholakpur();

        // dholakpur.showStrength();
        // dholakpur.powerPunch();
    }
}

/*
Final Keyword is used to restrict the user:
    > value change
    > method override
    > inheritance

Tasks:

final keyword:

Scenario 1: Math Constants
In a mathematical calculation library, define a class called "MathConstants" with final variables for commonly used mathematical constants like pi and e. These variables cannot be modified and hold their constant values throughout the program.

Scenario 2: Configuration Settings
In a configuration management system, define a class called "Configuration" with final variables for system settings like database URL, username, and password. These variables cannot be modified and represent fixed configuration values.

Scenario 3: Math Calculations
In a math calculation library, define a class called "MathUtils" with final methods for commonly used mathematical calculations like square root and logarithm. These methods cannot be overridden and provide consistent behavior throughout the program.


*/