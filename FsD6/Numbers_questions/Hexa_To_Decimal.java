package FsD6.Numbers_questions;

import java.util.Scanner;

public class Hexa_To_Decimal 
{
    void display(String n)
    {
        int d = 0, sum = 0 , flag = 0;
        for(int i=n.length()-1,k=0;i>=0;i--,k++)
        {
            char ch = n.charAt(i);
            if(ch >= 65 && ch <= 71)
            {
                d = ch - 55;
            }
            else if(ch >= 48 && ch <= 57)
            {
                d = ch - '0';
            }
            else
            {
                flag = 1;
                break;
            }
            sum = sum + (int)(Math.pow(16, k) * d);     
        }
        if(flag == 1)
        System.out.println("Wrong input");
        else
        System.out.println("Decimal Equivalent Of "+n+" is : "+sum);
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Hexadecimal number");
       String n = sc.nextLine();
       Hexa_To_Decimal obj = new Hexa_To_Decimal();
       obj.display(n);
       sc.close();
    }
}
