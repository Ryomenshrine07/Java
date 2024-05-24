import java.util.Scanner;

public class third_largest 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n =sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter array elements");
    for(int i=0;i<a.length;i++)
    {
        a[i]=sc.nextInt();
    }
    int l=0,s2=0,s3=0;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]>l)
        l=a[i];
    }
    for(int i=0;i<a.length;i++)
    {
        if(a[i]<l && a[i]>s2)
        s2=a[i];
    }
    for(int i=0;i<a.length;i++)
    {
        if(a[i]<s2 && a[i]>s3)
        s3=a[i];
    }
    System.out.println(l+" "+s2+" "+s3);
    sc.close();
  }  
}
