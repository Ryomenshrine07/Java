package Priyanka;

import java.util.Scanner;

class Car
{
    String name;
    String model;
    String color;
    int seats;
    int price;
    Car(String name , String model, String color, int seats, int price)
    {
        setName(name);
        setModel(model);
        setColor(color);
        setPrice(price);
        setSeats(seats);
    }
    void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return this.name;
    }
    void setModel(String model)
    {
        this.model = model;
    }
    String getModel()
    {
        return this.model;
    }
    void setColor(String color)
    {
        this.color = color;
    }
    String getColor()
    {
        return this.color;
    }
    void setSeats(int seats)
    {
        this.seats = seats;
    }
    int getSeats()
    {
        return this.seats;
    }
    void setPrice(int price)
    {
        this.price =price;
    }
    int getPrice()
    {
        return this.price;
    }

}

class Audi extends Car
{
    Audi(String name , String model, String color, int seats, int price)
    {
        super(name, model, color, seats, price);
    }
    void info()
    {
        System.out.println("Name is :"+getName());
        System.out.println("Model is :"+getModel());
        System.out.println("Color of Audi is :"+getColor());
        System.out.println("No. of Seats are :"+getSeats());
        System.out.println("Price of Audi is :"+getPrice());
    }
}


public class CarClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Model For Audi");
        String model = sc.nextLine();
        Audi car1 = new Audi("Audi",model,"Red",2,15000000);
        car1.info();
        System.out.println();
        Audi car2 = new Audi("Audi2","R9","Black",2,1500000);
        car2.info();
    }
}
