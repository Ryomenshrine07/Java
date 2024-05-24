package DSA_FSD6.Arrays;

import java.util.Scanner;

public class GasStation
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
    static int getStationIndex(int[] gas,int[] cost)
    {
        int totalGas = 0;
        int currentGas = 0;
        int startIndex = 0;
        for(int i=0;i<gas.length;i++)
        {
            totalGas = totalGas - cost[i] + gas[i];
            currentGas = currentGas - cost[i] + gas[i];
            if(currentGas < 0)
            {
                currentGas = 0;
                startIndex = i + 1;
            }
        }
        if(totalGas >= 0)
        {
            return startIndex;
        }
        else
        {
            return  -1;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of gas stations and cost for travelling");
        int n = sc.nextInt();
        int[] gas = new int[n];
        int[] cost = new int[n];
        System.out.println("Enter gas elements :");
        enterElement(gas);
        System.out.println("Enter cost elements :");
        enterElement(cost);
        int gasStationIndex = getStationIndex(gas,cost);
        System.out.println("the starting gas station's index :"+gasStationIndex);
    }
}
