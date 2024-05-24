package Object_oriented_Programming;

public class CallByReference {
	int data = 10;

	void add (CallByReference obj)
	{
		obj.data = obj.data+100;
	}
	public static void main(String[] args) {
		CallByReference obj = new CallByReference();
		System.out.println("Before method call "+ obj.data);
		obj.add(obj);
		System.out.println("After method call "+ obj.data);
	}
	
}
