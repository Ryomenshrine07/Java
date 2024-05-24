package Strings;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class RomanToInteger
{
    static int calculateNumber(String s)
    {
        HashMap<Character,Integer> hMap = new HashMap<Character, Integer>();
        hMap.put('I',1);
        hMap.put('V',5);
        hMap.put('X',10);
        hMap.put('L',50);
        hMap.put('C',100);
        hMap.put('D',500);
        hMap.put('M',1000);
        int sum = 0;
        sum = sum + hMap.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--)
        {
            char current = s.charAt(i);
            char last = s.charAt(i+1);
            if(hMap.get(current) < hMap.get(last))
            {
                sum = sum - hMap.get(current);
            }
            else if(hMap.get(current) >= hMap.get(last))
            {
                sum = sum + hMap.get(current);
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman Number :");
        String s = sc.nextLine();
        int number = calculateNumber(s);
        System.out.println("Number is :"+number);
    }
}
