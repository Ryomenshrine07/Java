//An autobiographical number is a number such that the first digit of it counts how many zeroes are there in it,
// the second digit counts how many ones are there and so on.
//        For example, 1210 has 1 zero, 2 ones, 1 two and 0 threes.

        package FsD6.Numbers_questions;

import java.util.Scanner;

public class Autobiographical_Number
{
    static  boolean check(String n)
    {
        boolean flag = false;
        for(int i = 0; i<10; i++)
        {
            int count = 0;
            for(int j=0;j<n.length();j++)
            {
                char ch = n.charAt(j);
                int num = ch - '0';
                if(i == num)
                {
                    count++;
                }
            }
            if((i<n.length()) && (count == n.charAt(i)-'0'))
            {
                flag = true;
                if(i == n.length()-1)
                    break;
            }
            else
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        String n = sc.nextLine();
        boolean flag = check(n);
        if (flag)
            System.out.println(n+" is Autoboigraphical Number");
        else
            System.out.println(n+" is not Autoboigraphical Number");
    }
}
