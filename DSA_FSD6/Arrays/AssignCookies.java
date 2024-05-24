package DSA_FSD6.Arrays;

import java.util.*;

public class AssignCookies
{
    static void enterElement(int[] arr)
    {
        System.out.println("Enter Elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static int maximizeContentChild(int[] g, int[] s)
    {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for (int j=0;i<g.length&&j<s.length;j++)
        {
            if(s[j]>=g[i])
            {
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of greed");
        int n = sc.nextInt();
        System.out.println("Enter Size Of size of cookies");
        int c = sc.nextInt();
        int[] g = new int[n];
        int[] s = new int[c];
        System.out.println("Enter greed elements :");
        enterElement(g);
        System.out.println("Enter cookies elements :");
        enterElement(s);
        int maxChild = maximizeContentChild(g,s);
        System.out.println("Maximize Content Child is :"+maxChild);
    }
}
