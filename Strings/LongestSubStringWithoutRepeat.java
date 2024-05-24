package Strings;

import java.util.Scanner;

public class LongestSubStringWithoutRepeat
{
    static int getLongestSubString(String s)
    {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        String subString = "";
        while(right<s.length())
        {
            char ch = s.charAt(right);
            int present = subString.indexOf(ch);
            if(present == -1)
            {
                subString = subString + ch;
                System.out.println(subString);
                maxLength = Math.max(maxLength,subString.length());
                right++;
            }
            else
            {
                left = left + present + 1;
                subString = subString.substring(present + 1);
            }
        }
        return maxLength;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.nextLine();
        int subStringLength = getLongestSubString(s);
        System.out.println("Longest Substring Length is :"+subStringLength);
    }
}
