// 4. Temperature Conversion: Implement a class `TemperatureConverter` with overloaded methods `convert()` to convert temperatures from Celsius to Fahrenheit, Fahrenheit to Celsius, and Celsius to Kelvin.

public class MT_OVERLOAD {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        System.out.println("25.0 C is " + converter.convert(25.0) + " F");
        
        System.out.println("77.0 F is " + converter.convert(77.0, true) + " C");
        
        System.out.println("25.0 C is " + converter.convert(25.0, true, true) + " K");
    }
}

class TemperatureConverter {
    public double convert(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double convert(double fahrenheit, boolean isFahrenheit) {
        if (isFahrenheit) {
            return (fahrenheit - 32) * 5/9;
        }
        return 0.0;
    }

    public double convert(double celsius, boolean tokelvin, boolean isCelsius) {
        if(tokelvin && isCelsius) {
            return celsius + 273.15;
        }
        return 0.0;
    }
}