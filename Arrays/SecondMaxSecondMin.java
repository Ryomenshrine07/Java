package Arrays;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SecondMaxSecondMin
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
    static void sortArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int num = arr[i];
            int j = i - 1;
            while(j>=0&&num<arr[j])
            {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = num;
        }
    }
    static void diffOfSecondMaxAndSecondMin(int[] arr)
    {
        int secondMax = arr[1];
        int secondMin = arr[arr.length-2];
        System.out.println("Difference Of Second Largest and Second Minimim Element is :"+(secondMax - secondMin));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        sortArray(arr);
        diffOfSecondMaxAndSecondMin(arr);
    }
}
