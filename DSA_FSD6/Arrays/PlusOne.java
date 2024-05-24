package DSA_FSD6.Arrays;

import java.util.Scanner;

public class PlusOne
{
    static void enterElement(int[] arr)
    {
        System.out.println("Enter Array Elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static int[] getNewArray(int[] digits)
    {
        String str = "";
        for(int i : digits)
        {
            str = str + Integer.toString(i);
        }
        long number  = Long.parseLong(str);
        number = number + 1;
        str = Long.toString(number);
        int[] newArray = new int[str.length()];
        for(int i=0;i<newArray.length;i++)
        {
            char ch = str.charAt(i);
            int digit = ch - '0';
            newArray[i] = digit;
        }
        return newArray;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElement(arr);
        int[] newArray = getNewArray(arr);
        for(int i : newArray)
        {
            System.out.print(i+" ");
        }
    }
}
