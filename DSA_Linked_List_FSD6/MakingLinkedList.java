package DSA_Linked_List_FSD6;

class Node
{
    int data;
    Node next;
    Node head;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        head = this;
    }
    void addAtLast(int data)
    {
        if(head == null)
        {
            head = new Node(data);
        }
        else
        {
            Node newNode = new Node(data);
            Node temp = head;
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
            head = new Node(data);
        }
        else
        {
            Node newNode = new Node(data);
            Node temp = head;
            head = newNode;
            newNode.next = temp;
        }
    }
    void addAfter(int prevData,int data)
    {
        Node temp = head;
        while(temp.data != prevData)
        {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void displayList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}

public class MakingLinkedList
{
    public static void main(String[] args)
    {
        Node node = new Node(10);
        node.addAtLast(20);
        node.addAtBeginning(30);
        node.addAfter(10,100);
        node.displayList();
    }

}
