package W2P1;

public class Dog extends FarmAnimal implements Pet {
    public Dog(String name) {
        super(name);
    }
    @Override public void makeSound() {
        System.out.println("Woof!");
    }
    @Override public void play() {
        System.out.println(getName() + " is playing fetch.");
    }
}
