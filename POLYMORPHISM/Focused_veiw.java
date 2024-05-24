interface IEncrypt
{
    public void encrypt();
    public void decrypt();
}
interface ICompress
{
    public void Compress();
    public void DeCompress();
}
interface IAuthenticate
{
    public void Login();
    public void logout();
}
class working implements IEncrypt,ICompress,IAuthenticate
{
    @Override public void encrypt()
    {
        System.out.println(">>Encrypting");
    }
    @Override public void decrypt()
    {
        System.out.println(">>Decrypting");
    }
    @Override public void Compress()
    {
        System.out.println(">>Compressing");
    }
    @Override public void DeCompress()
    {
        System.out.println(">>DeCompressing");
    }
    @Override public void Login()
    {
        System.out.println(">>Logging in");
    }
    @Override public void logout()
    {
        System.out.println(">>Logging out");
    }
}
class Tryme extends working implements IEncrypt,IAuthenticate,ICompress
{
    @Override public void encrypt()
    {
        System.out.println(">>Encrypting From Try me");
    }
    @Override public void decrypt()
    {
        System.out.println(">>Decrypting From Try me");
    }
    @Override public void Compress()
    {
        System.out.println(">>Compressing From Try me");
    }
    @Override public void DeCompress()
    {
        System.out.println(">>DeCompressing From Try me");
    }
    @Override public void Login()
    {
        System.out.println(">>Logging in From Try me");
    }
    @Override public void logout()
    {
        System.out.println(">>Logging out From Try me");
    }
}
public class Focused_veiw 
{
  public static void main(String[] args) 
  {
    working obj = new working();
    IEncrypt ei = obj;
    ei.encrypt();
    ei.decrypt();
    ICompress ci =obj;
    ci.Compress();
    ci.DeCompress();
    IAuthenticate ai = obj;
    ai.Login();
    ai.logout();
    System.out.println("Copying Derived Class refrence");
    Tryme t = new Tryme();
    ei=t;
    ei.encrypt();
    ei.decrypt();
    ci=t;
    ci.Compress();
    ci.DeCompress();
    ai=t;
    ai.Login();
    ai.logout();    
  }  
}
