package My_Projects;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

abstract class Player
{
    int Health;
    static int Mana_points = 2;
    int attack_power;
    String  Durability;
    String Potion;
    String Armor;
    String Weapon;
    Player(int Health, int attack_power,int Mana_points,String Durability,String Potion,String Armor,String Weapon)
    {
        this.Health = Health;
        this.attack_power =attack_power;
//        this.Mana_points = Mana_points;
        this.Durability = Durability;
        this.Weapon = Weapon;
        this.Potion =Potion;
        this.Armor = Armor;

    }
    abstract void attack(Player player);
    abstract void defend(Player player);
    abstract void useItem(Player player);
    abstract void useMagicAttack(Player player);
    abstract void activateAbilities();
    abstract void useSpecialAbilities(Player player);
    abstract void showInformationOfCharacter();
    abstract void showFinalInformationOfCharacter();
    abstract int armorPower();
}
class Items
{
     String chooseWeapon(Player player)
     {
         int flag;
         String ch = "";
         System.out.println();
         System.out.println("Choose Weapon For Your Character :");
         Scanner sc = new Scanner(System.in);
         if(player instanceof Warrior)
         {
             flag = 0;
             while(flag == 0) {
                 System.out.println();
                 System.out.println("1. Axe [Damage = +5]");
                 System.out.println("2. Spear [Damage = +6]");
                 System.out.println("3. Sword [Damage = +5]");
                 System.out.println("Enter Your Choice : ");
                 ch = sc.nextLine();
                 ch = ch.toLowerCase();
                 if(ch.equals("axe") || ch.equals("spear") || ch.equals("sword"))
                 {
                     flag = 1;
                 }
                 else
                 {
                     System.out.println("Try Again!!...");
                 }
             }
             return ch;
         }
         else if (player instanceof Samurai)
         {
             flag = 0;
             while(flag == 0) {
                 System.out.println();
                 System.out.println("1. Katana [Damage +5]");
                 System.out.println("2. Daggers [Damage +1]");
                 System.out.println("3. Tachi [Damage +2]");
                 System.out.println("Enter Your Choice : ");
                 ch = sc.nextLine();
                 ch = ch.toLowerCase();
                 if(ch.equals("katana") || ch.equals("daggers") || ch.equals("tachi"))
                 {
                     flag = 1;
                 }
                 else
                 {
                     System.out.println("Try Again!!...");
                 }
             }
             return ch;
         }
         else if (player instanceof Mage)
         {
             flag = 0;
             while(flag == 0) {
                 System.out.println();
                 System.out.println("1. Fire Staff [Damage +4]");
                 System.out.println("2. Water Staff [Damage +3]");
                 System.out.println("3. Wind Staff [Damage +3]");
                 System.out.println("3. Air Staff [Damage +5]");
                 System.out.println("Enter Your Choice : ");
                 ch = sc.nextLine();
                 ch = ch.toLowerCase();
                 if(ch.equals("fire staff") || ch.equals("water staff") || ch.equals("wind staff") || ch.equals("air staff"))
                 {
                     flag = 1;
                 }
                 else
                 {
                     System.out.println("Try Again!!...");
                 }
             }
             return ch;
         }
         else if (player instanceof Healer)
         {
             flag = 0;
             while(flag == 0) {
                 System.out.println();
                 System.out.println("1. Holy Staff [Damage +2]");
                 System.out.println("2. Hell's Staff [Damage +3]");
                 System.out.println("Enter Your Choice : ");
                 ch = sc.nextLine();
                 ch = ch.toLowerCase();
                 if(ch.equals("holy staff") || ch.equals("hell's staff"))
                 {
                     flag = 1;
                 }
                 else
                 {
                     System.out.println("Try Again!!...");
                 }
             }
             return ch;
         }
         return "";
     }
     String choosePotion(Player player)
     {
         int flag;
         String ch = "";
         System.out.println();
         System.out.println("Choose Potion For Your Character :");
         System.out.println();
         Scanner sc = new Scanner(System.in);
         if(player instanceof Warrior)
         {
             flag = 0;
             while(flag == 0) {
                 System.out.println();
                 System.out.println("1. Rage Potion [Attack Power +2]");
                 System.out.println("2. Power Potion [Durability +2]");
                 System.out.println("Enter Your Choice : ");
                 ch = sc.nextLine();
                 ch = ch.toLowerCase();
                 if(ch.equals("rage potion") || ch.equals("power potion"))
                 {
                     flag = 1;
                 }
                 else
                 {
                     System.out.println("Try Again!!...");
                 }
             }
             return ch;
         }
         else if (player instanceof Samurai)
         {
             flag = 0;
             while(flag == 0) {
                 System.out.println();
                 System.out.println("1. Beserk Potion [Attack Power +3]");
                 System.out.println("2. Blood Thirst Potion [Attack Power +4]");
                 System.out.println("3. Agility Potion [Durability +3]");
                 System.out.println("Enter Your Choice : ");
                 ch = sc.nextLine();
                 ch = ch.toLowerCase();
                 if(ch.equals("beserk potion") || ch.equals("blood thirst potion") || ch.equals("agility potion"))
                 {
                     flag = 1;
                 }
                 else
                 {
                     System.out.println("Try Again!!...");
                 }
             }
             return ch;
         }
         else if (player instanceof Mage)
         {
             flag = 0;
             while(flag == 0) {
                 System.out.println();
                 System.out.println("1. Magic Boost Potion [Attack Power +2]");
                 System.out.println("2. Health Potion [Health Recovery +10]");
                 System.out.println("3. Shield Potion [Durability +4]");
                 System.out.println("Enter Your Choice : ");
                 ch = sc.nextLine();
                 ch = ch.toLowerCase();
                 if(ch.equals("magic boost potion") || ch.equals("health potion") || ch.equals("shield potion"))
                 {
                     flag = 1;
                 }
                 else
                 {
                     System.out.println("Try Again!!...");
                 }
             }
             return ch;
         }
         else if (player instanceof Healer)
         {
             flag = 0;
             while(flag == 0) {
                 System.out.println();
                 System.out.println("1. Recovery Potion [Health Recovery +10]");
                 System.out.println("2. Damage Boost Potion [Attack Power +8]");
                 System.out.println("Enter Your Choice : ");
                 ch = sc.nextLine();
                 ch = ch.toLowerCase();
                 if(ch.equals("recovery potion") || ch.equals("damage boost potion"))
                 {
                     flag = 1;
                 }
                 else
                 {
                     System.out.println("Try Again!!...");
                 }
             }
             return ch;
         }
         return "";
     }
     String chooseArmor(Player player)
     {
         int flag;
         String ch = "";
         System.out.println();
         System.out.println("Choose Armor For Your Character :");
         System.out.println();
         Scanner sc = new Scanner(System.in);
         if(player instanceof Warrior)
         {
             flag = 0;
             while(flag == 0) {
                 System.out.println();
                 System.out.println("1. Heavy Armor [Durability +5]");
                 System.out.println("2. Light Armor [Durability +2]");
                 System.out.println("Enter Your Choice : ");
                 ch = sc.nextLine();
                 ch = ch.toLowerCase();
                 if(ch.equals("heavy armor") || ch.equals("light armor"))
                 {
                     flag = 1;
                 }
                 else
                 {
                     System.out.println("Try Again!!...");
                 }
             }
             return ch;
         }
         else if (player instanceof Samurai)
         {
             flag = 0;
             while(flag == 0) {
                 System.out.println();
                 System.out.println("1. Leather Armor [Durability +2]");
                 System.out.println("2. Steel Armor [Durability +3]");
                 System.out.println("3. Iron Armor [Durability +4]");
                 System.out.println("Enter Your Choice : ");
                 ch = sc.nextLine();
                 ch = ch.toLowerCase();
                 if(ch.equals("leather armor") || ch.equals("steel armor") || ch.equals("iron armor"))
                 {
                     flag = 1;
                 }
                 else
                 {
                     System.out.println("Try Again!!...");
                 }
             }
             return ch;
         }
         else if (player instanceof Mage)
         {
             flag = 0;
             while(flag == 0) {
                 System.out.println();
                 System.out.println("1. Bloody Cloak [Durability +4]"); //resistense to attacks
                 System.out.println("2. Night Cloak [Durability +5]"); //increases health by 5
                 System.out.println("3. Royal Cloak [Durability +2]"); //provide immense resistence from attacks
                 System.out.println("Enter Your Choice : ");
                 ch = sc.nextLine();
                 ch = ch.toLowerCase();
                 if(ch.equals("bloody cloak") || ch.equals("night cloak") || ch.equals("royal cloak"))
                 {
                     flag = 1;
                 }
                 else
                 {
                     System.out.println("Try Again!!...");
                 }
             }
             return ch;
         }
         else if (player instanceof Healer)
         {
             flag = 0;
             while(flag == 0) {
                 System.out.println();
                 System.out.println("1. Holy Cloak [Durability +5]");
                 System.out.println("2. Devil's Cloak [Durability +8]");
                 System.out.println("Enter Your Choice : ");
                 ch = sc.nextLine();
                 ch = ch.toLowerCase();
                 if(ch.equals("holy cloak") || ch.equals("devil's cloak"))
                 {
                     flag = 1;
                 }
                 else
                 {
                     System.out.println("Try Again!!...");
                 }
             }
             return ch;
         }
         return "";
     }
}
class Warrior extends Player
{
    int Health = 200;
    int Mana_points = 2;
    int attack_power = 10;
    String  Durability = "Excellent";
    String Armor;
    String Weapon;
    String Potion;
    static int ActivateAbility = 0;
    Warrior()
    {
        super(200,10,2,"Excellent","","","");
    }
    int armorPower()
    {
        switch (this.Armor)
        {
            case "heavy armor" ->
            {
                return 5;
            }
            case "light armor" ->
            {
                return 2;
            }
        }
        return 0;
    }
    @Override
    void attack(Player player)
    {
        switch (this.Weapon)
        {
            case "axe" ->
            {
                this.attack_power = this.attack_power + 5;
                player.Health = (player.Health + player.armorPower()) - this.attack_power;
            }
            case "spear" ->
            {
                this.attack_power = this.attack_power + 6;
                player.Health = (player.Health + player.armorPower()) - this.attack_power;
            }
            case "sword" ->
            {
                this.attack_power = this.attack_power + 4;
                player.Health = (player.Health + player.armorPower()) - this.attack_power;
            }
        }
    }

