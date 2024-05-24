package Object_oriented_Programming;

class Demo{
	void disp()
	{
		System.out.println("Demo class");
	}
}

class Test extends Demo{
	void disp()
	{
		System.out.println("Test class");
	}
}
public class InstanceOfOperator {
	public static void main(String[] args) {
		Test t = new Test();
		Demo d = new Demo();
		Demo d1 = new Test();
//		Test t1 = (Test)new Demo();
		System.out.println(t instanceof Test);
		System.out.println(t instanceof Demo);
		System.out.println(d instanceof Test);
		System.out.println(d instanceof Demo);
		System.out.println(d1 instanceof Test);
		System.out.println(d1 instanceof Demo);
//		System.out.println(t1 instanceof Test);
//		System.out.println(t1 instanceof Demo);
	}
}
