import java.util.ArrayList;
import java.util.List;

public class DisappearedNumber {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        // Cyclic sort
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // For local testing
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        DisappearedNumber dn = new DisappearedNumber();
        System.out.println(dn.findDisappearedNumbers(arr));
    }
}
