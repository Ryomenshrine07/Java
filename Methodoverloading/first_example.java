package Methodoverloading;

import java.util.Scanner;

public class first_example 
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static double add(double a,double b)
    {
        return a+b;
    }
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numberz");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = add(a,b);
    System.out.println("Addition is :"+c);
    System.out.println("Enter two decimal value");
    double e = sc.nextDouble();
    double f = sc.nextDouble();
    double res = add(e, f);
    System.out.println("Addition is :"+res);
  }  
}
