package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite slova po želji (max 10)." +
                "\nKoristite slovo 'q' za izlaz. ");
        char[] slova = new char[10];
        char slovo;
        int brojac = 0;
        do {
            System.out.println("Unesite slovo [" + (brojac + 1) + "]:");
            slovo = scanner.next().charAt(0);
            slova[brojac] = slovo;
            brojac++;
        } while (slovo != 'q' && brojac < 10);
        System.out.println("Slova koja ste unijeli su: " + Arrays.toString(slova));

    }
}
