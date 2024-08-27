import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,3};

        
    }
    public int removeDuplicates(int[] nums) {
        Set<Integer> numsSet = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numsSet.add(nums[i]);
        }

        int index = 0;
        Iterator<Integer> numsIterator = numsSet.iterator();

        while (numsIterator.hasNext()) {
            nums[index] = numsIterator.next();
            index++;
        }
        return index;
    }
}
