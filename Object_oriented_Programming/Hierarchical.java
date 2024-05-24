package Object_oriented_Programming;


class A{
	String name = "Parent";
	void walk() {
		System.out.println("Parent is walking");
	}
}

class B extends A{
	String name = "First Child";
	void walk() {
		System.out.println("Child 1 is walking");
	}
	void study() {
		System.out.println("Child 1 is studying");
	}
}

class C extends A{
	String name = "Second Child";
	void walk() {
		System.out.println("Child 2 is walking");
	}
	void play() {
		System.out.println("Child 2 is playing");
	}
}
public class Hierarchical {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.name);
		c.walk();
		c.play();
		B b = new B();
		System.out.println(b.name);
		b.walk();
		b.study();
	}
}
