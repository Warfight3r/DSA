import java.util.Arrays;
import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array... ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array... ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int freq = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]){
                    freq++;
                }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("Number: " + arr[i] + " Frequency: " + freq);
            freq = 0;
        }
    }
}
