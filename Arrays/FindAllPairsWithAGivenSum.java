package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class pair
{
    int first,second;
    pair(int first , int second)
    {
        this.first = first;
        this.second =second;
    }
}
public class FindAllPairsWithAGivenSum
{
    public static pair[] allPairs( int A[], int B[], int N, int M, int X)
    {
        pair[] arr = new pair[A.length * B.length];
        int k = 0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<B.length;j++)
            {
                if(A[i] + B[j] == X)
                {
                    pair obj = new pair(A[i],B[j]);
                    arr[k++] = obj;
                }
            }
        }
        return Arrays.copyOf(arr,k);
    }
    static void enterElements(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

    }
    static void printPairs(pair[] pairs)
    {
        if(pairs.length == 0)
            System.out.println(-1);
        else
        {
            for(int i=0;i<pairs.length;i++)
            {
                if(i < pairs.length - 1) {
                    System.out.println(pairs[i].first + " " + pairs[i].second);
                }
                else
                {
                    System.out.println(pairs[i].first + " " + pairs[i].second);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of First Array");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        enterElements(arr1);

        System.out.println("Enter Size of Second Array");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        enterElements(arr2);

        System.out.println("Enter The number whose sum is to be checked for pairs");
        int x = sc.nextInt();

        pair[] Array = allPairs(arr1, arr2, arr1.length, arr2.length, x);

        printPairs(Array);
    }
}
