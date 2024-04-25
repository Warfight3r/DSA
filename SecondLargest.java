import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array... ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array...");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int secSmall = FindSecLargest(arr, n);
        System.out.println("The second smallest largest is: " + secSmall);      
    }
    private static int FindSecLargest(int[] arr, int n){
        if(n == 1){
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }    
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > secLargest && arr[i] != largest){
                secLargest = arr[i];
            }
        }
        return secLargest; 
    }
}
