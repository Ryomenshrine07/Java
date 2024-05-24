package Hacker_code;

import java.util.Scanner;

public class q7 
{
  public static void main(String[] args) 
  {
    String s;
    int a,b;
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
        a =sc.nextInt();
        b =sc.nextInt();
        sc.nextLine();
        s=sc.nextLine();
        System.out.println(a+" "+b+" "+s);
    }
    sc.close();
  }  
}
