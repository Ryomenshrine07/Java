package Arrays;
import java.util.Scanner;

public class insertion 
{
  public static void main(String[] args) 
  {
    int i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int arr[]= new int[n];
    sc.close();
    System.out.println("Enter Array elements");
    for(i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter number to be inserted");
    int num=sc.nextInt();
    System.out.println("Enter the position to be inserted in");
    int pos=sc.nextInt();
    for( i=arr.length-2;i>=pos;i--)
    {
        arr[i+1]=arr[i];
    }
    arr[i+1]=num;
    for (i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    
  }    
}
