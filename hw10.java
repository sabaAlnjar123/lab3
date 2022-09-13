import java.util.Scanner;

/**
 * Created by DELL on 09/07/2022.
 */
public class hw10 {
    public static void main(String[] args) {
        int jan=1, feb=2, mar=3, apr=4, may=5, jun=6, jul=7, aug=8,
                sep=9, oct=10, nov=11, dec=12;

        System.out.println("enter the math number");
        int x;
        Scanner n =new Scanner(System.in);
        x=n.nextInt();


        if( x==jan)
            System.out.println("jan = 31 day");

        if(x==feb)
            System.out.println("feb = 29 day");
        if(x==mar)
            System.out.println("mar = 31 day");
        if(x==apr)
            System.out.println("apr = 30 day");
        if(x==may)
            System.out.println("may = 31 day");
        if(x==jun)
            System.out.println("jun = 30 day");
        if(x==jul)
            System.out.println("jul = 31 day");
        if(x==aug)
            System.out.println("jan = 31 day");
        if(x==sep)
            System.out.println("sep = 30 day");
        if(x==oct)
            System.out.println("oct = 31 day");
        if(x==nov)
            System.out.println("nov = 30 day");
        if(x==dec)
            System.out.println("dec = 31 day");















    }


}
