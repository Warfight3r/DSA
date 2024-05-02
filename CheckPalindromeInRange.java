import java.util.Scanner;

public class CheckPalindromeInRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the max and min ranges...");
        int max = sc.nextInt();
        int min = sc.nextInt();

        for(int i = min; i <= max; i++){
            int rev = 0;
            int dum = i;
            
            while(dum > 0){
                int d = dum%10;
                rev = rev*10 + d;
                dum /= 10;
            }
            if( i == rev){
                System.out.print(rev + " ");
            }
        }
    }
}
