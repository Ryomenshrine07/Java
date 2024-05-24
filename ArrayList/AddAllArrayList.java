package ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;

public class AddAllArrayList
{
    static void enterObjects1(ArrayList<Integer> al , int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            al.add(sc.nextInt());
        }
    }
    static void enterObjects2(ArrayList<Float> al , int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            al.add(sc.nextFloat());
        }
    }
    static void enterObjects(ArrayList<String> al , int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            al.add(sc.nextLine());
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> al1 = new ArrayList<Integer>();
//        System.out.println("Enter Size of Integer list");
//        int n1 = sc.nextInt();
//        System.out.println("Enter Elements");
//        for(int i=0;i<n1;i++)
//        {
//            al1.add(sc.nextInt());
//        }
//
//        ArrayList<Float> al2 = new ArrayList<Float>();
//        System.out.println("Enter Size of Float list");
//        int n2 = sc.nextInt();
//        System.out.println("Enter Elements");
//        for(int i=0;i<n2;i++)
//        {
//            al2.add(sc.nextFloat());
//        }
//
//        ArrayList<String> al3 = new ArrayList<String>();
//        System.out.println("Enter Size of String list");
//        int n3 = sc.nextInt();
//        System.out.println("Enter Elements");
//        for(int i=0;i<n3;i++)
//        {
//            String str = sc.nextLine();
//            al3.add(str);
//        }
//
//        ArrayList<Object> alnew = new ArrayList<Object>();
//        alnew.add(al1);
//        alnew.add(al2);
//        alnew.add(al3);
//        System.out.println(alnew);

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        System.out.println("Enter Size of Integer list");
        int n1 = sc.nextInt();
        System.out.println("Enter Elements");
        for(int i=0;i<n1;i++)
        {
            al1.add(sc.nextInt());
        }

        ArrayList<Integer> al2 = new ArrayList<Integer>();
        System.out.println("Enter Size of Integer list");
        int n2 = sc.nextInt();
        System.out.println("Enter Elements");
        for(int i=0;i<n2;i++)
        {
            al2.add(sc.nextInt());
        }

        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        hs.addAll(al1);
        hs.addAll(al2);
        System.out.println(hs);
    }
}
