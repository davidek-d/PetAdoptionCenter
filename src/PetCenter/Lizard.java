package PetCenter;

public class Lizard extends Animal {

    public Lizard(String type, String name) {
        super(type, name);

    }

    String makeSound = "(SSSSssssSSSSssss)";

    @Override
    public String toString() {
        return "Lizard: " + name + " " + makeSound;
    }
}