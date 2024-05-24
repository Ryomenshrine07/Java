package patterns;

import java.util.Scanner;

public class Q27
{
	static void pattern(int n)
	{
		int num=1,l=0;
		for(int i=1;i<=n;i++)
		{
			l=num;
			int num2=2;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j<=i)
				{
				System.out.print(num);
				num--;
				}
				else
				{
					System.out.print(num2);
					num2++;
				}
			}
			num=l+1;
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