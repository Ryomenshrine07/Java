import java.util.Scanner;

public class Insertion_sort 
{
  public static void main(String[] args) 
  {
    int num,j;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter array elements");
    for(int i=0;i<arr.length;i++)
    {
        arr[i] = sc.nextInt();
    }
    System.out.println("Sorted array is :");
    for(int i=0;i<arr.length;i++)
    {
        num = arr[i];
        j=i-1;
        while(j>=0&&num<arr[j])
        {
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=num;
    }
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
    sc.close();
  }  
}
