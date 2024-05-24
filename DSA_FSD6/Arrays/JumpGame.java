package DSA_FSD6.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class JumpGame
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
    static boolean checkJump(int[] arr)
    {
        int maxJump = 0;
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(i > maxJump)
            {
                break;
            }
            maxJump = Math.max(maxJump,i+arr[i]);
        }
        return i == arr.length;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        boolean flag = checkJump(arr);
        if(flag)
        {
            System.out.println("We Reached The Last index");
        }
        else
        {
            System.out.println("Can't Reach Last Index");
        }
    }
}
