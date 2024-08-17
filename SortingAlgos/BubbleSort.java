public class BubbleSort {
    public static int[] Sort(int[] arr){
        int temp;
        for(int i = arr.length-1; i >= 1; i--){
            int didSwap = 0;
            for(int j = 0; j <= i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                    didSwap = 1;
                }
            }
            System.out.println("runs");
            if(didSwap == 0){
                break;
            }
            
        }
        return arr;
    }

    public static void main(String[] args) {
        // int[] arr = {10, 9, 23, 12, 5, 29, 2, 10};
        int[] arr = {1, 2, 3, 4, 5, 6};
        Sort(arr);

        for(int i = 0; i < arr.length; i++){
    
            System.out.println(arr[i]);
        }
    }
}
