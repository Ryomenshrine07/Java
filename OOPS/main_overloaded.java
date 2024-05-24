public class main_overloaded 
{
    public  void main()
    {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);  
    }
  public static void main(String[] args) 
  {
    int a = 5;
    int b = 6;
    int c = a + b;
    System.out.println(c);
    main_overloaded obj = new main_overloaded();
    obj.main();
  }  
}
