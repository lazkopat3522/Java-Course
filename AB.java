import java.util.Scanner;

public class AB {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int n1 = n.nextInt();
        int[] ar = new int[n1];
        for(int i = 0; i < n1; i++){
            ar[i] = n.nextInt();
        }
        for(int i = 0; i < n1; i++) {
            if (ar[i] % 2 == 0)
                System.out.println(ar[i] + " ");

        }
    }
}
