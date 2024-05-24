package Object_oriented_Programming;

public class CallByValue {
	
	int data = 10;
	
	void add (int data)
	{
		data = data+100;
	}
	public static void main(String[] args) {
		CallByValue obj = new CallByValue();
		System.out.println("Before method calling "+ obj.data);
		obj.add(20);
		System.out.println("After method calling "+ obj.data);
	}

}
