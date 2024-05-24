package patterns;

import java.util.Scanner;

public class Q25 
{
	static void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int num=9;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(num);
				num--;
			}
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