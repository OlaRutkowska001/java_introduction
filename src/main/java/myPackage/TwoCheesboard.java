package myPackage;

import java.util.Scanner;

public class TwoCheesboard {
    public class Chessboard {
        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę ");
            int number = scanner.nextInt();

            System.out.println("Wielkość szachownicy wynosi " + number + " x " + number);
            int i = 0;
            System.out.println(number + "╔");

            System.out.println("═");


            for (i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if ((i % 2 == 0 && j % 2 == 1) || (i % 2 == 1 && j % 2 == 0)) {
                        System.out.print("#");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }

    }
}


