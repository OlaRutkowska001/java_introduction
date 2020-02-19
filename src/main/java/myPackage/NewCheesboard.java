package myPackage;

import java.util.Scanner;

public class NewCheesboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość wierszy ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 4; j++) {

                if((i%2==0 && j%2 == 1) || (i%2==1 && j%2==0)) {
                    System.out.print("##");
                }else {
                    System.out.print("**");


                }
            }
                    System.out.println();
                }

            }

        }



