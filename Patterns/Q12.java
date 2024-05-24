package patterns;

import java.util.Scanner;

public class Q12 
{
	static void pattern(int n)
	{
		int k=0;
		int num=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-k;j++)
			{
				System.out.print(num);
				num--;
			}
			num=n-i;
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