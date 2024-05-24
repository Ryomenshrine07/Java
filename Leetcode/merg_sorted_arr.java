import java.util.Scanner;

public class merg_sorted_arr 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array sizes pf 1 and 2");
    int x = sc.nextInt();
    int n = sc.nextInt();
    int nums1[] = new int[x];
    int nums2[] = new int[n];
    System.out.println("Enter Array 1 elements");
    for(int i=0;i<nums1.length;i++)
    {
        nums1[i] = sc.nextInt();
    }
    System.out.println("Type total zero numbers in array 1");
    int m = sc.nextInt();
    System.out.println("Enter Array 2 elements");
    for(int i=0;i<nums2.length;i++)
    {
        nums2[i] = sc.nextInt();
    }
    for(int i=0,j=m;i<nums2.length;i++,j++)
    {
        nums1[j]=nums2[i];
    }
    for(int i=0;i<nums1.length;i++)
    {
        int num = nums1[i];
        int j=i-1;
        while(j>=0&&num<nums1[j])
        {
            nums1[j+1]=nums1[j];
            j=j-1;
        }
        nums1[j+1]=num;
    }
    System.out.println("Merged and sorted array is :");
    for(int i=0;i<nums1.length;i++)
    {
        System.out.print(nums1[i]+" ");
    }
    sc.close();
  }  
}
