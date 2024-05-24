package Exception_Handling;

import java.util.Scanner;

class Customer_s
{
    String name;
    int credit;
    int credit_limit;
    public Customer_s(String n, int credit, int credit_limit)
    {
        name=n;
        this.credit=credit;
        this.credit_limit=credit_limit;
    }
    void transac(int amt) throws Credit_exp
    {
        if(amt>credit_limit)
        {
            throw new Credit_exp(name,credit_limit);
        }
        else
        {
            credit=credit+amt;
        }
    }
    void display()
    {
        System.out.println("Customer :"+name);
        System.out.println("Your Total credit is :"+credit);
    }
}
class Credit_exp extends Exception
{
    private String name;
    private int credit_limit;
    public Credit_exp(String name, int credit_limit)
    {
        this.name=name;
        this.credit_limit=credit_limit;
    }
    void inform()
    {
        System.out.println("Customer :"+name);
        System.out.println("Transaction limtit is :"+credit_limit);
    }
} 

public class Credit_card_exp 
{
  public static void main(String[] args)
  {
    try
    {
        Customer_s c = new Customer_s("Vinayak Upadhyay", 10000, 5000);
        c.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to be credited");
        int amt = sc.nextInt();
        c.transac(amt); 
        c.display();
        sc.close();
    }
    catch(Credit_exp e)
    {
        System.out.println("Your transaction limit exceeded !!!");
        e.inform();
    }
  }  
}
