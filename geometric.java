import java.util.Scanner;

public class geometric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        int n = sc.nextInt();
        double sum=1;
        for(int i = 1; i <= n; i++) {
            sum=sum+Math.pow(a,i);
        }
        System.out.println(sum);
    }
}
