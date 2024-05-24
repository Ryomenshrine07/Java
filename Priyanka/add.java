package Priyanka;

public class add {
    public static void main(String[] args) {
        int n=45899,rem,sum=0,first,last,dif,lastdigit,firstdigit;
        last=n%10;
        lastdigit=last*last;
        while(n>10)
        {
            n=n/10;
        }
       first=n;
        firstdigit=first*first;
        dif= lastdigit-firstdigit;

        System.out.println("difference is"+dif);


    }
}
