package Hacker_code;
import java.util.Scanner;
public class q5 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    String s="";
    if(n>=-100&&n<=100)
    {
      s=Integer.toString(n);
    }
    if(n==Integer.parseInt(s))
    System.out.println("Good job");
    else
    System.out.println("Wrong answer");
    sc.close();
  }  
}
