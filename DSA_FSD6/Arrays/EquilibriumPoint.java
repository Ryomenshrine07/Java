package DSA_FSD6.Arrays;

import java.util.Scanner;

public class EquilibriumPoint
{
    static void enterElements(int[] arr, int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static int equilibriumPoint(int[] arr, int n)
    {
        if(n == 1)
        {
            return n;
        }
        int sum1;
        int sum2;
        for(int i=1;i<n;i++)
        {
            sum1 = 0;
            sum2 = 0;
            for(int j=0;j<i;j++)
            {
                sum1 = sum1 + arr[j];
            }
            for(int k=i+1;k<n;k++)
            {
                sum2 = sum2 + arr[k];
            }
            if(sum1 == sum2)
            {
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size if Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr,n); // Enter Array Elements

        int eqiPoint = equilibriumPoint(arr,n); // Find Equilibrium Position

        System.out.println("Equilibrium Point is : "+eqiPoint);
    }
}
