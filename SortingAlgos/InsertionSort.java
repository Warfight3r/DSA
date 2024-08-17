public class InsertionSort {
    public static void Sort(int[] arr){
        for(int i = 0; i <= arr.length - 1; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            } 
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 9, 23, 12, 5, 29, 2, 10};

        Sort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
