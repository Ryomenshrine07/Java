class Student
{
  int rollno,age;
  String name;
  double fees;
  Student()
  {

  }
  Student(int rollno, int age, String name)
  {
    this.rollno =rollno;
    this.age = age;
    this.name = name;
  }
  Student(int rollno, int age, String name,int fees)
  {
    this(rollno, age, name);
    this.fees = fees;
  }
  void display(Student[] arr)
  {
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i].name+" "+arr[i].age+" "+arr[i].rollno+" "+arr[i].fees);
    }
  }
}

public class Another_use_of_this 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student(1, 20, "Vinayak Upadhyay");
        Student s2 = new Student(2, 19, "Priyanka Thapa");
        Student s3 = new Student(3, 19, "Tanmay Pandey");
        Student s4 = new Student(4, 19, "Sujal Jain");
        Student s5 = new Student(5, 18, "Aman Pandey", 10000);
        Student s6 = new Student(6, 19, "Aditi Tripathi", 10000);
        Student s7 = new Student(7, 18, "Manjari Upadhyay", 10000);
        Student s8 = new Student(8, 19, "Devashish Mishra", 10000);
        Student obj = new Student();
        obj.display(new Student[] {s1,s2,s3,s4,s5,s6,s7,s8}); 
    }
}
