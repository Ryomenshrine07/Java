import java.util.Scanner;

public class Remove_element 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter size of array");
    int n=sc.nextInt();
    int nums[] = new int[n];
    System.out.println("Enter array elements");
    for(int i=0;i<nums.length;i++)
    {
        nums[i]=sc.nextInt();
    }
    System.out.println("Enter element you want to remove");
    int val = sc.nextInt();
    int k=0;
    for(int i=0;i<nums.length;i++)
    {
      if(nums[i]==val)
      {
        for(int j=i+1;j<nums.length;j++)
        {
          if(nums[j]==val)
          continue;
          else
          {
            k++;
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            break;
          }
        } 
      }
      else
      {
        k++;
      }
    }
    System.out.println("no. of Starting elements are :"+k);
    for(int i=0;i<nums.length;i++)
    {
      System.out.print(nums[i]+" ");
    }
    sc.close();
  }  
}
