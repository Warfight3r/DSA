import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array.... ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array... ");
        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }
        int max = numbers[0];
        for(int i = 0; i < n; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("The largest number is: " + max);
    }
}
