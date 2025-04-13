import java.util.*;
import java.lang.Math;

public class chocolates {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=input.nextInt();
        int y=0;
        y=x/100+(x%100)/10+x%10;
        System.out.println(y);

    }
}
