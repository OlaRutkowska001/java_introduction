package myPackage;

import java.util.Scanner;

public class Chessboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        int number = scanner.nextInt();

        System.out.println("Wielkość szachownicy wynosi " + number + " x " + number);

        int i = 0;
        System.out.print("╔");
        for (i = 0; i  <=number-1; i++) {
            System.out.print("═");}

            System.out.print("╗");

            System.out.println();



            for (i = 0; i < number; i++) {
                System.out.print("║");

                for (int j = 0; j < number; j++) {
                    if ((i % 2 == 0 && j % 2 == 1) || (i % 2 == 1 && j % 2 == 0)) {
                        System.out.print("#");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.print("║");
                System.out.println();
            }
        System.out.print("╚");
        for (int j = 0; j <number ; j++) {
            System.out.print("═");

        }
        System.out.println("╝");

    }
}

