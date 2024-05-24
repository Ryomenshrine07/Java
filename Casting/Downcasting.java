package Casting;
class Animal 
{
    void bark() 
    {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal 
{
    void bark() 
    {
        System.out.println("Woof! Woof!");
    }
}
public class Downcasting 
{
    public static void main(String[] args) 
    {
        // Upcasting: Creating a Dog object and assigning it to an Animal reference
        Animal myAnimal = new Dog();
        // Downcasting: Casting the Animal reference back to a Dog reference
        // It's important to check instanceof before downcasting to avoid ClassCastException
        if (myAnimal instanceof Dog) 
        {
            Dog myDog = (Dog) myAnimal;
            myDog.bark(); 
        } 
        else 
        {
            System.out.println("Cannot downcast to Dog.");
        }
        myAnimal = new Animal();
        myAnimal.bark();
    }
}


