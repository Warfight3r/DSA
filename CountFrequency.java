import java.util.Arrays;
import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array... ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter the elements of the array... ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int count;
        for(int i = 0; i < n; i++){
            if(visited[i] == true){
                continue;
            }
            count = 1;
            visited[i] = true;
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}