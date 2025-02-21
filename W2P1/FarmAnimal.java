package W2P1;

public abstract class FarmAnimal {
    private String name;

    public FarmAnimal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }
    public abstract void makeSound();
}
