import java.io.FileWriter;
import java.io.IOException;
public class Final_block 
{
    public static void main(String[] args) 
    {
        FileWriter fw =null;
        try
        {
            fw = new FileWriter("a.text");
            fw.write("Hello Word, I am here to master java");
        }
        catch(IOException ie)
        {
            System.out.println("Encountered IO Error");
        }
        finally
        {
            try
            {
                if(fw!=null) //ek bar file khul gai and usme write kar diya o vo null to nahi rahegi
                fw.close();
            }
            catch(IOException io)
            {
                System.out.println("Error in input");
            }
        }
    }
}
