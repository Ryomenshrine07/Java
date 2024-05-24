// Given a number N, the task is to check whether it is fascinating or not. 
// Fascinating Number: When a number( 3 digits or more ) is multiplied by 2 and 3, and when both these products are concatenated with the original number, then it results in all digits from 1 to 9 present exactly once. There could be any number of zeros and are ignored. 

package Numbers_questions;

import java.util.Scanner;

public class Facinating_Number 
{
    void display(int n)
    {
        int  c = n,count = 0;
        while(c!=0)
        {
            count++;
            c = c / 10;
        }
        if(count>2)
        {
            String s1 = Integer.toString(n*2);
            String s2 = Integer.toString(n*3);
            String str = Integer.toString(n)+ s1 + s2;
            int flag = 0;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i) == '0')
                continue;
                for(int j=i+1;j<str.length();j++)
                {
                    if(str.charAt(i)==str.charAt(j))
                    {
                        flag = 1;
                        break;
                    }
                }
                if(flag == 1)
                {
                    System.out.println(n+" Is not a Facinating number");
                    break;
                }
            }
            if(flag != 1)
            System.out.println(n+" is a Facinating Number");
        }
        else
        {
            System.out.println(n+" is not a Facinating number");
        }
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       Facinating_Number obj = new Facinating_Number();
       obj.display(n);
       sc.close();
    }
}
