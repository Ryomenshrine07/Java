import java.util.Scanner;

public class check_range 
{
  public static void main(String[] args) 
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter size of array");
    int n =sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements of array");
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter Range ");
    int A=sc.nextInt();
    int B=sc.nextInt();
    int count=0;
    for(int i=A;i<=B;i++)
    {
        for(int j=0;j<arr.length;j++)
        {
            if(i==arr[j])
            {
                count++;
                break;
            }
        }
    }
    if(count==((B-A)+1))
    {
        System.out.println("Yes");
    }
    else
    {
        System.out.println("No");
    }
    sc.close();
  }  
}
