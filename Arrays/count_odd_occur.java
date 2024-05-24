import java.util.Arrays;
import java.util.Scanner;

public class count_odd_occur 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n =sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter array elements");
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int num,count=0,last=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==last)
        continue;
        count=1;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            count++;
        }
        if(count%2!=0)
        {
            System.out.print(arr[i]+" ");
        }
        last=arr[i];
    }
    sc.close();
  }  
}
