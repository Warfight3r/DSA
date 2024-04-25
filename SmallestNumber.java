import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the numbers for the array: ");
        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }

        int min = numbers[0];

        for(int i = 0; i < n; i++){
            if(min > numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println("The smallest number is: " + min);
    }
}
