package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets
{
    static boolean validateBrackets(String str)
    {
        char startChar = str.charAt(0);
        if(str.length() == 1 || startChar == '}' || startChar == ')' || startChar == ']')
        {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        boolean flag = true;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == '{')
            {
                stack.push('}');
            }
            else if(ch == '(')
            {
                stack.push(')');
            }
            else if(ch == '[')
            {
                stack.push(']');
            }
            else if((!stack.isEmpty())  && (ch == stack.peek()))
            {
                stack.pop();
            }
            else
            {
                flag = false;
                break;
            }
        }
        if(!stack.isEmpty())
        {
            return false;
        }
        return flag;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Brackets :");
        String str = sc.nextLine();
        boolean flag = validateBrackets(str);
        if(flag)
        {
            System.out.println("Brackets are Balance");
        }
        else
        {
            System.out.println("Brackets are not Balanced");
        }
    }
}
