package DSA_FSD6.Arrays;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class MorreAlgorithm
{
    static void enterElements(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements (In Increasing Order)");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static ArrayList<Integer> mooreAlgo(int[] arr1, int[] arr2, int[] arr3)
    {
        int i=0;
        int j=0;
        int k=0;
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        while(i<arr1.length && j<arr2.length && k<arr3.length)
        {
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k])
            {
                hs.add(arr1[i]);
                i++;
                j++;
                k++;
            }
            else if(arr1[i] < arr2[j])
            {
                i++;
            }
            else if(arr2[j] < arr3[k])
            {
                j++;
            }
            else
            {
                k++;
            }
        }
        return new ArrayList<Integer>(hs);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of First Array");
        int n = sc.nextInt();
        int[] arr1 = new int[n]; // Array 1

        enterElements(arr1);

        System.out.println("Enter Size of Second Array");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2]; // Array 2
        enterElements(arr2);

        System.out.println("Enter Size of Third Array");
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3]; // Array 3
        enterElements(arr3);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list = mooreAlgo(arr1, arr2, arr3);
        System.out.println("Common Elements Are : "+list);
    }
}
