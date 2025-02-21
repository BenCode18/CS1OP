package W2P1;

public class Chicken extends FarmAnimal {
    public Chicken(String name){
        super(name);
    }
    @Override public void makeSound() {
        System.out.println("Cluck!");
    }
}
