package Strings;

import java.util.Scanner;

public class LengthOfLastWord
{
    static int calculateLastLength(String s)
    {
        String[] words = s.split(" ");
        int length = 0;
        for(int i=0;i<words[words.length-1].length();i++)
        {
            length++;
        }
        return length;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.nextLine();
        int lastLength = calculateLastLength(s);
        System.out.println("Length of Last Word is :"+lastLength);
    }
}
