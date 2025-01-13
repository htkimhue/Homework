package homeworklec4;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = keyboard.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is an even number");
        } else {
            System.out.println(n + " is an odd number");
        }
    }

}
