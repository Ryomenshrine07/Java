package Arrays;

import java.util.Scanner;

public class RowZeroColumnZero {
    static void enterElemnets(int[][] arr,int m,int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    static int[] findZeroInArray(int[][]arr, int m, int n)
    {
        int[] indexes = new int[2];
        boolean flag = false;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j] == 0)
                {
                    flag = true;
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        if(flag == false)
        {
            System.out.println("No Zeros Present in Array");
            System.exit(0);
            return indexes;
        }
        else
        {
            return indexes;
        }
    }
    static void zeroArrayRow(int[][] arr,int m,int n, int pos)
    {
        for(int i=0;i<m;i++)
        {
            if(i == pos)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j] = 0;
                }
            }
        }
    }
    static void zeroArrayColumn(int[][] arr,int m,int n, int pos)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j == pos)
                {
                    arr[i][j] = 0;
                }
            }
        }
    }
    static void displayArray(int[][]arr,int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row and column of Array");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        enterElemnets(arr,m,n);
        int[]zeroIndex = findZeroInArray(arr,m,n);
        zeroArrayRow(arr,m,n,zeroIndex[0]);
        zeroArrayColumn(arr,m,n,zeroIndex[1]);
        displayArray(arr,m,n);
    }
}
