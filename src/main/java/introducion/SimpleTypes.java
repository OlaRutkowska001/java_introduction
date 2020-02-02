package introducion;

public class SimpleTypes {

    public static void main(String[] args) {

        int age;
        age = 0;
        System.out.println("Wiek to " + age);

        long lottoReward = 32_000_000L;
        System.out.println("Wygrana w lotto to " + lottoReward);

        short dayOfMonth = 29;
        dayOfMonth = 23;
        System.out.println("Dzień miesiąca to " + dayOfMonth);

        final float PI = 3.14F;
        //FINALNA wartość pozostaje stała
        System.out.println("Liczba PI to " + PI);

        double distans = 200D;
        System.out.println("Dystans wynosi " + distans);

        boolean isPaid = false;
        String isPaidTxt = isPaid ? "tak" : "nie";
        System.out.println("Czy zapłacono rachunek? " + isPaidTxt);
        isPaid = true;
        isPaidTxt = isPaid ? "tak" : "nie";
        System.out.println("A może teraz zapłącono? " + isPaidTxt);

        int index = 1;
        String name = "Ola";
        //jet to obiekt typu string
        char aLetter = name.charAt(2);

        System.out.println((index +1) + " literka w imieniu " + name + " to " + aLetter);

        String prefix = "Ol";
        boolean isStartingWith = name.startsWith(prefix);
        System.out.println("Czy imię " + name + " zaczyna się od " + prefix + "? : " + isStartingWith);
    }

}
