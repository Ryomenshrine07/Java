//package Numbers_questions;

import java.util.Scanner;

public class Decimal_To_Hexadecimal 
{
    void display(int n)
    {
        String str = "";
        String hexa = "";
        int d , c = n;
        while(n!=0)
        {
            d = n % 16;
            if(d >= 10 && d <= 16)
            {
                char ch = (char)(d + 55);
                str = str + ch;
            }
            else
            {
            str = str + Integer.toString(d);
            }
            n = n / 16;
        }
        for(int i=str.length()-1;i>=0;i--)
        {
            hexa = hexa + str.charAt(i);
        }
        System.out.println("Hexadecimal Equivalent Of "+c+" is : "+hexa);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       Decimal_To_Hexadecimal obj = new Decimal_To_Hexadecimal();
       obj.display(n);
       sc.close();
    }
}
