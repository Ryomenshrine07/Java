import java.util.Scanner;

public class q6 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int[] a =new int[4];
    int[] b =new int[3];
    int[] c =new int[2];
    //int[][] d={a,b,c};
    int[] e =new int[3];
    int[] f =new int[4];
    //int[][] g={e,f};
    int[][] h={a,b,c,e,f};
    System.out.println("Enter array elements");
    for(int i=0;i<h.length;i++)
    {
        for(int j=0;j<h[i].length;j++)
        {
            h[i][j] = sc.nextInt();      
        }
    }
    for(int i=0;i<h.length;i++)
    {
        System.out.print("Row "+i+": ");
        for(int j=0;j<h[i].length;j++)
        {
            System.out.print(h[i][j]+" ");      
        }
        System.out.println();
    }
    sc.close();
  }  
}
