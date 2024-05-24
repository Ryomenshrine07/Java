package Strings;

import java.util.Scanner;

public class StringToInteger
{
    static int convertToInteger(String s)
    {
        s = s.strip();
        if (s.length() == 0) {
            return 0;
        }
        int sign;
        if(s.charAt(0) == '-') {
            sign = -1;
        }
        else {
            sign = 1;
        }
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            s = s.substring(1);
        }
        long num = 0;
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (!Character.isDigit(ch)) {
                break;
            }
            num = num * 10 + (ch - '0');
            if (sign * num <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (sign * num >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        return sign * (int) num;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();
        int num = convertToInteger(str);
        System.out.println("Integer SubString is :"+num);
    }
}
