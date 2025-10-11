public class minElement {
    public static void main(String[] args) {
        int[] arr = {18,22,33,55,77,99,0,-1};
        System.out.println( min((arr)));
        
    }

    //asume arr.larget != 0
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i =1; i< arr.length; i++) {
            if(arr[i] < ans) {
                ans = arr[i];
            }
         }
         return ans;
    }
    
}
