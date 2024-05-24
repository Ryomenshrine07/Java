package oops;

class Wild{
	Wild get()
	{
		return this;
	}
	String name = "Tiger";
	void eat() {
		System.out.println("Wild Animal is eating");
	}
}
class Tiger extends Wild{
	String name = "Baby Tiger";
	Tiger get()
	{
		return this;
	}
	void eat() {
		System.out.println("Tiger is eating");
	}
	void sleep() {
		System.out.println("Tiger is sleeping");
	}
}
class Cub extends Tiger{
	String name = "cub";
	Cub get()
	{
		return this;
	}
	void eat() {
		System.out.println("Baby Tiger is eating");
	}
	void sleep() {
		System.out.println("Baby Tiger is sleeping");
	}
	void roar() {
		System.out.println("Baby Tiger is roaring");
	}
}

public class MultiLevel {
	public static void main(String[] args) {
		Cub c = new Cub();
		System.out.println(c.name);
		c.eat();
		c.sleep();
		c.roar();
		Tiger t = new Tiger();
		System.out.println(t.name);
		t.eat();
		t.sleep();
		Wild w = new Wild();
		System.out.println(w.name);
		w.eat();
		new Cub().get().eat();
	}
}
