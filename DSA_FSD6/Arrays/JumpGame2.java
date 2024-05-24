package DSA_FSD6.Arrays;

import java.util.Scanner;

public class JumpGame2
{
    static void enterElements(int[] arr)
    {
        System.out.println("Enter Array Elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static int checkJump(int[] arr)
    {
        int countJump = 0;
        int end = 0;
        int farthest = 0;
        for(int i=0;i< arr.length-1;i++)
        {
            farthest = Math.max(farthest,i+arr[i]);
            if(farthest >= arr.length-1)
            {
                countJump++;
                break;
            }
            if(i == end)
            {
                countJump++;
                end = farthest;
            }
        }
        return countJump;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int minJumps = checkJump(arr);
        System.out.println("Minimum Jumps To Reach Last Index :"+minJumps);
    }
}
