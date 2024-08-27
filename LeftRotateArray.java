import java.util.*;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        LeftRotateArray obj = new LeftRotateArray();

        obj.leftRotate(arr, 3);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public void leftRotate(int[] arr, int k){
        ArrayList<Integer> temp = new ArrayList<>();
        k = k%arr.length;
        // adding k elements from the left to the temp list
        for(int i = 0; i < k; i++){
            temp.add(arr[i]);
        }
        // Shifting the elements in the array
        for(int i = k; i < arr.length; i++){
            arr[i - k] = arr[i];
        }
        // putting elements back from temp
        for(int i = arr.length - k; i < arr.length; i++){
            arr[i] = temp.get(i - (arr.length - k));
        }
    }
}
