import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 5, 7},
            {4, 6, 7, 8},
            {2, 3, 5, 67},
            {33, 44, 66, 77}
        };
        int target = 33;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));  
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};  
                }
            }
        }
        return new int[]{-1, -1};  
    }
}
