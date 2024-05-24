package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class TimeNeededtoBuyTickets
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
    static void rotate(int arr[], int d, int n)
    {
        d=d%n;
        int temp[] = new int[n];
        int k = 0;
        for (int i = d; i < n; i++)
        {
            temp[k] = arr[i];
            k++;
        }
        for (int i = 0; i < d; i++)
        {
            temp[k] = arr[i];
            k++;
        }
        for (int i = 0; i < n; i++)
        {
            arr[i] = temp[i];
        }
    }
    static int findTimeRequiredToBuyTickets(int[] tickets,int k)
    {
        int i = 0;
        int time = 0;
        while(tickets[k] != 0)
        {
            if(tickets[i] == 0)
            {
                rotate(tickets,1,tickets.length);
                k--;
            }
            else if(tickets[i] != 0)
            {
                tickets[i] = tickets[i] - 1;
                rotate(tickets,1,tickets.length);
                if(k == 0)
                {
                    k = tickets.length - 1;
                }
                else
                {
                    k--;
                }
                time++;
            }
        }
        return time;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        System.out.println("Enter Value of K");
        int k = sc.nextInt();
        int timeRequired = findTimeRequiredToBuyTickets(arr,k);
        System.out.println("Total Time Required is :"+timeRequired);
    }

}
