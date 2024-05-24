package Basics;

import java.util.Scanner;

public class JavaLiterals
{
    public static void main(String[] args)
    {
        // [ INTEGER LITERALS ]=====>>>>>>>
//        int a = 0b00110; // Binary Number
//        int hexa = 0x10A4; // Hexa Decimal Number
//        int decimal = 20; // Decimal Number
//
//        System.out.println("Binary Literal :"+a);
//        System.out.println("Hexa Decimal Literal :"+hexa);
//        System.out.println("Decimal Literal :"+decimal);

        // [ Floating-Point Literals ]===============>>>>

        double a = 1.75f;
        float b = 1.75f; // to initialize float in java convention is neccessary
        if(a == b)
        {
            System.out.println("THey are same");
        }
        else
        {
            System.out.println("They are not same");
        }

        double f = 1.23e10; // for Scientific notation,, Output will have E in place of e
        System.out.println("For Scientific Notation :"+f);
//        int i;
//        for(i=1;i<=5;i++);
//        System.out.println(i);
//        System.out.println(i);
//        int v = 0b1001;
//        int v = 017;
//        System.out.println(v);
        int x = 2;
        System.out.println(x++ + ++x);
    }
}
