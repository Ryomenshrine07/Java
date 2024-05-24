package OOPS;
import java.lang.*;
public class GarbageCollecter
{
    public void finalize()
    {
        System.out.println("Object deleted");
    }
    public static void main(String[] args)
    {
        GarbageCollecter g1 = new GarbageCollecter();
        GarbageCollecter g2 = new GarbageCollecter();
        System.gc();

    }
}
