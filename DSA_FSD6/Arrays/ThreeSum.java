package DSA_FSD6.Arrays;

import java.util.*;

public class ThreeSum
{
    static void enterElements(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static List<List<Integer>> threeSum(int[] nums)
    {
        Arrays.sort(nums);
        Set<List<Integer>> setList = new HashSet<>();
        for(int i=0;i< nums.length-2;i++)
        {
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right)
            {
                int sum = nums[i] + nums[left] +nums[right];
                if(sum == 0)
                {
                    setList.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                if(sum < 0)
                {
                    left++;
                }
                if(sum > 0)
                {
                    right--;
                }
            }
        }
        return new ArrayList<>(setList);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size for Your Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        List<List<Integer>> list = threeSum(arr);
        System.out.println("Three Sum list is :"+list);
    }
}
