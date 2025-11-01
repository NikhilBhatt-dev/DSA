public class MissingNumber {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int total = (n * (n + 1)) / 2;
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            return total - sum;
        }

    public int findMissingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length && arr[i] <= arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;    
            }
        }
       for(int index = 0; index < arr.length; index++) {
           if(arr[index] != index ) {
               return index;
           }
       }
       return arr.length;
    }

     void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
