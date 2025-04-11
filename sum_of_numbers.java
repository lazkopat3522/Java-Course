import java.util.Scanner;

public class sum_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        for(int i = 1; i <= a; i++) {
            int n = sc.nextInt();
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
