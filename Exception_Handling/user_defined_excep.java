package Exception_Handling;

class Customers
{
    String name;
    int acc,bal;
    public Customers(String a, int b, int c)
    {
        name=a;
        acc=b;
        bal=c;
    }
    void Withdraw(int amt)throws BankException
    {
        if(bal-amt<=500)
        {
            throw new BankException(acc,bal,name);
        }
        else
        {
            bal=bal-amt;
            System.out.println("Amount Withdrawn :"+amt);
            System.out.println("Current balance :"+bal);
        }
    }
}

class BankException extends Exception
{
    private int acc,bal;
    String name;
    public BankException(int acc,int bal,String name)
    {
        this.acc=acc;
        this.bal=bal;
        this.name=name;
    }
    void inform()
    {
        System.out.println("Customer :"+name);
        System.out.println("Your account is :"+acc);
        System.out.println("Your balance is :"+bal);
    }
}

public class user_defined_excep 
{
  public static void main(String[] args) 
  {
    try
    {
        Customers c = new Customers("Vinayak Upadhyay", 2453, 900);
        c.Withdraw(500);
    }
    catch(BankException e)
    {
        System.out.println("You should maintain at least 500 rupee in your account");
        e.inform();
    }
  }  
}
