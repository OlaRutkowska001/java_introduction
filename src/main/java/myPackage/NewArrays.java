package myPackage;

import java.lang.reflect.Array;
import java.sql.SQLOutput;

public class NewArrays<name> {
    public static void main(String[] args) {

        String[] name = new String[3];
        name[0] = "Kowal";
        name[1] = "Brat";
        name[2] = "Szwagier";

        String[] forname;
        forname = new String[3];
        forname[0] = "Iga";
        forname[1] = "Adam";
        forname[2] = "Ewa";

        {
            for (
                    int i = 0;
                    i <= 2; i++) {
                System.out.print(name[i] + ' ');
                System.out.print(forname[i]);
                System.out.println();
            }

            for (
                    int i = 0;
                    i <= 2; i++) {
                System.out.println(name[i].length());
                System.out.println((forname[i].length()));
            }
// dotąd długości są
            for (int j = 0; j < 3; j++) {


                int numer = name[j].length();
                int number = forname[j].length();
                {
                    int all = 0;
                    all = number + numer;
                    System.out.println("Długość imienia i nazwiska " + (j + 1) + " wynosi " + all);
                }


                int[] all = new int[3];
                all[0] = number + numer;
                all[1] = number + numer;
                all[2] = number + numer;

                if ((all[0] > all[2]) && (all[0] > all[1])) {
                    System.out.println("Maksymalna długość to; " + all[0]);
                } else {

                    if ((all[1] > all[2]) && (all[1] >= all[0])) {
                        System.out.println("Maksymalna długość to; " + all[1]);
                    } else {
                        System.out.println("Maksymalna długość to; " + all[2]);
                    }
                    System.out.println(Math.max(all[1],all[2]));
/*
                    int max = all[0];
                    int k = 0;
                    for (int l = 0; l < all[k]; l++) {
                        if (all[k] < max)
                            max = all[k];
                    }
                    System.out.println("Maksymalna długość to: " + max);

/*

                    Math.max(int all[j], all[j+1])
                    if (number + numer > all[j]) {
                            System.out.println("Maksymalna długość to " + name[j+1].length() + forname[j+1].length());
                        } else {
                            System.out.println(("Maksymalna długość to " + all[j]));
                        }
                    }
                }*/
                }
            }

        }
    }
}


