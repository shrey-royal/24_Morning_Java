/*
Abstraction : Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Abstract Class: A class with the abstract keyword is called an abstract class. It can have abstract and non-abstract methods.

0%-100% abstraction is possible in abstract class.

Rules for Abstract class:

1. must declare with abstract keyword.
2. it can have abstract and non-abstract methods.
3. it cannot be instantiated.
4. it can have constructors and static methods also.
5. it can have final methods which will force the subclass not to change the body of the method.

*/

//abstract class
abstract class Person {
    String name;
    int age;

    abstract void display();    //no body

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }    
}

//concrete class
class Student extends Person {
    int rollNo;

    public Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    @Override
    void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nRollNo: " + rollNo);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        //Anoymous Class
        // new Person("Mohak", 23) {
        //     @Override
        //     void display() {
        //         System.out.println("Anonymous Class");
        //         System.out.println("Name: " + name + "\nAge: " + age);
        //     }
        // }.display();

        // new Student("yug", 26, 223).display();

        Student s = new Student("Vishva", 18, 556);
        s.display();
    }
}
