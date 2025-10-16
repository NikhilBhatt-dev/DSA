import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 56};
        insertion(arr);
        System.out.println("Insertion Sorted: " + Arrays.toString(arr));

        int[] arr2 = {-1, 2, -3, 4, -5};
        bubble(arr2);
        System.out.println("Bubble Sorted: " + Arrays.toString(arr2));

        int[] arr3 = {9, 3, 7, 1, 0};
        Selection(arr3);
        System.out.println("Selection Sorted: " + Arrays.toString(arr3));
    }

    static void insertion(int[] arr){
        for(int i = 1; i < arr.length; i++) {
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else{
                    break;
                }
            }
        }
    }

    static void Selection(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last); 
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void bubble(int[] arr) {
        boolean swapped;
        for(int i = 0; i < arr.length; i++) {
            swapped = false;
            for(int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break; 
            }
        }
    }
}
