package Regrex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Example1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();
        System.out.println(Pattern.compile(str));
    }
}
