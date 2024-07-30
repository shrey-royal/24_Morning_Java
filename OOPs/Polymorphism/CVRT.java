class Animal {
    public String makeSound() {
        return "Animal Sound";
    }

    public Animal getAnimal() {
        return this;
    }
}

class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Bark";
    }

    @Override
    public Dog getAnimal() {
        return this;
    }
}

class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public Cat getAnimal() {
        return this;
    }
}


public class CVRT {
    public static void main(String[] args) {
        Animal animal;
        
        animal = new Animal();
        // System.out.println(animal.makeSound());
        System.out.println(animal.getClass().getSimpleName());
        
        animal = new Dog(); //Upcasting
        // System.out.println(animal.makeSound());
        System.out.println(animal.getClass().getSimpleName());

        animal = new Cat(); //Upcasting
        // System.out.println(animal.makeSound());
        System.out.println(animal.getClass().getSimpleName());


        animal = new Animal();
        System.out.println(animal.getAnimal().getClass().getSimpleName());

        animal = new Dog();
        System.out.println(animal.getAnimal().getClass().getSimpleName());

        animal = new Cat();
        System.out.println(animal.getAnimal().getClass().getSimpleName());


    }
}