    @Override
    void defend(Player player)
    {
        switch (this.Armor)
        {
            case "heavy armor" ->
            {
                System.out.println("Warrior Defended");
            }
            case "light armor" ->
            {
                System.out.println("Warrior Defended");
            }
        }
    }

    @Override
    public void useItem(Player player)
    {
        switch (this.Potion)
        {
            case "rage potion" ->
            {
                System.out.println("Warrior is feeling Furious!!");
                System.out.println("Warrior Attack Power increased by 2!!");
                this.attack_power = this.attack_power + 2;

            }
            case "power potion" ->
            {
                System.out.println("Warrior is Buffed!!");
                System.out.println("Warrior Durability Increased by 2!!");
                this.Health = this.Health + 2;
            }
        }
    }

    @Override
    void useMagicAttack(Player player)
    {
        if(this.Mana_points > 0) {
            System.out.println("Warrior Smash!!");
            player.Health = player.Health - 15;
            this.Mana_points = this.Mana_points - 1;
        }
        else
        {
            System.out.println("Warrior is out of Mana Points!!");
        }
    }


    @Override
    public void activateAbilities()
    {
        if(ActivateAbility > 0)
        {
            System.out.println("Samurai's Special Ability is Already Activated");
        }
        else {
            ActivateAbility++;
            System.out.println("Warrior's Special Ability Activated!!!...");
        }
    }

