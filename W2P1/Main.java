package W2P1;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Bessie");
        FarmAnimal chicken = new Chicken("Clucky");
        Dog dog = new Dog("Rex");

        cow.makeSound(); //Output: Moo!
        cow.eat(); //Output: Bessie is eating.
        cow.milk(); //Output: Bessie is being milked.
        chicken.makeSound(); //Output: Cluck!
        chicken.eat(); //Output: Clucky is eating.
        dog.makeSound(); //Output: Woof!
        dog.eat(); //Output: Rex is eating.
        dog.play(); //Output: Rex is playing fetch.
    }
}
