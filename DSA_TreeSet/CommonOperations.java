package DSA_TreeSet;

import javax.swing.plaf.synth.SynthGraphicsUtils;
import javax.swing.plaf.synth.SynthPanelUI;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class CommonOperations
{
    static void enterElements(TreeSet<Integer> tSet, int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements :");
        for(int i=0;i<n;i++)
        {
            int num = sc.nextInt();
            tSet.add(num);
        }
        System.out.println(tSet);
    }
    static void addElement(TreeSet<Integer> tSet, int num)
    {
        tSet.add(num);
        System.out.println(tSet);
    }
    static void removeElement(TreeSet<Integer> tSet, int num)
    {
        tSet.remove(num);
        System.out.println(tSet);
    }
    static void checkIfContains(TreeSet<Integer> tSet,int num)
    {
        boolean flag = tSet.contains(num);
        if(flag)
        {
            System.out.println(num+" is Present in TreeSet");
        }
        else
        {
            System.out.println(num+" is Not Present In TreeSet");
        }
    }
    static void printInReverseTreeSet(TreeSet<Integer> tSet)
    {
        Iterator<Integer> it = tSet.descendingIterator();
        {
            while(it.hasNext())
            {
                System.out.print(it.next()+" ");
            }
        }
    }
   static void inReverseUsingDescendent(TreeSet<Integer> tSet)
   {
       System.out.println(tSet.descendingSet());
   }
   static void showFirstElement(TreeSet<Integer> tSet)
   {
       System.out.println("First Element in TreeSet is :"+tSet.first());
   }
   static void showLastElement(TreeSet<Integer> tSet)
   {
       System.out.println("Last Element in TreeSet is :"+tSet.last());
   }
   static void elementLesserThan(TreeSet<Integer> tSet)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number to be checked with");
       int n = sc.nextInt();
       System.out.println("Elements Greater than "+n+" are :");
       System.out.println(tSet.headSet(n));
   }
    static void elementGreaterThan(TreeSet<Integer> tSet)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be checked with");
        int n = sc.nextInt();
        System.out.println("Elements Greater than "+n+" are :");
        System.out.println(tSet.tailSet(n));
    }
    static void checkEmptyOrNot(TreeSet<Integer> tSet)
    {
        if(tSet.isEmpty())
        {
            System.out.println("[TreeSet is Empty]");
        }
        else
        {
            System.out.println("[TreeSet is Not Empty]");
        }
    }
    static void removeLowestElement(TreeSet<Integer> tSet)
    {
        tSet.pollFirst();
        System.out.println(tSet);
    }
    static void removeHighestElement(TreeSet<Integer> tSet)
    {
        tSet.pollLast();
        System.out.println(tSet);
    }
    static void showSubSet(TreeSet<Integer> tSet)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter From Value :");
        int from = sc.nextInt();
        System.out.print("Enter To Value :");
        int to = sc.nextInt();
        System.out.println(tSet.subSet(from,to));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of TreeSet");
        int n = sc.nextInt();
        TreeSet<Integer> tSet = new TreeSet<Integer>();
        enterElements(tSet,n);
        while(true)
        {
            System.out.println();
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Check If Contains a Number");
            System.out.println("4. Print In Reverse Order");
            System.out.println("5. Print In Reverse Order Using descendingSet()");
            System.out.println("6. Show The First Element in TreeSet");
            System.out.println("7. Show The Last Element In TreeSet");
            System.out.println("8. Show Elements Less from the given Element in TreeSet [headSet()]");
            System.out.println("9. Check If TreeSet Is Empty Or Not");
            System.out.println("10. Remove Lowest Element in TreeSet");
            System.out.println("11. Remove Highest Element in TreeSet");
            System.out.println("12. Show Subset From-To in TreeSet [From Element is Mention but To Element will not be Mentioned");
            System.out.println("13. Show Elements Greater or Equal to Given Element in TreeSet [tailSet()]");
            System.out.println("14. Stop");
            System.out.print("[ Enter Your Choice ] :");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1 ->
                {
                    System.out.print("Enter Number To be Added :");
                    int num = sc.nextInt();
                    addElement(tSet,num);
                }
                case 2 ->
                {
                    System.out.print("Enter Number to Be Removed :");
                    int num = sc.nextInt();
                    removeElement(tSet,num);
                }
                case 3 ->
                {
                    System.out.print("Enter Number to be Checked :");
                    int num = sc.nextInt();
                    checkIfContains(tSet,num);
                }
                case 4 ->
                {
                    printInReverseTreeSet(tSet);
                }
                case 5 ->
                {
                    inReverseUsingDescendent(tSet);
                }
                case 6 ->
                {
                    showFirstElement(tSet);
                }
                case 7 ->
                {
                    showLastElement(tSet);
                }
                case 8 ->
                {
                    elementLesserThan(tSet);
                }
                case 9 ->
                {
                    checkEmptyOrNot(tSet);
                }
                case 10 ->
                {
                    removeLowestElement(tSet);
                }
                case 11 ->
                {
                    removeHighestElement(tSet);
                }
                case 12 ->
                {
                    showSubSet(tSet);
                }
                case 13 ->
                {
                    elementGreaterThan(tSet);
                }
                case 14 ->
                {
                    System.exit(0);
                }
            }
        }
    }
}
