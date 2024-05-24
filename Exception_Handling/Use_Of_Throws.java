//Throws creates new exceptions and is only used to resolve Unchecked Exception

package Exception_Handling;

import java.io.IOException;

class Thorws_a_Example extends Exception
{
    void method() throws IOException
    {
        throw new IOException("Exception Throwed");
    }
}
public class Use_Of_Throws
{
    public static void main(String[] args)
    {
        try
        {
            Thorws_a_Example a = new Thorws_a_Example();
            a.method();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
