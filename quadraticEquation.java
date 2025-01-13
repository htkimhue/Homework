package homeworklec4;

import java.util.Scanner;

public class quadraticEquation {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = keyboard.nextInt();
        System.out.print("Enter b: ");
        double b = keyboard.nextInt();
        System.out.print("Enter c: ");
        double c = keyboard.nextInt();
        double delta = (double) (Math.pow(b, 2) - 4 * a * c);
        if (delta > 0) {
            System.out.println("Phuong trinh co 2 nghiem: ");
            System.out.println("x1= " + ((-b + Math.sqrt((double) delta)) / (2 * a)));
            System.out.println("x2= " + ((-b - Math.sqrt((double) delta)) / (2 * a)));
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep: ");
            System.out.println("x= " + (-b / (2 * a)));
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }

}
