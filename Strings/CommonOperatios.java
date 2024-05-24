package Strings;

import java.util.Scanner;

public class CommonOperatios
{
    public static void main(String[] args)
    {
        String str = "PRIYANKA";
        for(char c : str.toCharArray())
        {
            System.out.print(c+" ");
        }
        int length = str.length();
        System.out.println("String's Length is :"+length);

        String sunString = str.substring(2);
        System.out.println("SubString From index 2 is :"+sunString);

        String subString2 = str.substring(1,5);
        System.out.println("SubString from index 1 to 5 is :"+subString2);

        String str2 = "PRIYANKA";

        if(str.equals(str2))
        {
            System.out.println("They are Equal");
        }
        else
        {
            System.out.println("They are not Equal");
        }

    }
}
