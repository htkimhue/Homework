package homeworklec4;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = keyboard.nextInt();
        System.out.print("Enter b: ");
        int b = keyboard.nextInt();
        System.out.print("Enter c: ");
        int c = keyboard.nextInt();

        if (a > b && a > c) {
            System.out.println("The largest number is " + a);
        } else if (b > a && b > c) {
            System.out.println("The largest number is " + b);
        } else {
            System.out.println("The largest number is " + c);
        }
    }

}
