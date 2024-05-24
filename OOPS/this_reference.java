public class this_reference 
{
   void x()
   {
    System.err.println("x is displayed");
   }
   void y()
   {
    x();      // It is same as [this.x]
              //internally x() is a reference of y() thats why x is being displayed
   }
   public static void main(String[] args) 
   {
     this_reference s1 = new this_reference();
     s1.y();
   } 
}
