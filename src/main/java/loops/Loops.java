package loops;

public class Loops {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i <= 20) {
            sum += i;
            i++;
        }
        System.out.println("Suma liczb od 1 do 20 to " + sum);


        i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println(i + " to liczba parzysta");
            }
            i++;
        } while (i <= 20);

//        i = 0;
//        while (i < ages.lenghth) {
//            i++;
//            do
//                if (i % 2 == 0 && i % 3 == 0) {
//                    System.out.println("Liczby te to " + i);
//                }
//

        }
    }
//}