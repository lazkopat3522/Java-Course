import java.util.Scanner;


public class zer_neg_pos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int zer=0,pos=0,neg=0;
        for(int i = 1; i <= a; i++) {
            int n = sc.nextInt();
            if(n==0){
                zer++;
            } else if(n>0){
                pos++;
            } else {
                neg++;
            }

        }
        System.out.println(zer+" "+pos+" "+neg);
    }
}


