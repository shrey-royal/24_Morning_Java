class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    protected void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void eat() {
        super.eat();
    }

    public void bark() {
        System.out.println(super.name + " is barking.");
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void eat() {
        super.eat();
    }

    public void meow() {
        System.out.println(super.name + " is meowing.");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy");
        Cat c = new Cat("Whiskers");

        d.eat();
        d.bark();
        
        c.eat();
        c.meow();
    }
}
