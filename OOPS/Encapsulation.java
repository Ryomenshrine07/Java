package OOPS;

class ATM
{
	private int PIN;
	private int accountNumber;
	ATM(int PIN, int accountNumber)
	{
		this.setPIN(PIN);
		this.x(accountNumber);
	}
	void disp1()
	{
		System.out.println("ATM :"+getPIN()+" "+getAccountNumber());
	}
	public int getPIN() {
		return PIN;
	}
	public void setPIN(int pIN) {
		PIN = pIN;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void x(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}
class ATMMachine extends ATM{
	ATMMachine(int PIN,int accountNumber){
		super(PIN,accountNumber);
	}
	void disp2()
	{
		System.out.println("ATMMachine :"+getPIN()+" "+getAccountNumber());
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMMachine a = new ATMMachine(1234,654879);
		a.disp1();
		a.disp2();

	}

}