    @Override
    void useSpecialAbilities(Player player)
    {
        if(ActivateAbility == 0)
        {
            System.out.println("Warrior's Special Ability is Not Activated Yet");
        }
        else if(ActivateAbility == 1)
        {
            ActivateAbility++;
            System.out.println("WARRIOR'S WRATH");
            player.Health = player.Health - 30;
        }
        else
        {
            System.out.println("Warrior's Special Ability has already been used once!");
        }
    }

    @Override
    public void showInformationOfCharacter()
    {
        System.out.println("Warrior's Health is : "+Health);
        System.out.println("Warrior's attack power is : "+attack_power);
        System.out.println("Warrior's Mana Points are : "+Mana_points);
        System.out.println("Warrior's Durability is : "+Durability);
        System.out.println("Warrior's Magic Attack [cost :- 1 Mana Point] : Warrior's Smash [Deals 15 Damage]");
        System.out.println("Special Attack [Can only be used once] : Warrior's Wrath [Deals 30 Damage]");
    }
    public void showFinalInformationOfCharacter()
    {
        System.out.println("Warrior's Health is : "+Health);
        System.out.println("Warrior's attack power is : "+attack_power);
        System.out.println("Warrior's Mana Points are : "+Mana_points);
        System.out.println("Warrior's Durability is : "+Durability);
        System.out.println("Warrior's Magic Attack [cost :- 1 Mana Point] : Warrior's Smash [Deals 15 Damage]");
        System.out.println("Special Attack [Can only be used once] : Warrior's Wrath [Deals 30 Damage]");
        System.out.println("Selected Weapon is : "+Weapon);
        System.out.println("Selected Armor is : "+Armor);
        System.out.println("Selected Potion is : "+Potion);
    }
}
class Mage extends Player
{
    int Health = 140;
    int Mana_points = 2;
    int attack_power = 18;
    String  Durability = "Average";
    String Armor;
    String Weapon;
    String Potion;
    static int ActivateAbility = 0;
    Mage()
    {
        super(140,18,2,"Average","","","");
    }
    @Override
    void attack(Player player)
    {
        switch (this.Weapon)
        {
            case "fire staff" ->
            {
                this.attack_power = this.attack_power + 4;
                player.Health = (player.Health + player.armorPower()) - this.attack_power;
            }
            case "water staff" ->
            {
                this.attack_power = this.attack_power + 3;
                player.Health = (player.Health + player.armorPower()) - this.attack_power;
            }
            case "wind staff" ->
            {
                this.attack_power = this.attack_power + 3;
                player.Health = (player.Health + player.armorPower()) - this.attack_power;
            }
            case "air staff" ->
            {
                this.attack_power = this.attack_power + 5;
                player.Health = (player.Health + player.armorPower()) - this.attack_power;
            }
        }
    }

