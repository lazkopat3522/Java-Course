import java.util.Arrays;
import java.util.Scanner;

public class AL {
        public static void main(String[] args) {
            Scanner n = new Scanner(System.in);
            int n1 = n.nextInt();
            int[] ar = new int[n1];
            for(int i = 0; i < n1; i++){
                ar[i] = n.nextInt();
            }
            int n2 = n.nextInt();
            for(int i = 0; i < n1; i++) {
                if(n2>ar[i]){
                    System.out.println(i+1); break; }
            }
        }
    }


