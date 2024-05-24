//ackage Arrays;

import java.util.Scanner;

public class q4 
{
  public static void main(String[] args) 
  {
    Scanner sc =new Scanner(System.in);
    int[][] a = new int[4][4];
    System.out.println("Enter elements for your array");
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<4;j++)
        {
            a[i][j] = sc.nextInt();
        }
    }
    System.out.println("Entered array is :");
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<4;j++)
        {
            System.out.print(a[i][j]+"\t");
        }
        System.out.println();
    }
    System.out.println("Transposed matrix is :");
    int[][] b = new int[4][4];
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<4;j++)
        {
            b[i][j] = a[j][i];
            System.out.print(b[i][j]+"\t");
        }
        System.out.println();
    }
    sc.close();
  }  
}
