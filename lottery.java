package baitap;

import java.util.Scanner;

public class lottery {
    public static void main(String[] args) {
        int lotery = (int) Math.round(Math.random() * 100);
        int a = lotery / 10;
        int b = lotery % 10;
        int guessDigit1, guessDigit2;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input your first number: ");
        guessDigit1 = sc.nextInt();
        System.out.printf("Input your second number: ");
        guessDigit2 = sc.nextInt();
        if (guessDigit1 == a && guessDigit2 == b) {
            System.out.printf("Lucky, you get $10000");
        } else if (guessDigit1 == b && guessDigit2 == a) {
            System.out.println("Lucky, you get $3000");
        } else if (guessDigit1 == a || guessDigit2 == b || guessDigit1 == b || guessDigit2 == a) {
            System.out.println("Lucky, you get $1000");
        }
        else {
            System.out.println("Unlucky");
        }

    }
}
