package Arrays;

import java.util.Scanner;

public class firstInAcendThenDscend2
{
    static void enterElements(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static void sortArray(int[] arr)
    {
        int mid = arr.length/2;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size oF array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        sortArray(arr);
    }
}
