package DSA_FSD6.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindWordContainChar
{
    static void enterElements(String[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextLine();
        }
    }
    static List<Integer> findWordContainChar(String[] arr, char x)
    {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
        List<Integer> conChar = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            String str = list.get(i);
            for(int j=0;j<list.get(i).length();j++)
            {
                char ch = str.charAt(j);
                if(ch == x)
                {
                    conChar.add(i);
                    break;
                }
            }
        }
        return conChar;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        String[] arr = new String[n];
        enterElements(arr);
        System.out.println("Enter Character to be Searched");
        char x = sc.next().charAt(0);
        List<Integer> wordArray = findWordContainChar(arr,x);
        System.out.println("Count Array is : ");
        for(int i : wordArray)
        {
            System.out.print(i+" ");
        }
    }
}
