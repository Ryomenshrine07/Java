package Stack;

import java.util.*;

public class NoOfStudentsUnableToEat
{
    static void enterElements(int[] arr)
    {
        System.out.println("Enter Array Elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static int findStarvingStudents(int[] students, int[] sandwiches)
    {
        int hungry = 0;
        Stack<Integer> sandwich = new Stack<>();
        Queue<Integer> student = new ArrayDeque<>();
        for(int i=sandwiches.length-1;i>=0;i--)
        {
            sandwich.add(sandwiches[i]);
        }
        for(int i : students)
        {
            student.add(i);
        }
        while((!student.isEmpty() && hungry != student.size()))
        {
            if(Objects.equals(sandwich.peek(), student.peek()))
            {
                sandwich.pop();
                student.remove();
                hungry = 0;
            }
            else if(!Objects.equals(student.peek(), sandwich.peek()))
            {
                hungry++;
                int frontStudent = student.remove();
                student.add(frontStudent);
            }
        }
        return hungry;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Arrays :");
        int n = sc.nextInt();
        int[] students = new int[n];
        enterElements(students);
        System.out.println("Enter Sandwiches :");
        int[] sandwiches = new int[n];
        enterElements(sandwiches);
        int starvingStu = findStarvingStudents(students,sandwiches);
        System.out.println("Total Starving Students are :"+starvingStu);
    }
}
