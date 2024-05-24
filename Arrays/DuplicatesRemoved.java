package Arrays;

import javax.swing.plaf.synth.SynthPanelUI;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicatesRemoved
{
    static void enterElements(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements in Array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static boolean checkIfPresent(int[] arr,int num)
    {
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i] == num)
            {
                return true;
            }
        }
        return false;
    }
    static int[] removeDuplicates(int[] arr)
    {
        int[] temp = new int[arr.length];
        boolean flag = false;
        int k = 0;
        for(int i=0;i< arr.length;i++)
        {
            if(!checkIfPresent(temp,arr[i]))
            {
                temp[k++] = arr[i];
            }
        }
        arr = new int[k];
        for(int i=0;i< k;i++)
        {
            arr[i] = temp[i];
        }
        return arr;
    }
    static void displayArray(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        arr = removeDuplicates(arr);
        displayArray(arr);
    }
}
