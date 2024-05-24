package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Array_to_list
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of initial arrray");
       int n = sc.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter array elements");
       for(int i=0;i<arr.length;i++)
       {
         arr[i] = sc.nextInt();
       }
       ArrayList <Integer> al = new ArrayList<>(); //made integer list to add elements of normal array
       for(int i:arr)
       {
        al.add(i); //adding each array elements to the al(ArrayList)
       }
       System.out.println("Your Arraylist is :"+al);
       Collections.sort(al); // Sorting the list using Collections method
       System.out.println("After sorting : "+al);
       Integer[] arr2 = al.toArray(new Integer[0]); // converting an arrayList back to integer array
       sc.close();      
    }
}