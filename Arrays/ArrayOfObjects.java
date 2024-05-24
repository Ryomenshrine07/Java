package Arrays;

import java.util.Scanner;

class Lakme
{
    private String ProductName;
    private int ProductPrice;
    private String ExpiryDate;
    Lakme(String ProdunctName, int ProductPrice, String ExpiryDate)
    {
        setExpiryDate(ExpiryDate);
        setProductName(ProdunctName);
        setProductPrice(ProductPrice);
    }

    public Lakme() {

    }

    void setProductName(String ProductName)
    {
        this.ProductName = ProductName;
    }
    void setProductPrice(int ProductPrice)
    {
        this.ProductPrice = ProductPrice;
    }
    void setExpiryDate(String ExpiryDate)
    {
        this.ExpiryDate = ExpiryDate;
    }
    String getProductName()
    {
        return this.ProductName;
    }
    String getExpiryDate()
    {
        return this.ExpiryDate;
    }
    int getProductPrice()
    {
        return this.ProductPrice;
    }

}

class LakmeKajal extends Lakme
{
    LakmeKajal[] arr;
//    String ProductName;
//    int ProductPrice;
//    String ExpiryDate;
    LakmeKajal(String ProductName,int ProductPrice,String ExpiryDate)
    {
        super(ProductName,ProductPrice,ExpiryDate);
//        this.ProductName = ProductName;
//        this.ExpiryDate = ExpiryDate;
//        this.ProductPrice = ProductPrice;
    }
    LakmeKajal(LakmeKajal[] arr)
    {
        super();
        this.arr = arr;
    }
    void showData()
    {
        System.out.println("Product Name is : "+getProductName());
        System.out.println("Product Price is : "+getProductPrice());
        System.out.println("Product Expiry Date is : "+getExpiryDate());
    }
    void display()
    {
        for(LakmeKajal i : arr)
        {
            System.out.println();
            System.out.println("Product Name is : "+i.getProductName());
            System.out.println("Product Price is : "+i.getProductPrice());
            System.out.println("Product Expiry Date is : "+i.getExpiryDate());
        }
    }
}


public class ArrayOfObjects
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Price, Name, Expiry Date");
        LakmeKajal[] arr = new LakmeKajal[4];
        LakmeKajal obj1 = new LakmeKajal("Black",5000,"12/12/2004");
        LakmeKajal obj2 = new LakmeKajal("Blue",2000,"12/12/2004");
        LakmeKajal obj3 = new LakmeKajal("Red",3000,"12/12/2004");
        LakmeKajal obj4 = new LakmeKajal("Green",6000,"12/12/2004");
        LakmeKajal k = new LakmeKajal(new LakmeKajal[]{obj1, obj2, obj3, obj4});
        k.display();

    }
}
