/*
interface Person {
    // String name = "";   //public static final
    // int age = 0;

    void getPersonDetails();    //abstract
}

class Student implements Person {
    public String name;
    public int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void getPersonDetails() {
        System.out.printf("Name: %s\nAge: %d\n", name, age);
    }
}
*/

class CreditCardPayment implements PaymentMethod {
    @Override
    public void authorizePayment(double amount) {
        System.out.println(this.getClass().getSimpleName() + " Authorized");
    }

    @Override
    public void procesRefund(double amount) {
        System.out.println(this.getClass().getSimpleName() + " Refund Processed");
    }

    @Override
    public void verifyUPI(String upi) {
        System.out.println(upi + " verified!");
    }
}

class DebitCardPayment implements PaymentMethod {
    @Override
    public void authorizePayment(double amount) {
        System.out.println(this.getClass().getSimpleName() + " Authorized");
    }

    @Override
    public void procesRefund(double amount) {
        System.out.println(this.getClass().getSimpleName() + " Refund Processed");
    }

    @Override
    public void verifyUPI(String upi) {
        System.out.println(upi + " verified!");
    }
}

class PaymentProcessor {
    public void handlePayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.authorizePayment(amount);
        paymentMethod.procesRefund(amount);
    }
}

public class Inter_face {
    public static void main(String[] args) {
        // Student s = new Student();

        // s.setName("Purab");
        // s.setAge(17);

        // s.getPersonDetails();

        PaymentProcessor pay = new PaymentProcessor();

        pay.handlePayment(new CreditCardPayment(), 2000);
        pay.handlePayment(new DebitCardPayment(), 4000);
    }
}
/*
Interface: Interface in Java is a blueprint of a class. It has static constants and abstract methods only.

> 100% abstraction is possible in interface.


Points to remember:

1. Interface in Java is a blueprint of a class. It has static constants and abstract methods only.
2. the data members of interface are public, static and final by default.
3. no need to use abstract keyword with methods.
4. it cannot be instantiated.
5. it can only be implemented by those classes which inherit it.
6. it cannot have constructors.

*/