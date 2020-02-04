package classes.basics;

public class User {
    public String name;
    String lastneme;
    int age;
//można stworzyć stałą wartość w klasie, ktora będzie dla wszystich używana
    static final int MIN_AGE = 18;

    public User(String name, String lastneme, int age) {
        //muszę rozróżnić name i dlatego this. Już ma pzypisane typy u góry
        this.name = name;
        this.lastneme = lastneme;
        this.age = age;
    }
    //tworzę kopię brata bliźniaka józka
    User(User other){
        name = other.name;
        lastneme = other.lastneme;
        age = other.age;

    }

    void intruduce (){
        //ciało metody, która zawiera adres:
        //String name = "Ania ale ja chcę inne więc poniżej stosuję this
        System.out.println("Imię: " + this.name + "Nazwisko: " + this.lastneme + "Wiek" + this.age);
    }
    //z () to metoda, a bez to zmienne
    boolean isAdult() {
        boolean isAdult = age >= MIN_AGE;
        return isAdult;
    }
}
