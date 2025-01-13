package homeworklec4;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = keyboard.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.print("no \n");
        }
    }

}
