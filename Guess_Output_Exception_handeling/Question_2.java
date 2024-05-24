package Guess_Output_Exception_handeling;

public class Question_2
{
    int count = 0;

    void A() throws Exception
    {
        try
        {
            count++;

            try
            {
                count++;

                try
                {
                    count++;
                    throw new Exception();

                }

                catch(Exception ex)
                {
                    count++;
                    throw new Exception();
                }
            }

            catch(Exception ex)
            {
                count++;
                //[Here no Exception was Thrown so control will not reach next Exception block]
            }
        }

        catch(Exception ex)
        {
            count++;
        }

    }

    void display()
    {
        System.out.println("Value of Count : "+count);
    }

    public static void main(String[] args) throws Exception
    {
        Question_2 obj = new Question_2();
        obj.A();
        obj.display();
    }
}
