package My_Projects;



class Item
{
    String itemName;
    String description;
    double price;
    int totalStock;
    boolean inStock;
    int barCode;
    Item(Item[] items, String itemName, String description, double price, int totalStock, int barCode)
    {
        setItemName(itemName);
        setDescription(description);
        setPrice(price);
        setTotalStock(totalStock);
        setBarCode(barCode);
    }
    void setItemName(String itemName)
    {
        this.itemName = itemName;
    }
    void setDescription(String description)
    {
        this.description = description;
    }
    void setPrice(double price)
    {
        this.price = price;
    }
    void setTotalStock(int totalStock)
    {
        this.totalStock = totalStock;
    }
    void setBarCode(int barCode)
    {
        this.barCode = barCode;
    }
    String getItemName()
    {
        return this.itemName;
    }
    String getDescription()
    {
        return this.description;
    }
    double getPrice()
    {
        return this.price;
    }
    int getBarCode()
    {
        return this.barCode;
    }
}

class Inventory
{
    Item[] items;
    Inventory(Item[] items)
    {
        this.items = items;
    }
}

class User
{
    String id;
    String userName;
    String passWord;
    String email;

}


public class ECommerceApplication
{
    public static void main(String[] args)
    {

    }
}
