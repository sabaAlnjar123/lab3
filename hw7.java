/**
 * Created by DELL on 09/07/2022.
 */
public class hw7 {
    public static void main(String[] args) {
        int x=1, y=2, s=3;
        if(x<y&&y<s)
            System.out.println("order " +s +  + y +  + x  +"ascending = ");
        if(s>y&&y>x)
            System.out.println("order" +x +  + y +  + s  +"descending = ");
        else
            System.out.println("no order ");
    }
}
