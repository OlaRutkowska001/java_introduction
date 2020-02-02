package conditions;

import java.util.Scanner;

public class ConditionInstructions {
    public static void main(String[] args) {
        //klasa typ = konstruktor (strumień wejściowy)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cześć, jak masz na imię?");
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + "!");

        if (name.endsWith("a")){
            System.out.println("Jesteś kobietą.");
        } else {
            System.out.println("Zatem jesteś mężczyzną.");
        }

        System.out.println("Ile masz lat?");
        int age = scanner.nextInt();
        String ending = "lat";
        if (age < 10 || age > 20)
        switch (age % 10) {
            case 2:
            case 3:
            case 4:
                    ending = "lata";
                    break;
                default:
                    ending = "lat";

        }
        System.out.println(("Fajnie, ze masz " + age + " " + ending + "!"));

       if (age >= 21) {
           System.out.println("Jesteś osobą pełnoletnią w USA");
       } else if (age>= 18){
           System.out.println("Jesteś osobą pełnoletnią w Polsce");
           System.out.println("Jesteś niepełnoletni w USA");
       }

       }
    }

