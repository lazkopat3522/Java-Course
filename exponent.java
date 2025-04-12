import java.util.Scanner;

public class exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=1;
        int pow=1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                pow=pow*2;
            };
            sum=sum+pow;
            pow=1;
        }
        System.out.println(sum);
    }
}
