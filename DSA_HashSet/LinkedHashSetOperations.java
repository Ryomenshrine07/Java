package DSA_HashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetOperations
{
    static void enterElements(LinkedHashSet<Integer> hs, int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            hs.add(sc.nextInt());
        }
        System.out.println("Set :"+hs);
    }
    static void addElement(LinkedHashSet<Integer> hs,int num)
    {
        hs.add(num);
        System.out.println(hs);
    }
    static void removeElements(LinkedHashSet<Integer> hs,int index)
    {
        hs.remove(index);
        System.out.println(hs);
    }
    static void itrateAllElements(LinkedHashSet<Integer> hs)
    {
        for (Integer h : hs) {
            System.out.print(h + " ");
        }
    }
    static void searchElement(LinkedHashSet<Integer> hs, int num)
    {
        if(hs.contains(num))
        {
            System.out.println("[Element is Present]");
        }
        else
        {
            System.out.println("[Element is Not Present]");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The initial size of Linked Hash Set :");
        int n = sc.nextInt();
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>(n);
        enterElements(hs,n);
        while (true)
        {
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Iterate all elements");
            System.out.println("4. CheckContains");
            System.out.println("5. Stop");
            System.out.println("Enter your Choice");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1 ->
                {
                    System.out.print("Enter Number TO be Added :");
                    int num = sc.nextInt();
                    addElement(hs,num);
                }
                case 2 ->
                {
                    System.out.println("Enter index of number to be removed");
                    int num = sc.nextInt();
                    removeElements(hs,num);
                }
                case 3 ->
                {
                    itrateAllElements(hs);
                }
                case 4 ->
                {
                    System.out.println("Enter Element to be searched :");
                    int num = sc.nextInt();
                    searchElement(hs,num);
                }
                case 5 ->
                {
                    System.exit(0);
                }
            }
        }
    }
}
