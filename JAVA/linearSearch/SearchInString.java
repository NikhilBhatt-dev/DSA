import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "nikhil";
        char target = 'n';

        
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search2(name, target));
    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }
}
