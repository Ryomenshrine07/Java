package Strings;

import java.util.Scanner;

public class MakeGreatString
{
    static String getGreatString(String s)
    {
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<str.length()-1;i++)
        {
            char cur = str.charAt(i);
            char next = str.charAt(i+1);
            if((cur>=97&&cur<=122)&&(next == cur - 32))
            {
                str.delete(i,i+2);
                i = -1;
            }
            else if((cur>=65&&cur<=90)&&(next == cur + 32))
            {
                str.delete(i,i+2);
                i = -1;
            }
        }
        return String.valueOf(str);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String:");
        String str = sc.nextLine();
        String greatString = getGreatString(str);
        System.out.println("Great String is :"+greatString);
    }
}
