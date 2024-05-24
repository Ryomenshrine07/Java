package Arrays;

import java.util.Scanner;

public class FindSymmetricPairs
{
    static void enterElements(int[][] arr,int n, int m)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pairs for Array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    static void findSymmetricPairs(int[][] arr,int n,int m)
    {
        System.out.print("Symmetric Pairs Are :  ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m-1;j++)
            {
                if(arr[i][j] < arr[i][j+1])
                {
                    System.out.print("{"+arr[i][j]+","+arr[i][j+1]+"}"+" ,");
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no. of elements in each pair");
        int m = sc.nextInt();
        System.out.println("Enter Length of Your Array");
        int n = sc.nextInt();
        int[][] arr = new int[n][m];
        enterElements(arr,n,m);
        findSymmetricPairs(arr,n,m);
    }
}
