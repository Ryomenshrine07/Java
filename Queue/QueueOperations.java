package Queue;

class Queue
{
    int rear;
    int front;
    int capacity;
    int size;
    int[] array;
    Queue(int capacity)
    {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }
    boolean isEmpty(Queue queue)
    {
        return queue.size == 0;
    }
    boolean isFull(Queue queue)
    {
        return queue.size == queue.capacity;
    }
    void enqueue(int value)
    {
        if(isFull(this)) {
            System.out.println("Queue is Full!!");
            return;
        }
        else
        {
            this.rear = (this.rear + 1) % this.capacity;
            this.array[this.rear] = value;
            this.size = this.size + 1;
        }
    }
    int dequeue()
    {
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        else
        {
            int value = this.array[this.front];
            this.front = (this.front + 1) % this.capacity;
            this.size = this.size - 1;
            return value;
        }
    }
    int getFront()
    {
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        return this.array[this.front];
    }
    int getRear()
    {
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        return this.array[this.rear];
    }
    void display()
    {
        for(int i=0;i<this.size;i++)
        {
            System.out.print(this.array[i]+" ");
        }
        System.out.println();
    }
}



public class QueueOperations
{
    public static void main(String[] args)
    {
        Queue queue = new Queue(5);
        System.out.println(queue.getRear());
        System.out.println(queue.getFront());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();
        System.out.println("Removing element from front :"+queue.dequeue());
        queue.display();
    }
}
