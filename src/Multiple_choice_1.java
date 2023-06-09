import java.util.Scanner;

public class Multiple_choice_1 {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("cyberpunk", "2077");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("The name of the first computer virus is...?");
        System.out.println(1 + ". Covid-19");
        System.out.println(2 + ". Brain Boot Sector Virus");
        System.out.println(3 + ". Code Red");
        System.out.println(4 + ". I LOVEYOU");
        int answer;
        for (;;) {
            Scanner check = new Scanner(System.in);
            answer = check.nextInt();
            if (answer > 4) {
                System.out.println("Don't be so rude(");
            } else if (answer != 2) {
                System.out.println("Please, try again.");
            } else {
                break;
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
