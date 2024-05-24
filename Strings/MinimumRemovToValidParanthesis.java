package Strings;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class MinimumRemovToValidParanthesis
{
    static String getValidString(String s)
    {
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                stack.push(i);
            }
            else if(ch == ')')
            {
                if(stack.isEmpty())
                {
                    str.setCharAt(i,'#');
                }
                else
                {
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty())
        {
            str.setCharAt(stack.pop(),'#');
        }
        return str.toString().replaceAll("#","");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();
        String validString = getValidString(str);
        System.out.println("Valid String is :"+validString);
    }
}
