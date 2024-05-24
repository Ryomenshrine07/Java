package Amount_calc;
class A implements Runnable
{
    private Thread t;
    private String threadName;
    A(String threadName)
    {
        this.threadName = threadName;
    }

    @Override
    public void run()
    {
        while(true)
        {
            System.out.println(threadName);
        }
    }
    public void start()
    {
        if(t == null)
        {
            t = new Thread(this,threadName);
            t.start();
        }
    }
}

public class AnalysisOne
{
    public static void main(String[] args)
    {
        A sample1 = new A("A");
        A sample2 = new A("B");
        sample2.start();
        sample1.start();
    }
}
