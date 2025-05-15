public class interfaces {
    
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); // Outputs: The dog barks.
        System.out.println("Type: " + Animal.TYPE); // Outputs: Type: Animal
    }
}
interface Animal {
// Abstract method (does not have a body)
void sound();

// Constant
String TYPE = "Animal";
}
class Dog implements Animal {
@Override
public void sound() {
    System.out.println("The dog barks.");
}
}
