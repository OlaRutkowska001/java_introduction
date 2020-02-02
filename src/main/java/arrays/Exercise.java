package arrays;

public class Exercise {
    public static void main(String[] args) {

        int[] numbers = new int[]{23, 25, 35, 46, 48, 58, 69, 78, 80};
        //znajdź max i min wartość

        int max = Integer.MIN_VALUE;
        max = numbers[0];
        int min = Integer.MAX_VALUE;
        min = numbers[0];

        double mean = 0.0;

        //fori wpisz
        for (int i = 0; i < numbers.length; i++) {
            if (max <numbers[i]){
                max = numbers[i];

            if (min > numbers[i]){
                min = numbers[i];
            }
            //bierz min dodaje do num i zapisuje juz do min
            mean += numbers[i];
            }
            mean /= numbers.length;

        }
        System.out.println("MInimalna wartość to " + min + "a max to " + max);

        //==================
        for (int elem: numbers){
            if (elem % 3 == 0) {
                System.out.println(elem + " jest podzielny przez 3");
            }
        }


    }
}
