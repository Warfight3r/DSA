import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array... ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array...");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int secSmall = FindSecSmall(arr, n);
        System.out.println("The second smallest number is: " + secSmall);      
    }
    private static int FindSecSmall(int[] arr, int n){
        if(n == 1){
            return -1;
        }

        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }    
        }
        for(int i = 0; i < n; i++){
            if(arr[i] < secSmallest && arr[i] != smallest){
                secSmallest = arr[i];
            }
        }
        return secSmallest; 
    }
}