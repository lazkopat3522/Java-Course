import java.util.Scanner;

public class zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        for(int i = 1; i <= a; i++) {
            int n = sc.nextInt();
            if(n==0){
                sum++;
            }

        }
        System.out.println(sum);
    }
}
