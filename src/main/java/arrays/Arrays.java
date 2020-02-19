package arrays;

public class Arrays {
    //tablica strigów
    public static void main(String[] args) {
        int []ages = new int [3];
        ages[0] = 10;
        ages[1] = 30;
        ages[2] = 50;

        int [] height = new int[]{12, 53, 57, 83,92};

        System.out.println("Element 1 to " + ages[0]);
        System.out.println("Element 2 to " + ages[1]);
        System.out.println("Element 3 to " + ages[2]);

        System.out.println("Wielkość tablicy: " + ages.length);

        System.out.println("Użyjmy pętli");

        int i = 0;
        while (i < ages.length) {
            System.out.println("Element " + (i + 1) + " to " + ages[i]);
            i++;
        }
    }
}