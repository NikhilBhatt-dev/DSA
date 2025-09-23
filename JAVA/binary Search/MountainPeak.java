public class MountainPeak {
    public static void main(String[] args) {
         int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in decresing part of array;
                // this may be ans but look at left
                // this is why end != mid -1;
                end = mid;
            } else {
                // you are in acesnding part of array
                start = mid + 1; // because we know that [mid+1] > [mid]

            }
        }

    public int peakIndexMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in decresing part of array;
                // this may be ans but look at left
                // this is why end != mid -1;
                end = mid;
            } else {
                // you are in acesnding part of array
                start = mid + 1; // because we know that [mid+1] > [mid]

            }
        }
        // In the end, start == end and both point to the largest number because of the
        // two checks above.
        // Start and end are always trying to find the maximum element in the two
        // checks.
        // Hence, when they are pointing to just one element, that is the max one,
        // because that’s what the checks ensure.
        // More elaboration: At every point in time, for the start and end pointers,
        // they have the best possible answer up to that moment.
        // And if we say that only one item remains, then because of the above logic,
        // that is the best possible answer.
            return start; // or return end as both are equal;
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
}
