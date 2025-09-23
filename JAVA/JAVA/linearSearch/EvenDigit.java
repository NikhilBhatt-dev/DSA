public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = { 18, 22, 444, -56, -7765 };
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;

    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);

        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;

        }
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;

        }
        return count;
    }

}
