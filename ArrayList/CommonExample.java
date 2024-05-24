package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CommonExample
{
    static  void addElementt(ArrayList<Integer>list,int n)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }

    }
    static void display(ArrayList<Integer>list)
    {
        Iterator<Integer>it=list.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter intial size");
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<Integer>(n);
        addElementt(list,n);
       display(list);

    }
}
