package DSA_Linked_List_FSD6;

class Node1
{
    int data;
    Node1 next;
    Node1 head;
    Node1(int data)
    {
        this.data = data;
        this.next = null;
        head = this;
    }
    void addAtLast(int data)
    {
        if(head == null)
        {
            head = new Node1(data);
        }
        else
        {
            Node1 newNode = new Node1(data);
            Node1 temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = null;
        }
    }
    void addAtBeginning(int data)
    {
        if(head == null)
        {
            head = new Node1(data);
        }
        else
        {
            Node1 newNode = new Node1(data);
            Node1 temp = head;
            head = newNode;
            newNode.next = temp;
        }
    }
    void addAfter(int prevData,int data)
    {
        Node1 temp = head;
        while(temp.data != prevData)
        {
            temp = temp.next;
        }
        Node1 newNode = new Node1(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void displayList()
    {
        Node1 temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
public class LinkedListCycle
{
    public static void main(String[] args)
    {
        Node1 node = new Node1(10);
        node.addAtLast(20);
        node.addAtLast(30);
    }
}
