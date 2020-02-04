package arrays;

public class Exercise2 {
    public static void main(String[] args) {
        String [] names = new String[]{
                //new String(original: "Ala"
                "Ala",
                "Ola",
                "Andrzej",
                "Wiercisław",
                "Wendzisław",
                "Petronela",
                "Bronisław"};


      //  1 Wypisz imiona żeńskie
     //   2 imiona nie dłuższe niż 3 znaki
     //   3 kończące się na sław lub mir
     //   4 znajdź najdłuższe imię



//        for (String name: names){
//           if (name.endsWith("a"));{
//                System.out.println("Imiona żeńskie to: " + names);
//            } else {
//                System.out.println("Brak imion żeńskich.");

//wolna linia
//String newLine = System.lineSeparator();
//String multilineString = "Ala ma kota" + newLine + "A kot ma mleko" + newLine +;
//        System.out.println(multilineString);

        int longestNameLenght = 0;
        for (String name: names) {
            if(longestNameLenght < name.length()){
                longestNameLenght = name.length();
            }
        }
        for (String name: names){
            if(longestNameLenght == name.length()){
                System.out.println(name);
            }
        }
        int i =0;
        for(; i < names.length ;){
            System.out.println(names[i]);
        }
        }
//         for(int i =0; i < names.length; i++){
//            if (names[i].ends.With("mir")){
//                break;
//            }
  //      System.out.println(names[i]);

   }

