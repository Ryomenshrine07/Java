import java.util.Scanner;

public class subset_of_array 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Array 1");
    int n =sc.nextInt();
    System.out.println("Enter size of Array 2");
    int m = sc.nextInt();
    int[] a1 = new int[n];
    int[] a2 = new int[m];
    System.out.println("Enter Array 1 elements");
    int count=0;
    for(int i=0;i<a1.length;i++)
    {
        a1[i]=sc.nextInt();
    }
    System.out.println("Enter Array 2 elements");
    for(int i=0;i<a2.length;i++)
    {
        a2[i]=sc.nextInt();
    }
    for(int i=0;i<a1.length;i++)
    {
        for(int j=0;j<a2.length;j++)
        {
            if(a1[i]==a2[j])
            count++;
        }
    }
    if(count>=m)
    System.out.println("Yes");
    else
    System.out.println("No");
  }  
}
