package DSA_FSD6.Arrays;

import java.util.Scanner;

public class SimplifyPath
{
    static String simplifyPath(String str)
    {
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<str.length()-1;i++)
        {
            char currChar = str.charAt(i);
            char nextChar = str.charAt(i+1);
            if(currChar == '.')
            {
                continue;
            }
            if(i+1 == str.length()-1)
            {
                if((currChar >=97 && currChar <= 122) && (nextChar>=97 && nextChar<=122))
                {
                    newStr.append(currChar).append(nextChar);
                }
                else if((currChar >=97 && currChar <= 122))
                {
                    newStr.append(currChar);
                }
                break;
            }
            if((currChar == '/' && (nextChar>=97 && nextChar<=122)) || (currChar == '/' && nextChar =='.'))
            {
                newStr.append(currChar);
            }
            else if ((currChar >=97 && currChar <= 122))
            {
                newStr.append(currChar);
            }
        }
        return newStr.toString();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        String simpPath = simplifyPath(str);
        System.out.println("Simplified Path is :"+simpPath);
    }
}
