import java.util.Scanner;

public class Condition_C {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int k = in.nextInt();
        int x=0;
        if(s.length()==4) {
            if (s.charAt(0) == s.charAt(3) && s.charAt(1) == s.charAt(2)) {
                x = 1;
            }
            if ((x == 1 && k == 1) || (x != 1 && k != 1)) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        } else if(k!=1)
                 {
                     System.out.println("YES");
                 } else {
            System.out.println("NO");
        }
    }
}
