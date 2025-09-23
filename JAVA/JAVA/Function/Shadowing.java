package JAVA.Function;

public class Shadowing {
     static int  x =1; // this is a shadow
    public static void main(String[] args) {
        System.out.println(x);
        int x=2;
        System.out.println(x);
        fun();
    }
    static  void fun(){
        System.out.println(x);
    }
}
