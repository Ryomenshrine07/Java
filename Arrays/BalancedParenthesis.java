package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BalancedParenthesis 
{
    static boolean checkParenthesis(char[] charArray,char[] tempArray,int k,int index)
    {
        boolean flag = true;
        int j = index;
        if(j == charArray.length - 1)
        {
            if(charArray[j] == tempArray[0])
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        for(int i=k-1;i>=0&&j<charArray.length;i--)
        {
            if(charArray[j] == '{' || charArray[j] == '(' || charArray[j] == '[')
            {
                break;
            }
            else if(charArray[j] != tempArray[i])
            {
                flag = false;
                break;
            }
            j++;
        }
        return flag;
    }
    static boolean checkBalancedOrNot(String str)
    {
        char[] charArray = str.toCharArray();
        char[] tempArray = new char[charArray.length];
        int k = 0;
        boolean flag = true;
        for(int i=0;i<charArray.length;i++)
        {
            if(charArray[i] == '{' || charArray[i] == '(' || charArray[i] == '[') {
                if (charArray[i] == '{') {
                    tempArray[k++] = '}';
                } else if (charArray[i] == '(') {
                    tempArray[k++] = ')';
                } else if (charArray[i] == '[') {
                    tempArray[k++] = ']';
                }
            }
            else
            {
                boolean flag2 = checkParenthesis(charArray,tempArray,k,i);
                if(!flag2)
                {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String str = sc.nextLine();
        boolean flag = checkBalancedOrNot(str);
        if(flag)
        {
            System.out.println("Brackets are balanced");
        }
        else
        {
            System.out.println("Brackets are Not Balanced") ;
        }
    }
}
