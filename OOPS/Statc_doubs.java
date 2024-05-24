public class Statc_doubs 
{
    static int count;
    int count1;       //--> Default value is Zero in static.
                      //--> [This keyword] Can be used with static variable through objects but it should be 
                      //accessed in static way. 
//     static
//    {
//      String MyID = "0105CB220171";
//    }
   Statc_doubs get()
   {
    return this;
   }
   void display()
   {
    this.count =10;
    System.out.println(count);
    System.out.println(this.count);
   }  
   public static void main(String[] args) 
   {
    // int count;
    new Statc_doubs().get().display();
    // System.out.println(this.count1); 
   }
}
