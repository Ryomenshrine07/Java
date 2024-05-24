//A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709
//        are all Duck numbers.
//        Please note that a numbers with only leading 0s is not considered as Duck Number.
//        For example, numbers like 035 or 0012 are not considered as Duck Numbers.
//        A number like 01203 is considered as Duck because there is a non-leading 0 present in it.

package FsD6.Numbers_questions;

import java.util.Scanner;

public class Duck_Number
{
    static boolean checkDuckOrNot(int n)
    {
        String str = Integer.toString(n);
        int i=0;
        while(i<str.length() && str.charAt(i) == '0')
        {
            i++;
        }
        while(i<str.length())
        {
            if(str.charAt(i) == '0')
                return true;
            i++;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean flag = checkDuckOrNot(n);
        if(flag)
            System.out.println(n+" is a Duck number");
        else
            System.out.println(n+" is not a Duck number");

    }
}
