package W2P1;

public class Cow extends FarmAnimal implements Milkable {
    public Cow(String name) {
        super(name);
    }
    @Override public void makeSound() {
        System.out.println("Moo!");
    }
    @Override public void milk() {
        System.out.println(getName() + " is being milked.");
    }
}
