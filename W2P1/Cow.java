package W2P1;

public class Cow extends FarmAnimal {
    public Cow(String name) {
        super(name);
    }
    @Override public void makeSound() {
        System.out.println("Moo!");
    }
}
