interface IListMethods
{
    int count();
    public void add_element(Object o);
    public void del_element(Object o);
}
class Array_work implements IListMethods
{
    @Override public int count()
    {
        System.out.println("In Array count");
        return 0;
    }
    @Override public void add_element(Object o)
    {
        System.out.println("In Array add element");
    }
    @Override public void del_element(Object o)
    {
        System.out.println("In Array Del element");
    }
}
class LinkedList implements IListMethods
{
    @Override public int count()
    {
        System.out.println("In Linked List count");
        return 0;
    }
    @Override public void add_element(Object o)
    {
        System.out.println("In Linked List add element");
    }
    @Override public void del_element(Object o)
    {
        System.out.println("In Linked List Del element");
    }
}
public class Diff_Implementations 
{
  public static void main(String[] args) 
  {
    Array_work obj = new Array_work();
    IListMethods ar=obj;
    ar.count();
    ar.add_element(obj);
    ar.del_element(obj);

    LinkedList obj2 = new LinkedList();
    IListMethods ll=obj2;
    ll.count();
    ll.add_element(obj2);
    ll.del_element(obj2); 
  }  
}
