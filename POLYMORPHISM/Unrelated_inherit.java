interface ICharacter
{
    void patriotism();
}
class Actor
{
    protected String s = "Spikes";
    void style()
    {
        System.out.println("Actor.Style>> :"+s);
    }

}
class person extends Actor implements ICharacter
{
    void do_acting()
    {
        System.out.println("He can do acting");
    }
    void style()
    {
        super.style();
        System.out.println("Person.Style>> :"+s);
    }
    public void patriotism()
    {
        System.out.println("Person.patriotism");
    }
}
public class Unrelated_inherit 
{
  public static void main(String[] args) 
  {
    Actor a;
    person p = new person();
    a=p;
    a.style();
    p.do_acting();

    ICharacter i;
    i = p;
    i.patriotism();
  }  
}
