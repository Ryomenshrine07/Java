import java.util.ArrayList;
import java.util.Scanner;



public class Remove_dublicates 
{
  public static void main(String[] args) 
  {
    int k=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size of your array");
    int n =sc.nextInt();
    int[] nums =new int[n];
    System.out.println("Enter elements in array");
    for(int i=0;i<n;i++)
    {
      nums[i] = sc.nextInt(); 
    }
//     for(int i=0;i<nums.length;i++)
//     {
//       int num = nums[i];
//       if(k<1||num>nums[k-1])
//       {
//         nums[k]=num;
//         k++;
//       }
//     }
    ArrayList<Integer> al = new ArrayList<>();
    for(int i:nums)
    {
      al.add(i);
    }
    System.out.println("Your List is :\n"+al);
    for(int i=0;i<al.size();i++)
    {
      for(int j=i+1;j<al.size();j++)
      {
        if(al.get(i)==al.get(j))
        {
          al.remove(j);
        }
      }
    }
    // Integer[] arr = al.toArray(new Integer[0]);
    // for(int i=0;i<arr.length;i++)
    // {
    //   System.out.print(arr[i]+" ");
    // }
    System.out.println("After Removing Duplicates :\n"+al);
    sc.close();
  }  
}
