package JAVA.Function;

public class Swap {
    public static void main(String[] args) {
        int a =22;
        int b =11;

        swap(a,b);

        System.out.printf( a + " "  + b );

        String  name = "JAVA";
        changeName(name);
        System.out.println(name);

    }
    static  void changeName(String naam){
        naam = " react";
        System.out.println(naam);

    }
    static void  swap(int num1, int num2){
        int temp =num1;
        num1 = num2;
        num2 = temp;


        // this change will only be valid in this function scope only.

    }
}

