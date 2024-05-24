package Stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix
{
    static int precedence(char ch)
    {
        if(ch == '^')
            return 3;
        else if(ch == '*' || ch == '/')
            return 2;
        else if(ch == '+' || ch == '-')
            return 1;
        return 0;
    }
    static char associativity(char ch)
    {
        if(ch == '^')
            return 'R';
        else
            return 'L';
    }
    static String convertInfixToPostfix(String s)
    {
        StringBuilder result = new StringBuilder("");
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'b'))
            {
                result.append(ch);
            }
            else if(ch == '(')
            {
                stack.push(ch);
            }
            else if(ch == ')')
            {
                while(!stack.isEmpty() && stack.peek() != '(')
                {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else
            {
                while(!stack.isEmpty() && (precedence(ch) < precedence(stack.peek()) || precedence(ch) == precedence(stack.peek()) && associativity(ch) == 'L'))
                {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty())
        {
            result.append(stack.pop());
        }
        return String.valueOf(result);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Infix Expression :");
        String s = sc.next();
        String postfix = convertInfixToPostfix(s);
        System.out.println("Postfix expression is :"+postfix);
    }
}
