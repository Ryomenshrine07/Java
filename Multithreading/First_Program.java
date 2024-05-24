package Multithreading;

class MyClass extends Thread //Thread is present in java.lang package
{
    public void run()
    {
        System.out.println("Thread is running");

        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread is Done");
        }
        System.out.println("Thread is done");
    }
}

public class First_Program
{
    public static void main(String[] args)
    {
        MyClass thread1 = new MyClass();
        MyClass thread2 = new MyClass();

        System.out.println("Thread state when it was created "+thread1.getState());
        System.out.println("Thread state when it was created "+thread2.getState());

        thread1.start();
        thread2.start();

        System.out.println("Thread 1 after starting "+thread1.getState());
        System.out.println("Thread 2 after starting "+thread2.getState());

        try {
            //wait for thread
            thread1.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("Thread 1 after starting "+thread1.getState());
        System.out.println("Thread 2 after starting "+thread2.getState());
    }
}
