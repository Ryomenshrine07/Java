package DSA_FSD6.Arrays;

import java.util.Scanner;

public class MoveAllNegative {
    static void enterElement(int[] arr) {
        System.out.println("Enter Array Elements");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static void swap(int[] arr, int index1,int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void moveElements(int[] arr)
    {
        int start = arr.length;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i] < 0)
            {
                start--;
                swap(arr,start,i);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] arr =new int[n];
        enterElement(arr);
        moveElements(arr);
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}
