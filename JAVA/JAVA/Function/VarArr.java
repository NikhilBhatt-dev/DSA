package JAVA.Function;

import java.util.Arrays;

public class VarArr {
    public static void main(String[] args) {

        fun(2,3,7,4,6,5);

    }
    static  void  fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
