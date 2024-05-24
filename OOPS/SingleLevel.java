package oops;

class Animal{
	String color = "White";
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal{
	String color = "Black";
	void eat() {
		System.out.println("Dog is eating");
	}
	void sleep() {
		System.out.println("Dog is sleeping");
	}
	void color()
	{
		super.eat();
		eat();
		sleep();
	}
}

public class SingleLevel{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.color();
	}
}
