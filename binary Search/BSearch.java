import java.util.Arrays;

public class BSearch{
    public static void main(String[] args) {
        int[] arr = {-2, -3, 5, 7, 2, 5, 8, 11, 33, 6, 643};
        int target = 2;

        // Sort the array before performing binary search
        Arrays.sort(arr);

        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
