import java.util.Scanner;

public class the_left_one 
{
  public static void main(String[] args) 
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter size for array");
    int n =sc.nextInt();
    int[] arr =new int[n];
    System.out.println("Enter array elements");
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    int l=0,s=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>l)
        l=arr[i];
        if(arr[i]<s)
        s=arr[i];
    }
    System.out.println(l+" "+s);
  }  
}
