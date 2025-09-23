import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {44, 22, 55},
            {12, 45}
        };

        int[] ans = maxPosition(arr);
        System.out.println(Arrays.toString(ans));
    }

    // Find position of the max element using for-each loop
    static int[] maxPosition(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int[] pos = {-1, -1};

        int rowIndex = 0;
        for (int[] row : arr) {
            int colIndex = 0;
            for (int val : row) {
                if (val > max) {
                    max = val;
                    pos[0] = rowIndex;
                    pos[1] = colIndex;
                }
                colIndex++;
            }
            rowIndex++;
        }

        return pos;
    }
}
