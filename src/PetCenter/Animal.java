package PetCenter;

public class Animal {
    protected String type;
    protected String name;

    public Animal(String type, String name){
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal type: " + type + ", pet name: " + name + ".";
    }

    public void makeSound(){
        System.out.println(name + " makes a sound to get your attention.");
    }
}
