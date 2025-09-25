public class FindMin {
        public static void main(String[] args) {
        int[] arr = {-2, -3, 5, 7, 2, 5, 8, 1,-110,11, 33, 6, 643};
        System.out.println(min(arr));
        }
        static int min(int[] arr) {
            int ans  =  arr[0];
            for (int i = 1; i <arr.length; i++ ){
                if (arr[i] < ans) {
                    ans = arr[i];
                    
                }                
            }
            return ans;

        }
}
