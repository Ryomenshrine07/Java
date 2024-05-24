package Strings;

import java.util.Scanner;

public class LongestCommonSuffix
{
    static void enterElements(String[] strs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Strings");
        for(int i=0;i<strs.length;i++)
        {
            strs[i] = sc.next();
        }
    }
    static String getLongestCommonSuffix(String[] strs)
    {
        if(strs.length == 1)
        {
            return strs[0];
        }
        int k = 0;
        int i = 0;
        String str = "";
        String subString = "";
        int minLength = Integer.MAX_VALUE;
        while(i < strs.length - 1)
        {
            if((k < strs[i].length() && k < strs[i+1].length()) && (strs[i].charAt(k) == strs[i + 1].charAt(k)))
            {
                str = str + strs[i].charAt(k);
                k++;
            }
            else
            {
                i++;
                k = 0;
                if(str.length() < minLength)
                {
                    subString = str;
                    minLength = str.length();
                }
                str = "";
            }
        }
        return subString;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of String");
        int n = sc.nextInt();
        String[] strs = new String[n];
        enterElements(strs);
        String subString = getLongestCommonSuffix(strs);
        System.out.println("Longest Common SubString is :"+subString);
    }
}
