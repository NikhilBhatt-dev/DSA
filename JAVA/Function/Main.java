package JAVA.Function;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // take 2 number add them it 10 time;
        Sum();


    }



     static void  Sum() {
        Scanner in = new Scanner(System.in);
        int sum, num1, num2;
        System.out.println("enter 1st number");
        num1 = in.nextInt();
        System.out.println("enter 2st number");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("sum of 2 num = " + sum);
            }

        }