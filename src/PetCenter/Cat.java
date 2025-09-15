package PetCenter;

public class Cat extends Animal{

    public Cat(String type, String name) {
        super(type, name);
    }

    String makeSound = "(Meow)";

    @Override
    public String toString() {
        return "Cat: " + name + " " + makeSound;



    }

}
