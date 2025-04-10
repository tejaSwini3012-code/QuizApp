package quizapplication;
import java.util.Scanner;

public class quiz {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);  // ✅ Create Scanner once in main()
        
        rules(sc);  // ✅ Pass Scanner to rules() method

        Questions q = new Questions();
        try {
            boolean res = q.question1();
            if (res) {
                System.out.println("Correct answer! You have won: " + q.money);
                res = q.question2();
                if (res) {
                    System.out.println("Correct answer! You have won: " + q.money);
                    res = q.question3();
                    if (res) {
                        System.out.println("Correct answer! You have won: " + q.money);
                        res = q.question4();
                        if (res) {
                            System.out.println("Correct answer! You have won: " + q.money);
                            res = q.question5();
                            if (res) {
                                System.out.println("Correct answer! You have won: " + q.money);
                                System.out.println("Game is over ");
                            } else {
                                System.out.println("Game over! You answered wrong.");
                            }
                        } else {
                            System.out.println("Game over! You answered wrong.");
                        }
                    } else {
                        System.out.println("Game over! You answered wrong.");
                    }
                } else {
                    System.out.println("Game over! You answered wrong.");
                }
            } else {
                System.out.println("Game over! You answered wrong.");
            }
            System.out.println("Total money: " + q.money);
        } catch(Exception e) {
            e.printStackTrace();
        }
        sc.close();  // ✅ Close Scanner at the end
    }

    public static void rules(Scanner sc) { 
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("Username: ");
        String name = sc.next();
        System.out.println("Password: ");
        String pass = sc.next();
        System.out.println("Phone number: ");
        int p = sc.nextInt();
        System.out.println("Rules:");
        System.out.println("1. There are 5 questions, each with 4 options.");
        System.out.println("2. You have 3 lifelines: Audience Poll, 50-50, Phone Call.");
        System.out.println("3. Each lifeline can be used only once.");
        System.out.println("4. You can quit anytime and take home your winnings.");
        System.out.println("5. A wrong answer will end the game.");
        System.out.println("Do you accept the rules? (yes/no)");
        
        String option = sc.next();
        if (option.equalsIgnoreCase("no")) {  // ✅ Fixed: Use equalsIgnoreCase()
            System.out.println("Exiting the game... Thank you!");
            System.exit(0);
        }
    }
}
