package Exception_Handling;

import java.util.Scanner;
class Customers2
{
    String name;
    int bal,acc;
    Customers2(String name,int bal,int acc)
    {
        this.name = name;
        this.bal = bal;
        this.acc = acc;
    }
    void trancsaction(int amt ,int flag) throws Bal_Exception,Tran_Exception
    {
        if(amt>bal)
        {
            throw new Bal_Exception(name, bal, amt);
        }
        bal = bal - amt;
    }
    void display()
    {
        System.out.println("Customer is :"+name);
        System.out.println("Balance is :"+bal);
        System.out.println("Account no. is : "+acc);
    }
}

class Tran_Exception extends Exception
{
    String name;
    int Tran_id,bal;
    Tran_Exception(String name,int Tran_id,int bal)
    {
        this.name=name;
        this.Tran_id=Tran_id;
        this.bal=bal;
    }
    void inform()
    {
        System.out.println("Customer name is :"+name);
        System.out.println("Your Transaction id :"+Tran_id);
        System.out.println("Your Updated balance is :"+bal);
    }
}

class Bal_Exception extends Exception
{
    String name;
    int amt,bal;
    public Bal_Exception(String name,int bal,int amt)
    {
        this.name = name;
        this.bal = bal;
        this.amt = amt;
    }
    void inform()
    {
        System.out.println("Customer name :"+name);
        System.out.println("Amount Attempted to be transacted :"+amt);
        System.out.println("Current Balance :"+bal);
    }
}
public class transaction_fail 
{
  public static void main(String[] args) 
  {
    try
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Acoount's Balance");
        int bal = sc.nextInt();
        Customers2 c = new Customers2("Vinayak Upadhyay",bal,123456789);
        c.display();
        System.out.println("Enter Amount To Be Transacted");
        int amt = sc.nextInt();
        c.trancsaction(amt, 1);
        // c.inform();
        sc.close();
    }
    catch(Tran_Exception e )
    {
        System.out.println("Transaction Failed!!!!");
        System.out.println("Your Amount was not debited");
        e.inform();
    }
    catch(Bal_Exception a)
    {
        System.out.println("Transaction limit Exceded!!!!");
        a.inform();
    }
  }  
}
