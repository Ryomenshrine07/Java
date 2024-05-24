import java.util.Scanner;
public class Window 
{
    public static void main(String[] args) 
    {
      Vinayak obj = new Vinayak();
      obj.get_data();
      obj.Show_data();  
    }
}
class Vinayak
{
    int hieght,weight;
    enum Properties
    {
        Cursortyoe,Windowcolor
    }
    public Vinayak()
    {

    }
    void Show_data(Properties c, Properties win)
    {
        System.out.println("Hieght is :"+hieght+" Weight is :"+weight);
        System.out.println("Cursor type is: "+c+" Window colour is :"+win);
    }
    void get_data()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hieght and weight");
        hieght=sc.nextInt();
        weight=sc.nextInt();
    }
    public void Show_data() 
    {
    }
}