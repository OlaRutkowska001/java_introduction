package introducion;

public class Strings {
    public static void main(String[] args) {
        //tworzę referencje
        String text = new String("Ala ma kota");
        // to samo mozen zapisać też Strimgg text = "Ala ma kota"
        String text2 = "Ala ma kota";

        System.out.println("Text1: " + text + ", text2: " + text2);
        System.out.println("Czy obie zmienne to to samo? " + text.equals(text2));

        //1. Utwórz String "Ala ma kota" używając StringBuildera i metody apped.
        StringBuilder builder = new StringBuilder();
        builder.append("Ala ");
        builder.append("ma ");
        builder.append("kota");
        String resultaText = builder.toString();
        System.out.println("Napis utworzony przez builder: " + builder.toString());

        //2.Znajdź znak

        char litera5 = text.charAt(4);
        System.out.println("Piątą literą jest " + litera5);

        //3. Spr czy napis zaczyna się od słowa Ala
        String prefix = "Ala";
        boolean isStartingWith = text.startsWith(prefix);
        System.out.println("Czy zdanie zaczyna się od Ala? " + isStartingWith);
        System.out.println();
        ;

        boolean isEndingWith = text.startsWith(prefix);
        System.out.println("Czy zdanie kończy się na kota? " + isEndingWith);

        //4. Spr. długość napisu "Litwo! Ojczyzno moja!"
        String tekst = "Litwo!OjczyznoMoja!";
        System.out.println("Zdanie ma długość " + tekst.length() + " liter.");


        //5. Na którym miejscu znajduje się znak d w napicie 'abcdefgh"
        String abcd = "abcdefgh";
        System.out.println("Znak d znajduje się na " + abcd.indexOf("d") + " miejscu.");

        //6.
        String zdania = "Ala ma kota. Kot ma mleko.";
        System.out.println(zdania.substring(7,12));

        //7.
        String ala = "Ala ma kota";
        System.out.println("Ala ma kota zawiera słowo Ala? " + ala.contains(prefix));

        //8.
        String zdanie = "ALA MA KOTA";
        System.out.println("Czy zdania są takie same? " + text.equals(zdanie));


    }
    }
