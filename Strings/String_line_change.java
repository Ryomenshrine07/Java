//package Strings;
import java.util.Scanner;
public class String_line_change 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String str = sc.nextLine();
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)==' ')
        {
            System.out.println();
        }
        else
        System.out.print(str.charAt(i));
    }
    sc.close();
  }  
}
