public class Split {
    public static void main(String[] args) {
        // Example usage
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        Split s = new Split();
        System.out.println(s.splitArray(nums, m));  // Expected output: 18
    }

    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // max element
            end += nums[i];                   // sum of all elements
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // Start a new subarray
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;  // or start, since start == end here
    }
}
 