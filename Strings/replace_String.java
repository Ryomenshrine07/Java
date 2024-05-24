//package Strings;
import java.util.Scanner;
public class replace_String 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String to be check and replaced");
    String s = sc.nextLine();
    String s2 = sc.nextLine();
    String[] str = {"We will teach you how to...","Move a mountain","Make a million","...all through java!"}; 
    for(int i=0;i<str.length;i++) 
    { 
      String snew = str[i].replace(s, s2);
      str[i] = snew;   
    }
    for(int i=0;i<str.length;i++)
    {
      System.out.println(str[i]+" ");
    }
    sc.close();
  }  
}
