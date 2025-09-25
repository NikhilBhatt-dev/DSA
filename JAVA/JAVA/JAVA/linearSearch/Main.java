
public class Main {
    public static void main(String[] args) {
      int[] nums = {1,2,4,5,7,2,79,34,88,889,9};
      int target =9;
      int ans = linearSearch(nums, target);
      System.out.println(ans);
        

    }
    //seaching arr
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0 ){
            return -1;
        }

        //run a for loop

        // for ( int i=0; i<arr.length; i++ ){
        //     //check for element at every index if it is  = target
        //     int element = arr[i];
        //     if ( element == target ) {
        //         return i;

        for (int element  : arr) {
            if (element == target) {
                return element;
            }
        }
            

        /// if no statement work
        return -1;
    }
}
