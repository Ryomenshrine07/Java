package DSA_FSD6.Arrays;

import java.util.Scanner;

public class EquilibiriumPointApproach2
{
    static void enterElements(long[] arr, int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextLong();
        }
    }
    static int EquilibriumPoint(long[] arr , int n)
    {
        long sum1 = 0;
        long sum2 = 0;
        int i = 1;
        int num = 0;
        if(n == 1)
        {
            return 1;
        }
        while (i<n)
        {
            if(i == num)
            {
                num++;
            }
            else if(num<i)
            {
                sum1 = sum1 + arr[num];
                num++;
            }
            else {
                sum2 = sum2 + arr[num];
                num++;
            }
            if(num == n)
            {
                if(sum1 == sum2)
                {
                    return i+1;
                }
                else
                {
                    i++;
                    num = 0;
                    sum1 = 0;
                    sum2 = 0;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size if Array");
        int n = sc.nextInt();
        long[] arr = new long[n];
        enterElements(arr,n); // Enter Array Elements

        int equiPoint = EquilibriumPoint(arr, n);

        System.out.println("Equilibrium Point is :"+equiPoint);
    }
}
