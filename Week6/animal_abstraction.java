package Week6;
abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + " says: Bark");
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + " says: Meow");
    }
}

public class  animal_abstraction {
    public static void main(String[] args) {

        Animal a1 = new Dog("Speed");
        Animal a2 = new Cat("Nya");

        a1.sound();
        a2.sound();

        a1.eat();
        a2.eat();
    }
}

