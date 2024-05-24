package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CommonOperations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int flag = 0;
        while(flag == 0)
        {
            System.out.println("1. Push Element in Stack");
            System.out.println("2. Pop Element From Stack");
            System.out.println("3. Peek Element Of Stack");
            System.out.println("4. Search Element in Stack");
            System.out.println("5. Stack is Empty Or Not");
            System.out.println("6. Exit");
            System.out.println("Enter Your Choice :");
            int ch = sc.nextInt();
            switch (ch)
            {
                case 1: System.out.println("Enter Element to be Pushed");
                        int num = sc.nextInt();
                        stack.push(num);
                        System.out.println("Stack is :"+stack);
                        break;
                case 2: System.out.println("Popped Element");
                        stack.pop();
                        System.out.println("Stack is :"+stack);
                        break;
                case 3: System.out.println("Peek Element is :"+stack.peek());
                        break;
                case 4: System.out.println("Enter Element to be Searched");
                        num = sc.nextInt();
                        int pos = stack.search(num);
                        if(pos == -1)
                        {
                            System.out.println("Element Not Found");
                        }
                        else
                        {
                            System.out.println("Element Found At Position :"+pos);
                        }
                        break;
                case 5: if(stack.isEmpty())
                        {
                            System.out.println("Stack is Empty");
                        }
                        else
                        {
                            System.out.println("Stack is Not Empty");
                        }
                        break;
                case 6: flag = 1;
                break;
            }
        }
    }
}
