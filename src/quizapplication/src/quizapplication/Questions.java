package quizapplication;
import java.util.Scanner;

public class Questions {

    static int life_line_count = 3;
    static int aud_poll = 1;
    static int ff = 1;
    static int phn_call = 1;
    public static int money = 0;
    public static Scanner sc = new Scanner(System.in);

    public boolean question1() {
        System.out.println("A. Which operator is used to compare two values in Java?\n"
                + "1. =\n"
                + "2. ==\n"
                + "3. !=\n"
                + "4. equals\n"
                + "5. Life Line\n"
                + "6.Exit");
        int choice = sc.nextInt();
        if (choice == 2) {
            money += 1000;
            return true;
        } else if (choice == 6) {
            System.out.println("Exiting the game... Thank you!");
            System.out.println("Total money: " + money);
            System.exit(0);
        } else if (choice == 5) {
            if (life_line_count == 0) {
                System.out.println("No Life Line is available"); 
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();
                if (choice == 2) {
                    money += 1000;
                    return true;
                }
            } else {
                System.out.println("Available Life Lines are: \n");
                if (aud_poll == 1) {
                    System.out.println("---> Audience Poll : " + aud_poll + "\n");
                }
                if (ff == 1) {
                    System.out.println("---> 50-50 : " + ff + "\n");
                }
                if (phn_call == 1) {
                    System.out.println("---> Phone call  : " + phn_call);
                }
                System.out.println("Enter your choice:");
                choice = sc.nextInt();
                if (choice == 1 && aud_poll == 1) {
                    aud_poll--;
                    life_line_count--;
                    System.out.println(
                          "1. =   ---> 30%\n"
                        + "2. ==  ---> 60%\n"
                        + "3. !=  ---> 45%\n"
                        + "4. equals ---> 15%\n");
                    choice = sc.nextInt();
                    if (choice == 2) {
                        money += 1000;
                        return true;
                    } else {
                        return false;
                    }
                }
                // Additional lifeline logic continues...
            }
        }
        return false;
    }

    // Additional questions (question2, question3, etc.) follow the same structure...
}
