package Encapsulation;
class ATM
{
  private  int PIN;
   private  int Acc_no;
    ATM(int PIN,int Acc_no)
    {
        this.setPIN(PIN);
        this.setAcc_no(Acc_no);
//        this.PIN =PIN;
//        this.Acc_no = Acc_no;
    }
    void setAcc_no(int Acc_no)

    {
        this.Acc_no =Acc_no;
    }
    public int getAcc_no()
    {
        return Acc_no;
    }
   public int getPIN()
   {
       return PIN;
   }
   public void setPIN(int PIN)
   {
       this.PIN = PIN;
   }
    void display1()
    {
        System.out.println(PIN+" "+Acc_no);
    }
}
class ATM_Machine extends ATM
{
    ATM_Machine(int PIN,int Acc_no)
    {
        super(PIN,Acc_no);
    }
    void display2()
    {
        System.out.println(getPIN()+" "+ getAcc_no());
    }
}

public class Example_for_Encap1
{
    public static void main(String[] args)
    {
      ATM_Machine a = new ATM_Machine(1212,181927393);
      a.display1();
      a.display2();
    }
}
