import java.util.Scanner;

public class CheckPalidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number... ");
        int num = sc.nextInt();
        int dum = num;
        int rev = 0;
        while(num > 0){
            int d = num%10;
            rev = rev*10 + d;
            num /= 10;
        }
        if(dum == rev){
            System.out.println(rev + " is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