    @Override
    void defend(Player player)
    {
        switch (this.Armor)
        {
            case "bloody cloak" ->
            {
                System.out.println("Mage Defended");
            }
            case "night cloak" ->
            {
                System.out.println("Mage Defended");
            }
            case "royal cloak" ->
            {
                System.out.println("Mage Defended");
            }
        }
    }

    @Override
    public void useItem(Player player)
    {
        switch (this.Potion)
        {
            case "magic boost potion" ->
            {
                System.out.println("Magic Boost Potion Used...");
                System.out.println("Mage Attack Power Incresed By 2");
                this.attack_power = this.attack_power + 2;
            }
            case "health potion" ->
            {
                System.out.println("Health Potion Used...");
                System.out.println("Mage Health Incresed By 10");
                this.Health = this.Health + 10;
            }
            case "shield potion" ->
            {
                System.out.println("Shield Potion Used...");
                System.out.println("Mage Will Suffer Less Damage Now");
                player.attack_power = player.attack_power - 5;
            }
        }
    }

    @Override
    void useMagicAttack(Player player)
    {
        if(this.Mana_points > 0) {
            System.out.println("Meteor's rain!!");
            player.Health = player.Health - 20;
            this.Mana_points = this.Mana_points - 1;
        }
        else
        {
            System.out.println("Mage is out of Mana Points!!");
        }
    }
    @Override
    public void activateAbilities()
    {
        if(ActivateAbility > 0)
        {
            System.out.println("Mage's Special Ability is Already Activated");
        }
        else {
            ActivateAbility++;
            System.out.println("Mage's Special Ability Activated!!!...");
        }
    }

    @Override
    void useSpecialAbilities(Player player)
    {
        if(ActivateAbility == 0)
        {
            System.out.println("Mage's Special Ability is Not Activated Yet");
        }
        else if(ActivateAbility == 1)
        {
            ActivateAbility++;
            System.out.println("SHINRA TENSEI!!");
            player.Health = player.Health - 35;
        }
        else
        {
            System.out.println("Mage's Special Ability has already been used once!");
        }
    }
    @Override
    public void showInformationOfCharacter()
    {
        System.out.println("Mage's Health is : "+Health);
        System.out.println("Mage's attack power is : "+attack_power);
        System.out.println("Mage's Mana Points are : "+Mana_points);
        System.out.println("Mage's Durability is : "+Durability);
        System.out.println("Mage's Magic Attack [cost :- 1 Mana Point] : Meteor's rain [Deals 20 Damage]");
        System.out.println("Special Attack [Can only be used once] : Shinra Tensei [Deals 35 Damage]");
    }
    public void showFinalInformationOfCharacter()
    {
        System.out.println("Mage's Health is : "+Health);
        System.out.println("Mage's attack power is : "+attack_power);
        System.out.println("Mage's Mana Points are : "+Mana_points);
        System.out.println("Mage's Durability is : "+Durability);
        System.out.println("Mage's Magic Attack [cost :- 1 Mana Point] : Meteor's rain [Deals 20 Damage]");
        System.out.println("Special Attack [Can only be used once] : Shinra Tensei [Deals 35 Damage]");
        System.out.println("Mage Weapon is : "+Weapon);
        System.out.println("Mage Armor is : "+Armor);
        System.out.println("Mage Potion is : "+Potion);
    }

