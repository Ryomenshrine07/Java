package Exception_Handling;

class Citizen
{
    private String name;
    private int Aadhar_no , age;
    Citizen(String name , int age, int Aadhar_no)
    {
        setName(name);
        setAge(age);
        setAadhar_no(Aadhar_no);
    }
    void setAge(int age)
    {
        this.age =age;
    }
    void setName(String name)
    {
        this.name = name;
    }
    void setAadhar_no(int Aadhar_no)
    {
        this.Aadhar_no = Aadhar_no;
    }
    int getAge()
    {
        return this.age;
    }
    int getAadhar_no()
    {
        return this.Aadhar_no;
    }
    String getName()
    {
        return this.name;
    }
    void display()
    {
        System.out.println("Citizen's name : "+name);
        System.out.println("Citizen's age : "+age);
        System.out.println("Citizen's Aadhaar No. : "+Aadhar_no);
    }
}

class Voting_Machine extends Citizen
{
    private String Machine_version;
    Voting_Machine(String Machine_version,String name,int age,int Aadhar_no)
    {
        super(name,age,Aadhar_no);
        setMachine_version(Machine_version);
    }
    void setMachine_version(String Machine_version)
    {
        this.Machine_version = Machine_version;
    }
    String getMachine_version()
    {
        return this.Machine_version;
    }
    void verifyIdentity(boolean status) throws Exception
    {
        if(getAge()>=18)
        {
            if(status)
            {
                System.out.println("You have been verified as citizen");
                System.out.println("You can vote now.....");
                System.out.println("Machine number : " + getMachine_version());
            }
            else
            {
                throw new Exception("You are not verified as citizen of this state \nYou have to be a Citizen of this state to vote");
            }
        }
        else
        {
            throw new Exception("You must be "+(18-getAge())+" older to vote");
        }
    }
    void informationOfCitizen()
    {
        System.out.println("Name of Citizen is : "+getName());
        System.out.println("Age of Citizen is : "+getAge());
        System.out.println("Aadhar no. of Citizen is : "+getAadhar_no());
    }
}
public class Voting_criteria
{
    public static void main(String[] args)
    {
        try
        {
            Voting_Machine v = new Voting_Machine("1.12.01","Vinayak Upadhay",21,797971717);
            v.informationOfCitizen();
            v.verifyIdentity(true);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
