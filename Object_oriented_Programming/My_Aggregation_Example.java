package Object_oriented_Programming;
class Library
{
    int shelf_num;
    int row_num;
    Library(int shelf_num, int row_num)
    {
        this.shelf_num = shelf_num;
        this.row_num = row_num;
    }
    void show()
    {
        System.out.println("Shelf number of Book is"+shelf_num);
        System.out.println("Row number of Book is"+row_num);
    }
}
class Book
{
    String name;
    Library[] book_loc;
    Book(String name, Library[] book_loc)
    {
        this.name =name;
        this.book_loc = book_loc;
    }
    void display()
    {
        for(Library l : book_loc)
        {
            System.out.println("Book name is "+name+" and it is present at shelf "+l.shelf_num+" , in "+l.row_num+" Row");
        }
    }
}

public class My_Aggregation_Example
{
    public static void main(String[] args)
    {
        Library l1 = new Library(1,2);
        Library l2 = new Library(5,3);
        Book b1 = new Book("Merchant of Venice", new Library[]{l1,l2});
        b1.display();
    }
}
