package patterns;

import java.util.Scanner;

public class Q34 
{
	static void pattern(int n)
	{
		int k=n;
		int temp=n-1,e=0;
		for(int i=1;i<=n;i++)
		{
			int num=1,l=temp;
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*k-1;j++)
			{
				if(j<=n-e)
				{
				System.out.print(num);
				num++;
				}
				else
				{
					System.out.print(temp);
					temp--;
				}
			}
			e++;
			temp = l-1;
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