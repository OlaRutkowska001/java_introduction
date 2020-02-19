package myPackage;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayString {
    private static Object Arrays;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        int number = scanner.nextInt();

        System.out.println("Wielkość szachownicy wynosi " + number + " x " + number);


        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if ((i % 2 == 0 && j % 2 == 1) || (i % 2 == 1 && j % 2 == 0)) {
                    System.out.print("#");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }

}

/*
    public static void main(String[] args) {
        String[] arrays = {"raz", "dwa", "trzy"};
        String string = myPackage.toString(arrays);
        System.out.println(string);
    }




    {

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        int x = myNumbers[1][2];
        System.out.println(x);
    }

    {
        String[][] myArray;
        myArray = new String[][]{
                myArray[1][0] = "I",
                myArray[2][0] = "you",
                myArray[3][0] = "she",
                myArray[4][0] = "he",

        };
    }
}



*/