    @Override
    int armorPower()
    {
        switch (this.Armor)
        {
            case "bloody cloak" ->
            {
                return 4;
            }
            case "night cloak" ->
            {
                return 5;
            }
            case "royal cloak" ->
            {
                return 2;
            }
        }
        return 0;
    }
}
class Healer extends Player
{
    int Health = 100;
    int Mana_points = 3;
    int attack_power = 10;
    String  Durability = "Weak";
    String Armor;
    String Weapon;
    String Potion;
    static int ActivateAbility = 0;
    Healer()
    {
        super(100,10,3,"Weak","","","");
    }

    @Override
    void attack(Player player)
    {
        switch (this.Weapon) {
            case "holy staff" -> {
                this.attack_power = this.attack_power + 2;
                player.Health = (player.Health + player.armorPower()) - this.attack_power;
            }
            case "hell's staff" -> {
                this.attack_power = this.attack_power + 3;
                player.Health = (player.Health + player.armorPower()) - this.attack_power;
            }
        }
    }

    @Override
    void defend(Player player)
    {
        switch (this.Armor)
        {
            case "holy cloak" ->
            {
                System.out.println("Healer Defended");
            }
            case "devil's cloak" ->
            {
                System.out.println("Healer Defended");
            }
        }
    }

    @Override
    public void useItem(Player player)
    {
        switch (this.Potion)
        {
            case "revovery potion" ->
            {
                System.out.println("Recovery Potion Used...");
                System.out.println("Healer's Health inceresed by 10");
                this.Health = this.Health + 10;
            }
            case "damage boost potion" ->
            {
                System.out.println("Damage Boost Potion Used...");
                System.out.println("Healer's Damage inceresed by 8");
                this.attack_power = this.attack_power + 8;
            }
        }
    }

    @Override
    void useMagicAttack(Player player)
    {
        if(this.Mana_points > 0) {
            System.out.println("God's Rule!!");
            player.Health = player.Health - player.attack_power;
            player.Mana_points = player.Mana_points - 1;
        }
        else
        {
            System.out.println("Healer is out of Mana Points!!");
        }
    }

    @Override
    public void activateAbilities()
    {
        if(ActivateAbility > 0)
        {
            System.out.println("Healer's Special Ability is Already Activated");
        }
        else {
            ActivateAbility++;
            System.out.println("Healer's Special Ability Activated!!!...");
        }
    }

    @Override
    void useSpecialAbilities(Player player)
    {
        if(ActivateAbility == 0)
        {
            System.out.println("Healer's Special Ability is Not Activated Yet");
        }
        else if(ActivateAbility == 1)
        {
            ActivateAbility++;
            System.out.println("DIVINE DEPARTURE!!");
            player.Health = player.Health - 35;
        }
        else
        {
            System.out.println("Healer's Special Ability has already been used once!");
        }
    }

    @Override
    public void showInformationOfCharacter()
    {
        System.out.println("Healer's Health is : "+Health);
        System.out.println("Healer's attack power is : "+attack_power);
        System.out.println("Healer's Mana Points are : "+Mana_points);
        System.out.println("Healer's Durability is : "+Durability);
        System.out.println("Healer's Magic Attack [cost :- 1 Mana Point] : God's Rule [Enemy's will suffer damage from thier own attack]");
        System.out.println("Special Attack [Can only be used once] : Divine Departure [Deals 50 Damage]");
    }
    public void showFinalInformationOfCharacter()
    {
        System.out.println("Healer's Health is : "+Health);
        System.out.println("Healer's attack power is : "+attack_power);
        System.out.println("Healer's Mana Points are : "+Mana_points);
        System.out.println("Healer's Durability is : "+Durability);
        System.out.println("Healer's Magic Attack [cost :- 1 Mana Point] : God's Rule [Enemy's will suffer damage from thier own attack]");
        System.out.println("Special Attack [Can only be used once] : Divine Departure [Deals 50 Damage]");
        System.out.println("Healer Weapon is : "+Weapon);
        System.out.println("Healer Armor is : "+Armor);
        System.out.println("Healer Potion is : "+Potion);
    }

