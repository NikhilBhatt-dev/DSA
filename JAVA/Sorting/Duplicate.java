public class Duplicate {

    public int findDuplicate(int[] arr) {
        int i = 0;

        
        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                if (i != correct) {
                      
                    return arr[i];
                }
                i++;
            }
        }
        return -1; 
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        Duplicate d = new Duplicate();
        System.out.println("Duplicate number is: " + d.findDuplicate(arr));
    }
}
