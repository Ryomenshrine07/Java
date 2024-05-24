package POLYMORPHISM;
abstract class Bike
{
    abstract void Handeling();
    abstract void Tires();
    abstract void Milege();
}

class Honda extends Bike
{
    @Override void Handeling()
    {
        System.out.println("Handeling is Average");
    }
    @Override void Tires()
    {
        System.out.println("Tires are of Good quality");
    }
    @Override void Milege()
    {
        System.out.println("Milege is Very Good");
    }
}
class KTM extends Bike
{
    @Override void Handeling()
    {
        System.out.println("Handeleing is Very Good");
    }
    @Override void Tires()
    {
        System.out.println("Tires Are of one of the best qualities");
    }
    @Override void Milege()
    {
        System.out.println("Milege is Good");
    }
}
class Suzuki extends Bike
{
    @Override void Handeling()
    {
        System.out.println("Handeling is exceptional");
    }
    @Override void Tires()
    {
        System.out.println("Tires are thick and very durable");
    }
    @Override void Milege()
    {
        System.out.println("Milege is Average");
    }
}

public class Ab_class_ex 
{
  public static void main(String[] args) 
  {
    Bike Hero,Duke,Hayabusa;
    Hero = new Honda();
    Hero.Handeling();
    Hero.Tires();
    Hero.Milege();
    
    Duke = new KTM();
    Duke.Handeling();
    Duke.Tires();
    Duke.Milege();

    Hayabusa = new Suzuki();
    Hayabusa.Handeling();
    Hayabusa.Tires();
    Hayabusa.Milege();
  }  
}
