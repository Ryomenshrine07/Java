import java.util.Scanner;
public class q10 
{
    static void reverse(int[] arr)
    {
        int t; 
        for(int i=0,j=arr.length-1;i!=j;i++,j--)
        {
            t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
    }
  public static void main(String[] args) 
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter array elements");
    for(int i=0;i<n;i++)
    {
        arr[i] = sc.nextInt();
    }
    reverse(arr);
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+"\t");
    }
    sc.close();
  }  
}