    @Override
    int armorPower()
    {
        switch (this.Armor)
        {
            case "holy cloak" ->
            {
                return 5;
            }
            case "devil's cloak" ->
            {
                return 8;
            }
        }
        return 0;
    }
}
class Samurai extends Player
{
    int Health = 150;
    int Mana_points = 2;
    int attack_power = 35;
    String  Durability = "Good";
    String Armor;
    String Weapon;
    String Potion;
    static int ActivateAbility = 0;
    Samurai()
    {
        super(150,35,2,"Good","","","");
    }

    @Override
    void attack(Player player)
    {
        switch (this.Weapon) {
            case "katana" -> {
                this.attack_power = this.attack_power + 5;
                player.Health = (player.Health + player.armorPower()) - this.attack_power;
            }
            case "daggers" -> {
                this.attack_power = this.attack_power + 1;
                player.Health = (player.Health + player.armorPower()) - this.attack_power;
            }
            case "tachi" -> {
                this.attack_power = this.attack_power + 2;
                player.Health = (player.Health + player.armorPower()) - this.attack_power;
            }
        }
    }

    @Override
    void defend(Player player)
    {
        switch (this.Armor)
        {
            case "leather armor" ->
            {
                System.out.println("Samurai Defended");
            }
            case "steel armor" ->
            {
                System.out.println("Samurai Defended");
            }
            case "iron armor" ->
            {
                System.out.println("Samurai Defended");
            }
        }
    }

    @Override
    public void useItem(Player player)
    {
        switch (this.Potion)
        {
            case "beserk potion" ->
            {
                System.out.println("Beserk Potion Used...");
                System.out.println("Samurai's Attack Power Incresed by 3");
                this.attack_power = this.attack_power + 3;
            }
            case "blood thirst potion" ->
            {
                System.out.println("Blood Thirst Potion Used...");
                System.out.println("Samurai's Attack Power Incresed by 4");
                this.attack_power = this.attack_power + 4;
            }
            case "agility potion" ->
            {
                System.out.println("Agility Potion Used...");
                System.out.println("Samurai Will suffer less Damage");
                this.attack_power = this.attack_power + 3;
                player.attack_power = player.attack_power - 5;
            }
        }
    }

    @Override
    void useMagicAttack(Player player)
    {
        if(this.Mana_points > 0) {
            System.out.println("Shi Shison son!!");
            player.Health = player.Health - 24;
            this.Mana_points = this.Mana_points - 1;
        }
        else
        {
            System.out.println("Samurai is out of Mana Points!!");
        }
    }

    @Override
    public void activateAbilities()
    {
        if(ActivateAbility > 0)
        {
            System.out.println("Samurai's Special Ability is Already Activated");
        }
        else {
            ActivateAbility++;
            System.out.println("Samurai Special Ability Activated!!");
        }
    }

    @Override
    void useSpecialAbilities(Player player)
    {
        if(ActivateAbility == 0)
        {
            System.out.println("Samurai's Special Ability has not been activated");
        }
        else if (ActivateAbility == 1)
        {
            ActivateAbility++;
           System.out.println("MALOVARENT SHRINE!!");
           player.Health = player.Health - 40;
        }
        else
        {
            System.out.println("Samurai's Special Ablity has already been used");
        }

    }

    @Override
    public void showInformationOfCharacter()
    {
        System.out.println("Samurai's Health is : "+Health);
        System.out.println("Samurai's attack power is : "+attack_power);
        System.out.println("Samurai's Mana Points are : "+Mana_points);
        System.out.println("Samurai's Durability is : "+Durability);
        System.out.println("Samurai's Magic Attack [cost :- 1 Mana Point] : Shi Shison son [Deals 24 Damage]");
        System.out.println("Special Attack [Can only be used once] : Malovarent Shrine [Deals 40 Damage]");
    }
    public void showFinalInformationOfCharacter()
    {
        System.out.println("Samurai's Health is : "+Health);
        System.out.println("Samurai's attack power is : "+attack_power);
        System.out.println("Samurai's Mana Points are : "+Mana_points);
        System.out.println("Samurai's Durability is : "+Durability);
        System.out.println("Samurai's Magic Attack [cost :- 1 Mana Point] : Shi Shison son [Deals 24 Damage]");
        System.out.println("Special Attack [Can only be used once] : Malovarent Shrine [Deals 40 Damage]");
        System.out.println("Samurai Weapon is : "+Weapon);
        System.out.println("Samurai Armor is : "+Armor);
        System.out.println("Samurai Potion is : "+Potion);
    }

