import java.util.Scanner;

public class deletion 
{
  public static void main(String[] args) 
  {
    int i ;
    Scanner sc =new Scanner(System.in);
    System.out.println("enter size of array");
    int n =sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for(i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the postion of element to be deleted");
    int pos=sc.nextInt();
    for( i=pos;i<arr.length-1;i++)
    {
        arr[i]=arr[i+1];
    }
    arr[n-1]=0;
    for(i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }

  }  
}
