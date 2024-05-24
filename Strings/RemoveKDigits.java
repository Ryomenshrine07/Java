package Strings;

import java.util.*;

public class RemoveKDigits
{
    static String removeKDigits(String num,int k)
    {
        int size = num.length();
        if(k==size)
        {
            return "0";
        }
        Stack<Character> stack = new Stack<>();
        int i =0;
        while(i<num.length())
        {
            while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i))
            {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }
        while(k>0)
        {
            stack.pop();
            k--;
        }
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty())
        {
            str.append(stack.pop());
        }
        str.reverse();
        while(str.length()>1 && str.charAt(0)=='0')
        {
            str.deleteCharAt(0);
        }
        return str.toString();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String num = sc.nextLine();
        System.out.println("Enter Value Of K :");
        int k = sc.nextInt();
        String newNum = removeKDigits(num,k);
        System.out.println("Smallest number After Removing Digits :"+newNum);
    }
}
