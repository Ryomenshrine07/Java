package OOPS;//package OOPS;
import java.util.Scanner;
class Student1
{
    int roll_no,age;
    String name,email;
    void get_info()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's name");
        name = sc.nextLine();
        System.out.println("Enter Student's Age");
        age = sc.nextInt();
        System.out.println("Enter Student's Roll no.");
        roll_no = sc.nextInt();
        System.out.println("Enter Student's Email");
        email = sc.nextLine();
    }
    void gaming()
    {
        System.out.println(name+" is gaming");
    }
    void bath()
    {
        System.out.println("Student is taking bath");
    }
    void eat()
    {
        System.out.println("Student is eating");
    }
    void sleep()
    {
        System.out.println("Student is Sleeping");
    }
}

public class Student_object 
{
  public static void main(String[] args) 
  {
    Student1 s1 = new Student1();
    s1.get_info();
    Student1 s2 = new Student1();
    s2.get_info();
    s1.eat();
    s2.gaming();
  }  
}
