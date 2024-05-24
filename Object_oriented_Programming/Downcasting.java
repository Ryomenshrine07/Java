package Object_oriented_Programming;

class College{
	void disp()
	{
		System.out.println("College is LNCT");
	}
}
class Student extends College{
	static void disp(College c)
	{
		Student s = (Student)c;//downcasting
		System.out.println("Students belong to SIRT");
		s.disp();
	}
}
public class Downcasting {
	public static void main(String[] args) {
		College c = new Student();//upcasting in main method
		Student.disp(c);
		c.disp();
	}
}
