package PetCenter;

public class Dog extends Animal {

    public Dog(String type, String name) {
        super(type, name);

    }

    String makeSound = "(Bark!)";

    @Override
    public String toString() {
        return "Dog: " + name + " " + makeSound;
    }
}