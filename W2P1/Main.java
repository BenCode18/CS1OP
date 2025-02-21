package W2P1;

public class Main {
    public static void main(String[] args) {
        FarmAnimal cow = new Cow("Bessie");
        FarmAnimal chicken = new Chicken("Clucky");
        Dog dog = new Dog("Rex");

        cow.makeSound(); //Output: Moo!
        cow.eat(); //Output: Bessie is eating.
        chicken.makeSound(); //Output: Cluck!
        chicken.eat(); //Output: Clucky is eating.
        dog.makeSound(); //Output: Woof!
        dog.eat(); //Output: Rex is eating.
        dog.play(); //Output: Rex is playing fetch.
    }
}
