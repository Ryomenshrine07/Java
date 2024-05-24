package oops;

class Bike{
	int milage = 60;
	void speed()
	{
		System.out.println("Bike speed limit is 120");
	}
}

class TVS extends Bike{
	int milage = 50;
	void speed()
	{
		System.out.println("TVS bike spped limit is 90");
	}
}
public class Upcasting {
	public static void main(String[] args) {
		Bike b = new TVS();
		b.speed();
		System.out.println(b.milage);
	}
}
