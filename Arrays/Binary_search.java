import java.util.Scanner;

public class Binary_search 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size of Array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter Array Elements");
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter Element To be searched");
    int num=sc.nextInt();
    int mid=n/2;
    if(num==arr[mid])
    System.out.println("Element Found at Index :"+mid);
    if(num>arr[mid])
    {
        for(int i=mid+1;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
            System.out.println("Element Found At Index :"+i);
            break;
            }
        }
    }
    if(num<arr[mid])
    {
        for(int i=0;i<mid;i++)
        {
            if(arr[i]==num)
            {
            System.out.println("Element Found At Index :"+i);
            break;
            }
        }
    }
    else
    System.out.println("Element not found in Array");
    sc.close();
  }  
}
