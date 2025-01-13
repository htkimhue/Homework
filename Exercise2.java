package homeworklec4;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Math scores : ");
        double a = keyboard.nextDouble();
        System.out.print("Enter Physics scores: ");
        double b = keyboard.nextDouble();
        System.out.print("Enter Chemistry scores: ");
        double c = keyboard.nextDouble();
        double score = (a + b + c) / 3;
        if (score >= 8) {
            System.out.println("Excellent");
        } else if (score >= 6.5 && score < 8) {
            System.out.println("Good");
        } else if (score >= 5 && score < 6.5) {
            System.out.println("Average");
        } else {
            System.out.println("Poor");
        }
    }

}
