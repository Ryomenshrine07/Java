//package Strings;
import java.util.Scanner;
public class array_of_Strings 
{
  public static void main(String[] args) 
  {
    boolean flag = false;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of names you want to input in your List");
    int n =sc.nextInt();
    String[] str = new String[n];
    System.out.println("Enter names of people in which you want to identify the allowed person:");
    for(int i=0;i<n;i++)
    {
        str[i] = sc.nextLine();
    }
    for(int i=0;i<n;i++)
    {
        int a = str[i].compareTo("Vinayak Upadhyay");
        if(a==0)
        {
            flag = true;
            System.out.println("Vinayak Upadhyay can enter in this party");
        }
    }
    if(flag==false)
    System.out.println("You are a trespasser");
    sc.close();
  }  
}
