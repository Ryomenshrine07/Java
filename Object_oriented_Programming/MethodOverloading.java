package oops;

public class MethodOverloading {
	
	static int add (int a , int b)
	{
		int c = a+b;
		return c;
	}
	static float add (float a , int b)
	{
		float c = a+b;
		return c;
	}
	public static void main(String[] args) {
		int res = add(10,20);
		float sum = add(1.99f, 25);
		System.out.println(res);
		System.out.println(sum);
	}
}
