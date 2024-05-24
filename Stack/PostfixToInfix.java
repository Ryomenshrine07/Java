package Stack;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToInfix
{
    static boolean isOperand(char ch)
    {
        return (ch >= 'A' && ch <= 'Z') || (ch >='a' && ch <='z');
    }
    static String getInfix(String str)
    {
        Stack<String> stack = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(isOperand(str.charAt(i)))
                stack.push((str.charAt(i) + ""));
            else
            {
                String op1 = stack.peek();
                stack.pop();
                String op2 = stack.peek();
                stack.pop();
                stack.push("("+op1+str.charAt(i)+op2+")");
            }
        }
        return stack.peek();
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Postfix Expression");
        String str = sc.nextLine();
        String expression = getInfix(str);
        System.out.println("Expression is :"+expression);
    }
}
