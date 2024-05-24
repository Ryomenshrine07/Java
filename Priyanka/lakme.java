package Priyanka;
import java.util.*;
class lakeme_pro
{
    String product_name;
    int price;
    String expiry_date;
    lakeme_pro(String product_name,int price,String expiry_date)
    {
        this.product_name=product_name;
        this.price=price;
        this.expiry_date=expiry_date;
        setprice(price);
        setExpiry_date(expiry_date);
        setProduct_name(product_name);
    }

    void setProduct_name(String product_name)
    {
        this.product_name=product_name;
    }
    String getProduct_name()
    {
        return this.product_name;
    }
    void setprice(int price)
    {
        this.price=price;
    }
    int getprice()
    {
        return this.price;
    }
    void setExpiry_date(String expiry_date)
    {
        this.expiry_date=expiry_date;
    }
    String getExpiry_date()
    {
        return this.expiry_date;
    }
}
class lakme_kajal extends lakeme_pro
{
    lakme_kajal(String product_name,int price,String expiry_date)
    {
        super(product_name,price,expiry_date);

    }
    void  info()
    {
        System.out.println("product name is:"+ product_name);
        System.out.println("price name is:"+ price);
        System.out.println("expiry date is:"+expiry_date);
    }
}
public class lakme {
    public static void main(String[] args) {
        lakme_kajal obj= new lakme_kajal("black",100,"2026");
        obj.info();
    }
}
