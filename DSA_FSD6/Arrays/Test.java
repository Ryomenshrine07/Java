package DSA_FSD6.Arrays;

import java.util.Scanner;

public class Test
{
    static void display(int[] arr)
    {
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
    static void enterElements(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size for array 1");
        int n1 = sc.nextInt();

        System.out.println("Enter size Foe Array 2");
        int n2 = sc.nextInt();

        System.out.println("Enter Size For Array 3");
        int n3 = sc.nextInt();

        int[] arr1 = new int[n1];
        System.out.println("Enter Elements For Array 1");
        enterElements(arr1);
        display(arr1);
        System.out.println();

        int[] arr2 = new int[n2];
        System.out.println("Enter Elements For Array 2"); 
        enterElements(arr2);
        display(arr2);
        System.out.println();

        int[] arr3 = new int[n3];
        System.out.println("Enter Elements For Array 3");
        enterElements(arr3);
        display(arr3);
        System.out.println();

    }
}
