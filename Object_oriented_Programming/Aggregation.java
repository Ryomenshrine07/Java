package Object_oriented_Programming;

class Professor{
	String name;
	int id;
	Professor(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	void display()
	{
		System.out.println(name+" "+id);
	}
}

class Department{
	String name;
	Professor[] professors;
	Department(String name, Professor[] professors)
	{
		this.name = name;
		this.professors = professors;
	}
	void show()
	{
		for (Professor prof : professors)
		{
			System.out.println(name+" "+prof.name+" "+prof.id);
		}
	}
}

public class Aggregation {
	public static void main(String[] args) {
		Professor p1 = new Professor("Mr.Aman",5);
		Professor p2 = new Professor("Mr.Utkarsh",6);
		Department d = new Department("IT",new Professor[] {p1,p2});
		d.show();
	}
}
