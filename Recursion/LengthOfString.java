package Recursion;

import java.util.Scanner;

public class LengthOfString
{
    static int findLength(String str)
    {
        if(str.equals(""))
        {
            return 0;
        }
        else
        {
            return findLength(str.substring(1))+1;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        int length = findLength(str);
        System.out.println("Length is:"+length);
    }
}
