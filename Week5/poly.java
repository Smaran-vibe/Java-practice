package Week5;

class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class poly {
    public static void main(String[] args) {

        Animal a = new Animal();

        a.sound();

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();

    }

}
