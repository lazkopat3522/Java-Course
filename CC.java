import java.util.Scanner;

public class CC {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int k = in.nextInt();
        int c=s.length();
        int count=0;
        for(int i=0;i<s.length()/2;i++){
         if(s.charAt(i)==s.charAt(c-1)){
            count++;
         }
            c--;
        }
        if(s.length()==4){
        if((count==s.length()/2 && k==1)||((count!=s.length()/2 && k!=1)||(count!=s.length()/2 && k==1)))
        {
            System.out.println("YES");
        } else System.out.println("NO");
    } else if(k!=1){
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
