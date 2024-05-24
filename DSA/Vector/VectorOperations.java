package DSA.Vector;

import java.util.Scanner;
import java.util.Vector;

public class VectorOperations
{
    static  void addElement(Vector<Integer> v, int num)
    {
        v.add(num);
        System.out.println("After adding an element your vector is :");
        System.out.println(v);
    }
    static  void removeElement(Vector<Integer> v, int index)
    {
        v.remove(index);
        System.out.println("After Removing an element your vector is :");
        System.out.println(v);
    }
    static  void updateElement(Vector<Integer> v, int num, int index)
    {
        System.out.println("Updated Element was :"+v.set(index,num));
        System.out.println("After Updating an element your vector is :");
        System.out.println(v);
    }
    static  void traverseAllElement(Vector<Integer> v)
    {
        for(Integer i : v)
        {
            System.out.print(i+" ");
        }
    }
    static void enterElements(Vector<Integer> v)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements for Vector");
        for(int i=0;i<v.capacity();i++)
        {
            int element = sc.nextInt();
            v.add(i,element);
        }
        System.out.println("Your Vector is :"+v);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your vector");
        int n = sc.nextInt();
        Vector <Integer> v = new Vector<Integer>(n);
        enterElements(v);
        System.out.println("Operations can pe performed on vector :");
        System.out.println();
        System.out.println("1. Add Element");
        System.out.println("2. Remove Element");
        System.out.println("3. Update Element");
        System.out.println("4. Iterate over Elements");
        System.out.println();
        System.out.println("Enter Your Choice :");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1 ->
            {
                System.out.println("Enter Element to Be Added :");
                int num = sc.nextInt();
                addElement(v,num);
            }
            case 2 ->
            {
                System.out.println("Enter Index Of The Element to Be Removed :");
                int num = sc.nextInt();
                removeElement(v,num);
            }
            case 3 ->
            {
                System.out.println("Enter Element to Be Updated following it's index:");
                int num = sc.nextInt();
                int index = sc.nextInt();
                updateElement(v,num,index);
            }
            case 4 ->
            {
                traverseAllElement(v);
            }
        }
    }
}
