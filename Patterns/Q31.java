package patterns;

import java.util.Scanner;

public class Q31 
{
	static void pattern(int n)
	{
		int k=n,num=9;
		for(int i=1;i<=n;i++)
		{
			int l=num;
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*k-1;j++)
			{
				System.out.print(num);
				num--;
			}
			k--;
			num=l-2;
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