package OOPS;

class Animal
{
    int weight = 100;
    void eat()
    {
        System.out.println("Animal is Eating");
    }
    void sleep()
    {
        System.out.println("Animal is Sleeping");
    }
}

class dog extends Animal
{
    int weight = 20;
    void eat()
    {
        System.out.println("Dog is Eating");
    }
    void sleep()
    {
        System.out.println("Dog is Sleeping");
    }
}

class cat extends Animal
{
    int weight = 10;
    void eat()
    {
        System.out.println("Cat is Eating");
    }
    void sleep()
    {
        System.out.println("Cat is Sleeping");
    }
}

public class Dynamin_Binding 
{
    static void action(Animal a) 
    {
        try
        {

        if(a instanceof dog)
        {
            a =(dog) a;
            a.eat();
            a.sleep();
            // a = (Animal) a; //--> why dog is eating ?
            a.eat();
        }
        else if( a instanceof cat)
        {
            a = (cat) a;
            a.eat();
            a.sleep();
        }  
        System.out.println(a.weight); // Instance variable of [Animal class] has most Priority.
        }
        catch(Exception e)
        {
            System.out.println("Cannot Downcast");
        }
    } 
    public static void main(String[] args) 
    {
         cat c = new cat();
         action(c);
         dog d = new dog();
         action(d);
    }
}
