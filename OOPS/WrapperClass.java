package oops;

public class WrapperClass {

	public static void main(String[] args) {
		Float i = 127f;
		Float l = 127f;
		Float j = 500f;
		Float k = 500f;
		System.out.println(System.identityHashCode(i));
		System.out.println(System.identityHashCode(l));
		System.out.println(i==l);
		System.out.println(j==k);
	}

}