    @Override
    int armorPower()
    {
        switch (this.Armor)
        {
            case "leather armor" ->
            {
                return 2;
            }
            case "steel armor" ->
            {
                return 3;
            }
            case "iron armor" ->
            {
                return 4;
            }
        }
        return 0;
    }
}

class GameAction
{
    static int chance = 0;
    void Fight(Player player1, Player player2)
    {
        showInformationStart(player1,player2);
        while (player1.Health > 0 && player2.Health > 0)
        {
            System.out.println();
            int choice;
            if((chance % 2 == 0 || chance == 0))
            {
                choice = chooseAction();
                chance++;
                switch (choice)
                {
                    case 1 -> player1.attack(player2);
                    case 2 -> player1.defend(player2);
                    case 3 -> player1.useItem(player2);
                    case 4 -> player1.useMagicAttack(player2);
                    case 5 -> player1.activateAbilities();
                    case 6 -> player1.useSpecialAbilities(player2);
                    default -> System.out.println("Wrong Choice");
                }
            }
            else
            {
                choice = chooseAction();
                chance++;
                switch (choice)
                {
                    case 1 -> player2.attack(player1);
                    case 2 -> player2.defend(player1);
                    case 3 -> player2.useItem(player1);
                    case 4 -> player2.useMagicAttack(player1);
                    case 5 -> player2.activateAbilities();
                    case 6 -> player2.useSpecialAbilities(player1);
                    default -> System.out.println("Wrong Choice");
                }
            }
            showInformationInGame(player1,player2);
        }
        if(player1.Health <= 0)
        {
            System.out.println("Player 2 Wins!!!!");
        }
        else
        {
            System.out.println("Player 1 Wins!!!!");
        }
    }
    int chooseAction()
    {
        Scanner sc = new Scanner(System.in);
        int flag=0;
        while(flag == 0)
        {
            System.out.println();
            System.out.println("1. Attack");
            System.out.println("2. Defend");
            System.out.println("3. use Potion");
            System.out.println("4. Use Magic Attack");
            System.out.println("5. Activate Abilities");
            System.out.println("6. Use Special Ability (Can only be used once)");
            System.out.println();
            if( chance == 0 || chance % 2 == 0)
            {
                System.out.println("Enter your Choice Player 1 :");
            }
            else
            {
                System.out.println("Enter your Choice Player 2 :");
            }
            int choice = sc.nextInt();
            if(choice >=1 && choice <=6)
            {
                flag = 1;
                return choice;
            }
            else
            {
                System.out.println("Try Again!!...");
            }
        }
        return 0;
    }
    void showInformationStart(Player player1, Player player2)
    {
        System.out.println("Player 1 Health                               Player 2 Health");
        System.out.println("      "+player1.Health+"                                           "+player2.Health);
        System.out.println("Player 1 Mana Points :"+player1.Mana_points+"                      Player 2 Mana Points :"+player2.Mana_points);
    }
    void showInformationInGame(Player player1, Player player2)
    {
        System.out.println("Player 1 Health                               Player 2 Health");
        System.out.println("      "+player1.Health+"                                           "+player2.Health);
        System.out.println("Player 1 Mana Points :"+player1.Mana_points+"                      Player 2 Mana Points :"+player2.Mana_points);
    }
}

