package OOPS;

class CodingThinker{
	String name = "Aman";
	int id = 5;
}

public class InheritanceExample extends CodingThinker {
	double salary = 25000.00;
	public static void main(String[] args) {
		InheritanceExample IE = new InheritanceExample();
		System.out.println(IE.name);
		System.out.println(IE.id);
		System.out.println(IE.salary);
	}
}
