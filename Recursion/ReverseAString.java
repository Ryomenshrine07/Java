package Recursion;

import java.util.Scanner;

public class ReverseAString
{
    static StringBuilder reverseString(String str,int i,int n)
    {
        StringBuilder s = new StringBuilder(str);
        if(i < n)
        {
            int sp = i;
            int end = n;
            char temp = s.charAt(sp);
            s.setCharAt(sp,s.charAt(end));;
            s.setCharAt(end,temp);
            i++;
            n--;
            reverseString(str,i,n);
        }
        return s;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        int n = str.length()-1;
        int i = 0;
        StringBuilder newStr = reverseString(str,i,n);
        System.out.println("String is :"+newStr);
    }
}
