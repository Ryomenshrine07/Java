package patterns;

import java.util.Scanner;

public class Q21 
{
	static void pattern(int n)
	{
		int k=0;
		for(int i=1;i<=n;i++)
		{
			int num=5;
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-k;j++)
			{
				System.out.print(num);
				num--;
			}
			k++;
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