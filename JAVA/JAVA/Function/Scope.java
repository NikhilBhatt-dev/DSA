package JAVA.Function;

public class Scope {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;

        {
            //block scope
              a = 22;

             // value  initialised in this block , will remain in block

        }
    }
    static void random( int marks){
        int num = 55;

        System.out.println(num);
    }
}


