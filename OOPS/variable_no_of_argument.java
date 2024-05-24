package OOPS;

public class variable_no_of_argument 
{
    void variable(int ...a)
    {
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args)
    {
        variable_no_of_argument obj = new variable_no_of_argument();
        obj.variable(10,20,30,40,50);
    }
}
