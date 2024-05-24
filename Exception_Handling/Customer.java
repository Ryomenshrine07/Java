package Exception_Handling;

public class Customer {
    int bal, Tran_id;
    String name;

    public Customer(String name, int bal, int Tran_id) {
        this.name = name;
        this.bal = bal;
        this.Tran_id = Tran_id;
    }

    void trancsaction(int amt, int flag) throws Tran_Exception, Bal_Exception {
        if (amt > bal) {
            throw new Bal_Exception(name, bal, amt);
        } else if (flag == 1) {
            bal = bal - amt;
        } else {
            throw new Tran_Exception(name, Tran_id, bal);
        }
    }

    void display() {
        System.out.println("Customer name :" + name);
        System.out.println("Your Current Balance :" + bal);
    }

    void inform() {
        System.out.println("Your Transaction id :" + Tran_id);
        System.out.println("Your Updated Balance :" + bal);
    }

    public static void main(String[] args) throws Bal_Exception, Tran_Exception
    {
        try
        {
            Customer c = new Customer("Vinayak", 1000, 123456);
            c.trancsaction(200, 1);
            c.inform();
        }
        catch (Tran_Exception | Bal_Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
