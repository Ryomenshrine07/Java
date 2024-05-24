package patterns;
import java.util.*;
public class Q39 
{
	static void pattern(int n)
	{
		int num=5,num2=2;
		for(int i=1;i<=n;i++)
		{
			if(i<=(n/2)+1)
			{
				int l=num;
				for(int j=1;j<=i;j++)
				{
					System.out.print(num);
					num++;
				}
				num=l-1;
			}
			else
			{
				int l=num2;
				for(int j=1;j<=(n-i)+1;j++)
				{
					System.out.print(num2);
					num2++;
				}
				num2=l+1;
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
