package INHERITANCE;

 class Work 
{
  protected int count;
   int num = 5;
  void increment()
  {
    count = count + 1;
  }
  void display()
  {
    System.out.println("Value of count and num is :"+count+" "+num);
  }  
}
class inherit extends Work
{
    void decreament()
    {
        count = count - 1;
    }
}
public class Example_1
{
    public static void main(String[] args) 
    {
      inherit i;
      i = new inherit();
      i.increment();
      i.display();
      i.decreament();
      i.num = 10;
      i.display();
    }
}
