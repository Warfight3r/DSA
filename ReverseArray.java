import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements... ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array... ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before reversing: " + Arrays.toString(arr));
        int j = n-1;
        for(int i = 0; i < n; i++){
            if(i < j-i){
                int temp = arr[i];
                arr[i] = arr[j-i];
                arr[j-i] = temp;    
            }
        }
        System.out.println("Array after reversing: " + Arrays.toString(arr));
   } 
}