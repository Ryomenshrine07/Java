package OOPS;

import java.util.Scanner;

class New_Student
{
    String name;
    int roll_no,class_no;
    New_Student[] students;
    New_Student(New_Student[] students)
    {
        this.students =students;
    }
    New_Student(int roll_no, int class_no, String name)
    {
        this.roll_no = roll_no;
        this.class_no = class_no;
        this.name = name;
    }
    void display()
    {
        for(New_Student i : students)
        {
            System.out.println("Name is "+i.name+" Rollno is :"+i.roll_no+" Class is :"+i.class_no );
        }
    }
}

public class Students_info_using_this
{
    static New_Student[] details(New_Student[] students)
    {
        System.out.println("Enter Details [Roll.no, Class.no, Name]");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<students.length;i++)
        {
            int roll_no = sc.nextInt();
            int class_no = sc.nextInt();
            String name = sc.nextLine();
            students[i] = new New_Student(roll_no,class_no,name);
        }
        return students;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students");
        int n = sc.nextInt();
        New_Student[] students = new New_Student[n];
        students = details(students);
        New_Student obj = new New_Student(students);
        obj.display();
    }
}
