import java.util.Scanner;

public class CheckPrimeInRange{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the min and max range...");
        int min = sc.nextInt();
        int max = sc.nextInt();

        for(int i = min; i <= max; i++){
            int count = 0;
            for(int j = 1; j <= Math.sqrt(i); j++){
                if(i%j == 0){
                    count++;
                    if(i/j != j){
                        count++;
                    }
                }
            }
            if(count == 2){
                System.out.println(i);
            }
        }
    }
}