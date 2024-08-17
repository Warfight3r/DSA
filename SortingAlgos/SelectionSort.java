public class SelectionSort {

    public int[] Sort(int[] arr){
        int min;
        int temp;
        for(int i = 0; i <= arr.length - 2; i++){
            min = i;
            for(int j = i; j <= arr.length - 1; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 3, 9, 10, 6, 5};
        SelectionSort obj = new SelectionSort();
        int[] sorted = obj.Sort(arr);

        for(int i = 0; i < sorted.length; i++){
        System.out.println(sorted[i]);
        }
    }
}
