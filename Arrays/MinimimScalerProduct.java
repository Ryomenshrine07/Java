package Arrays;

import java.util.Scanner;

public class MinimimScalerProduct
{
    static void enterElements(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Vector Elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static void sortInAscendingOrder(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void sortInDescendingOrder(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if (arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static int findMinimumScalerProduct(int[] vec1,int[] vec2)
    {
        sortInAscendingOrder(vec1);
        sortInDescendingOrder(vec2);
        int sum = 0;
        for(int i=0;i<vec1.length;i++)
        {
            sum = sum + (vec1[i]*vec2[i]);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length for Vectors");
        int n = sc.nextInt();
        int[] vec1 = new int[n];
        int[] vec2 = new int[n];
        enterElements(vec1);
        enterElements(vec2);
        int MinScaleproduct = findMinimumScalerProduct(vec1,vec2);
        System.out.println("Minimum Scaler Produnt is :"+MinScaleproduct);
    }
}
