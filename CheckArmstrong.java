import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number...");
		int n = sc.nextInt();

		boolean ans = checkArm(n);
		System.out.println(ans);
		}
	private static boolean checkArm(int n){
		int temp = n;
		int check = 0;
        int d;
        int p = (int) (Math.log10(n)+1);
		while(n > 0){
			d = n%10;
			check += Math.pow(d, p);
			n /= 10;
		}
		if(temp == check){
			return true;
		}
		else{
			return false;
		}
	}
}