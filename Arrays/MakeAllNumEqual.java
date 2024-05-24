package Arrays;

import java.util.Scanner;

public class MakeAllNumEqual
{
    static void enterElement(int[] arr)
    {
        System.out.println("Enter Elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static boolean checkArrayEleEqualOrNot(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            while(arr[i] % 2 == 0)
            {
                arr[i] = arr[i] / 2;
            }
            while(arr[i] % 3 == 0)
            {
                arr[i] = arr[i] / 3;
            }
            if(arr[i] != arr[0])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElement(arr);
        boolean flag = checkArrayEleEqualOrNot(arr);
        if(flag)
        {
            System.out.println("They Can Be Made Equal");
        }
        else
        {
            System.out.println("They Can Not Be Made Equal");
        }
    }
}
