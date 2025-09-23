public class InfinityArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 15, 16, 19, 22, 24, 25, 170, 290, 340, 560, 670};
        int target = 15;
        System.out.println(ans(arr, target));  // Find the target in the infinite-like array
    }

    static int ans(int[] arr, int target) {
        // First, find the range where the target might be 2
        int start = 0;
        int end = 1;

        // Condition for the target to lie within the range
        while (target > arr[end]) {
            int temp = end + 1;  // New start for the next "box"
            end = end + (end - start + 1) * 2;  // Double the box size
            start = temp;
        }

        // Now we have a valid range [start, end], use Binary Search to find the target
        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;  // Target found at index mid
            }
        }
        return -1;  // Target not found
    }
}
