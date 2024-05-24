package Strings;

import java.util.Scanner;

public class LargestSubString
{
    static boolean checkPallinOrNot(String str)
    {
        int sp = 0;
        int end = str.length() - 1;
        boolean flag = false;
        while(sp <= end)
        {
            if(str.charAt(sp) == str.charAt(end))
            {
                flag = true;
            }
            else
            {
                flag = false;
                return flag;
            }
            sp++;
            end--;
        }
        return flag;
    }
    static String findMaxSubString(String s)
    {
        if(s.length() == 1)
        {
            return s;
        }
        int maxSubLength = 0;
        String maxstring = "";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String subString = s.substring(i,j+1);
                boolean flag = checkPallinOrNot(subString);
                if(flag)
                {
                    if(subString.length() > maxSubLength)
                    {
                        maxSubLength = subString.length();
                        maxstring = subString;
                    }
                }
            }
        }
        return maxstring;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();
        String maxSubString = findMaxSubString(str);
        System.out.println("Maximum SubString is :"+maxSubString);
    }
}
