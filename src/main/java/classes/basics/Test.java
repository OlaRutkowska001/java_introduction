package classes.basics;

public class Test {
    public static void main(String[] args) {
        String nazwisko ="Kowalski";

         User adam = new User( "Adam", nazwisko , 18);
//        adam.name = "Adam";
//        adam.lastneme = "Kowalski";
//        adam.age = 36;
        //pole obiektu apisujemy po .
        System.out.println(adam.name);
        System.out.println(adam.lastneme);
        System.out.println(adam.age);

        User jozek = new User("Józek","Nowak",45);
        jozek.intruduce();

        User cloneJozek = new User(jozek);
        cloneJozek.intruduce();
        cloneJozek.name = "Robert";
        System.out.println("Po zmianie imienia: ");
        cloneJozek.intruduce();

        System.out.println("Jozek: " + jozek + "Robert: " + cloneJozek);

//        jozek.name = "Józek";
//        jozek.lastneme = "Nowak";
//        jozek.age = 42;
//        //wywołanie onstruktora
//        jozek.intruduce();
        //nazwa konstrura musi być taka sama jak klasy
        System.out.println("#### TEST WIEKU ####");
        System.out.println("Czy Adam jest dorosły? " + adam.isAdult());
        System.out.println("Czy Józek jest dorosły? " + jozek.isAdult());
        System.out.println("Czy Robert jest dorosły? " + cloneJozek.isAdult());

    }
}
