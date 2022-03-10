package com.company;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = 0;

        System.out.println("Odaberite opciju 1 ili 2:");
        option = scanner.nextInt();

        while (option < 0 || option > 2) {
            System.out.println("Unos nije ispravan. Odaberite ponovo [1 ili 2]:");
            option = scanner.nextInt();
        }

        System.out.println("Odabrali ste opciju [" + option + "]!");

    }

}
