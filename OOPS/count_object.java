package OOPS;

public class count_object
{
    static int count = 0;
   public count_object()
   {
      count++;
   }
   public count_object(count_object a)
   {
      count++;
   }
   public count_object(int a,int b)
   {
      count++;
   }
   public static void main(String[] args) 
   {
      count_object obj1 = new count_object();
      count_object obj2 = new count_object(obj1);
      count_object obj3 = new count_object(5,6);
      count_object obj4 = new count_object();
      System.out.println("Total number of objects made :"+count);
   }
    
}
