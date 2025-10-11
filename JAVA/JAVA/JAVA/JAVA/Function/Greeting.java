package JAVA.Function;

public class Greeting {
    public static void main(String[] args) {
        String personalised = myGreet("Nikhil");
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message = "hello " + name;
        return message;
    }

    static String greet() {
        String greeting = "how are you";
        return greeting;
    }
}
