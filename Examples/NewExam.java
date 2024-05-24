package Examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

interface Car
{
    abstract void moving();
    abstract void Break();
}
class CarExp implements Car
{
    public void moving()
    {
        System.out.println("Car is Moving");
    }
    public void Break()
    {
        System.out.println("Car is Stopped");
    }
}
public class NewExam
{
    public static void main(String[] args) {
        Car obj = new CarExp();
        obj.moving();
        obj.Break();
        List<Integer> list = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<Integer>();

    }

}
