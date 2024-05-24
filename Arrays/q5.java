//package Arrays;
import java.util.Scanner;
public class q5 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x and y cordinates for 10 points");
    double[] a = new double[20];
    for(int i=0;i<20;i++)
    {
        a[i] = sc.nextInt();
    }
    double s=0;
    System.out.println("Distance from first to last point is :");
    for(int i=0;i<20;i++)
    {
        if(i==19)
        break;
        double k=a[i];
        double l=a[i+1];
        s=s+Math.sqrt(Math.pow(k-l, 2)+Math.pow(k-l, 2));
    }
    System.out.format("%.2f",s);
    sc.close();
  }  
}
