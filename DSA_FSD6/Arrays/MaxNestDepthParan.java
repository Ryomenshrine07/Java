package DSA_FSD6.Arrays;

import java.util.Scanner;
import java.util.Stack;

public class MaxNestDepthParan
{
    static int findMaxDepth(String str)
    {
        int openBracket = 0;
        int maxDepth = 0;
        for(char c : str.toCharArray())
        {
            if(c == '(')
            {
                openBracket++;
                maxDepth = Math.max(maxDepth,openBracket);
            }
            else if(c == ')')
            {
                openBracket--;
            }
        }
        return maxDepth;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        int maxDepth = findMaxDepth(str);
        System.out.println("Maximum depth is : "+maxDepth);
    }
}
