package Arrays;

import java.util.Scanner;

public class CheckDisjointOrNot
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
    static boolean checkDisjointOrNot(int[] arr1, int[] arr2)
    {
        boolean flag = false;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i] == arr2[j])
                {
                    flag = true;
                    return flag;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of First Array :");
        int n = sc.nextInt();
        System.out.print("Enter Size of Second Array :");
        int n2 = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n2];
        enterElements(arr);
        enterElements(arr2);
        boolean flag = checkDisjointOrNot(arr,arr2);
        if(flag)
        {
            System.out.println("Both Arrays are not Disjoint");
        }
        else
        {
            System.out.println("Both Arrays are Disjoint");
        }
    }
}
