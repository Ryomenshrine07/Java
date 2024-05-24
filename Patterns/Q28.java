package patterns;

import java.util.Scanner;

public class Q28 
{
	static void pattern(int n)
	{
		int k=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*k-1;j++)
			{
				System.out.print("*");
			}
			k--;
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		pattern(n);
		sc.close();
	}

}