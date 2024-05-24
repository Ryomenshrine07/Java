package JVM_Operations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student
{
    int rollno;
    String name;
    Student()
    {

    }
    Student(int rollno, String name)
    {
        setRollno(rollno);
        setName(name);
    }
    void setRollno(int rollno)
    {
        this.rollno =rollno;
    }
    void setName(String name)
    {
        this.name = name;
    }
}
public class Getting_Class_Inforamtion
{
    public static void main(String[] args) {
        Student s1 = new Student(1,"Vinayak");
        Student s2 = new Student();
        Class c1 = s1.getClass();
        Class c2 = s2.getClass();
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c1==c2);

        for(Method a : c1.getDeclaredMethods())
        {
            System.out.println(a.getName());
        }

        for(Field f : c1.getDeclaredFields())
        {
            System.out.println(f.getName());
        }
    }

}
