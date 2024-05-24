package DSA_FSD6.Arrays;

import java.util.Scanner;

public class sortColours012
{
    static int checkZero = 0;
    static void enterElements(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static void sortArray(int[] nums)
    {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0, temp = 0;
        while (mid <= high)
        {
            switch (nums[mid]) {
                case 0 -> {
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                }
                case 1 -> mid++;
                case 2 -> {
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        sortArray(arr);
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}
