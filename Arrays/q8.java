import java.util.Scanner;

public class q8 
{
  public static void main(String[] args) 
  {
    int c=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n =sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter elements for array:");
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    System.out.println("enter the index of numbers you want to swap:");
    int ind1 =sc.nextInt();
    int ind2 =sc.nextInt();
    for(int i=0;i<n;i++)
    {
        if(i==ind1)
        {
        c=a[i];
        a[i]=a[ind2];
        }
        if(i==ind2)
        a[i]=c;
    }
    System.out.println("Swapped array is :");
    for(int i=0;i<n;i++)
    {
        System.out.print(a[i]+"\t");
    }
    sc.close();
  } 
}
