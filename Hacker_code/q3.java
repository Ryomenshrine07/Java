package Hacker_code;

import java.util.Scanner;

public class q3 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    String s;
    int i=1;
    while(sc.hasNext())
    {
        s=sc.nextLine();
        System.out.println(i+" "+s);
        i++;
    }
    sc.close();
  }  
}
