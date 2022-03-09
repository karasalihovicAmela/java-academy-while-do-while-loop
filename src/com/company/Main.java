package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite string: ");
        String string = scanner.nextLine();

        int count = string.length() - 1;
        while (count >= 0) {
            System.out.print(string.charAt(count));
            count--;
        }

        count = 0;
        int countBigLetter = 0;
        int countNumbers = 0;
        int countChar = 0;
        do {
            System.out.println("\nFormirajte password: ");
            String password = scanner.nextLine();
            if (password.length() >= 8) {
                count++;
            }

            for (char letter : password.toCharArray()){
                if (Character.isUpperCase(letter)) {
                    countBigLetter++;
                }
                if (Character.isDigit(letter)) {
                    countNumbers++;
                }
                if (!Character.isDigit(letter) && !Character.isLetter(letter)) {
                    countChar++;
                }
            }

            if (countBigLetter >= 1) {
                count++;
            }
            if (countNumbers >= 1) {
                count++;
            }
            if (countChar >= 1) {
                count++;
            }

            if (count >= 4) {
                System.out.println("Uspješno ste formirali password");
            }
        } while (!(count >= 4));

        int countEven = 0;
        int countOdd = 0;
        int number = -1;
        do {
            System.out.println("Unesite broj (0 prekida unos): ");
            number = scanner.nextInt();
            if (number % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }while (!(number == 0));

        System.out.println("Unijeli ste " + countEven + " parnih brojeva!");
        System.out.println("Unijeli ste " + countOdd + " neparnih brojeva!");

        scanner.nextLine();

        System.out.println("Unesite string: ");
        String newString = scanner.nextLine();

        String[] bigLetterWord = newString.split(" ");
        count = bigLetterWord.length - 1;
        countChar = 0;
        while (count >= 0) {
            String varString = bigLetterWord[countChar];
            System.out.print(Character.toUpperCase(varString.charAt(0)) + varString.substring(1) + " ");
            count--;
            countChar++;
        }
    }
}
