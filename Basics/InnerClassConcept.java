package Basics;

public class InnerClassConcept
{
    class InnerClass
    {
        static void display()
        {
            System.out.println("In Inner Class");
        }
    }
    public static void main(String[] args)
    {
        InnerClassConcept obj = new InnerClassConcept();
        InnerClassConcept.InnerClass.display();
    }
}
