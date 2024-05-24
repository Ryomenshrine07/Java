package DSA_FSD6.Arrays;

import java.util.Scanner;

public class MatrixDiagonalSum
{
    static void enterElements(int[][] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    static int findDiagonalSum(int[][] mat)
    {
        int sum = 0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(i == j || (i + j == mat.length - 1))
                {
                    sum = sum + mat[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column for n x n Metric :");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        enterElements(arr);
        int diagonalSum = findDiagonalSum(arr);
        System.out.println("Sum is :"+diagonalSum);
    }
}
