package DSA_HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class CommonOperations
{
    static void enterElements(HashSet<Integer> hs, int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            hs.add(sc.nextInt());
        }
    }
    static void addElement(HashSet<Integer> hs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element you want to add");
        hs.add(sc.nextInt());
        System.out.println("After Adding Element "+hs);
    }
    static void removeElement(HashSet<Integer> hs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element you want to remove");
        hs.remove(sc.nextInt());
        System.out.println("After Removing Element "+hs);
    }
    static void checkContains(HashSet<Integer> hs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Element to be Checked");
        boolean flag = hs.contains(sc.nextInt());
        if(flag)
        {
            System.out.println("Element is Present");
        }
        else
        {
            System.out.println("Element is not Present");
        }
    }
    static void clearHashSet(HashSet<Integer> hs)
    {
        hs.clear();
    }
    static void checkIsEmpty(HashSet<Integer> hs)
    {
        boolean flag = hs.isEmpty();
        if (flag)
            System.out.println("HashSet is Empty");
        else
            System.out.println("HashSet is Not Empty");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of HashSet :");
        int n = sc.nextInt();
        HashSet<Integer> hs = new HashSet<Integer>(n);
        enterElements(hs , n);
        int flag = 0;
        while(flag == 0)
        {
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Clear HashSet");
            System.out.println("4. Check If HashSet is Empty or Not");
            System.out.println("5. Check If Element Present or not");
            System.out.println("6. Stop");
            System.out.print("Enter Your Choice :");
            int ch = sc.nextInt();
            switch (ch)
            {
                case 1 ->
                {
                    addElement(hs);
                }
                case 2 ->
                {
                    removeElement(hs);
                }
                case 3 ->
                {
                    clearHashSet(hs);
                }
                case 4 ->
                {
                    checkIsEmpty(hs);
                }
                case 5 ->
                {
                    checkContains(hs);
                }
                case 6 ->
                {
                    flag = 1;
                }
            }
        }

    }
}
