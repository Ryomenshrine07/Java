package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ValidParenthesisString
{
    static boolean validateParenthesisString(String s)
    {
        Deque<Integer> openBracket = new ArrayDeque<>();
        Deque<Integer> totalStar = new ArrayDeque<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                openBracket.push(i);
            } else if (ch == '*') {
                totalStar.push(i);
            } else {
                if (!openBracket.isEmpty()) {
                    openBracket.pop();
                } else if (!totalStar.isEmpty()) {
                    totalStar.pop();
                } else {
                    return false;
                }
            }
        }
        while (!openBracket.isEmpty() && !totalStar.isEmpty()) {
            if (openBracket.peek() > totalStar.peek()) {
                return false;
            }
            openBracket.pop();
            totalStar.pop();
        }
        return openBracket.isEmpty();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();
        boolean flag = validateParenthesisString(str);
        if(flag)
        {
            System.out.println("String is Valid");
        }
        else
        {
            System.out.println("String is Invalid");
        }
    }
}
