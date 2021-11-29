package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int number;
        int count=1;
        int score = 100;

        double a = Math.random() * (max - min + 1) + min;
        int b = (int)(Math.random()*(max-min+1)+min);

        System.out.println("Try to guess the number. It's between " + min + " and " + max + ".");

        do {
            number = Integer.parseInt(scanner.nextLine());
            if(number > b ) {
                System.out.println("Too high. Try again. You`ve made " + count +" attempts.");
                count++;
                score-=10;
            } else if (number<b) {
                System.out.println("Too low. Try again. You`ve made " + count +" attempts.");
                count++;
                score -= 10;
            } else {
                System.out.println("Congratulations! You guess the number after " + count + ". You win " + score + " points.");
            }

        } while (number!=b && score>0);
        System.out.println("Game over. Try again. Wish you good luck!");

    }
}
/*
Напишете програма, която си намисля едно число. Може да прочетете в Интернет как
Java може да генерира случайна стойност. Потребителят трябва да може да се опитва
да познае числото, а програмата трябва да насочва потребителя със съобщения
от вида Too high, try again, Too low, try again. Програмата приключва своето изпълнение,
когато потребителят успее да познае числото.
 */