public class RPG_GAME
{
    static  int menu()
    {
        System.out.println("1. Start");
        System.out.println("2. End\n");
        System.out.println("Enter Your Choice");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
    static  String showChoices()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Your Character :");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Healer");
        System.out.println("4. Samurai");
        System.out.println("Enter your Character's type");
        String str = sc.nextLine();
        return str;
    }
    static Player assignPlayerCharacter(String str)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int flag = 0;
        Player player = null;
        str = str.toLowerCase();
        while (flag == 0)
        {
            switch (str) {
                case "warrior" -> {
                    player = new Warrior();
                    System.out.println("Warrior's information : ");
                    player.showInformationOfCharacter();
                    System.out.println();
                    System.out.println("Are you sure about choosing Warrior? (Yes / No)");
                    String response = sc.nextLine();
                    response = response.toLowerCase();
                    if(response.equals("yes"))
                    {
                        assignCharacterItems(player);
                        System.out.println();
                        System.out.println("Selected Character and Items :");
                        System.out.println();
                        player.showFinalInformationOfCharacter();
                        flag = 1;
                    }
                    else {
                        flag = 0;
                        System.out.println();
                        System.out.println("Choose Your Character :");
                        str = sc.nextLine();
                        str = str.toLowerCase();
                    }
                }
                case "mage" -> {
                    player = new Mage();
                    System.out.println("Mage's information : ");
                    player.showInformationOfCharacter();
                    System.out.println();
                    System.out.println("Are you sure about choosing Mage? (Yes / No)");
                    String response = sc.nextLine();
                    response = response.toLowerCase();
                    if(response.equals("yes"))
                    {
                        assignCharacterItems(player);
                        System.out.println();
                        System.out.println("Selected Character and Items :");
                        System.out.println();
                        player.showFinalInformationOfCharacter();
                        flag = 1;
                    }
                    else {
                        flag = 0;
                        System.out.println();
                        System.out.println("Choose Your Character :");
                        str = sc.nextLine();
                        str = str.toLowerCase();
                    }
                }
                case "healer" -> {
                    player = new Healer();
                    System.out.println("Healer's information : ");
                    player.showInformationOfCharacter();
                    System.out.println();
                    System.out.println("Are you sure about choosing Healer? (Yes / No)");
                    String response = sc.nextLine();
                    response = response.toLowerCase();
                    if(response.equals("yes"))
                    {
                        assignCharacterItems(player);
                        System.out.println();
                        System.out.println("Selected Character and Items :");
                        System.out.println();
                        player.showFinalInformationOfCharacter();
                        flag = 1;
                    }
                    else {
                        flag = 0;
                        System.out.println();
                        System.out.println("Choose Your Character :");
                        str = sc.nextLine();
                        str = str.toLowerCase();
                    }
                }
                case "samurai" -> {
                    player = new Samurai();
                    System.out.println("Samurai's information : ");
                    player.showInformationOfCharacter();
                    System.out.println();
                    System.out.println("Are you sure about choosing Samurai? (Yes / No)");
                    String response = sc.nextLine();
                    response = response.toLowerCase();
                    if(response.equals("yes"))
                    {
                        assignCharacterItems(player);
                        System.out.println();
                        System.out.println("Selected Character and Items :");
                        System.out.println();
                        player.showFinalInformationOfCharacter();
                        flag = 1;
                    }
                    else {
                        flag = 0;
                        System.out.println();
                        System.out.println("Choose Your Character :");
                        str = sc.nextLine();
                        str = str.toLowerCase();
                    }
                }
                default -> {
                    System.out.println("Wrong Character type");
                    System.out.println("Try again !!");
                    System.out.println();
                    str = sc.nextLine();
                    str = str.toLowerCase();
                }
            }
        }
        return player;
    }
    static void assignCharacterItems(Player player)
    {
        Items it = new Items();
        if(player instanceof Warrior)
        {
            player = (Warrior) player;
            ((Warrior) player).Weapon = it.chooseWeapon(player);
            ((Warrior) player).Armor = it.chooseArmor(player);
            ((Warrior) player).Potion = it.choosePotion(player);
        }
        else if(player instanceof Mage)
        {
            player = (Mage) player;
            ((Mage) player).Weapon = it.chooseWeapon(player);
            ((Mage) player).Armor = it.chooseArmor(player);
            ((Mage) player).Potion = it.choosePotion(player);
        }
        else if (player instanceof Healer)
        {
            player = (Healer) player;
            ((Healer) player).Weapon = it.chooseWeapon(player);
            ((Healer) player).Armor = it.chooseArmor(player);
            ((Healer) player).Potion = it.choosePotion(player);
        }
        else if (player instanceof Samurai)
        {
            player = (Samurai) player;
            ((Samurai) player).Weapon = it.chooseWeapon(player);
            ((Samurai) player).Armor = it.chooseArmor(player);
            ((Samurai) player).Potion = it.choosePotion(player);
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Bloody Roar");
        int choice = menu();
        if(choice == 2)
        {
            System.out.println("Thank you for Playing!!!!");
            System.exit(0);
        }
        System.out.println("For Player 1 :");
        String str1 = showChoices();
        Player player1 = assignPlayerCharacter(str1);
        System.out.println();
        System.out.println("For Player 2 :");
        String str2 = showChoices();
        Player player2 = assignPlayerCharacter(str2);
        System.out.println();
        System.out.println("Lets Start The Game !!!!");
        System.out.println();
        GameAction Game = new GameAction();
        Game.Fight(player1,player2);
    }

}
