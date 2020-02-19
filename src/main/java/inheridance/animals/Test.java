package inheridance.animals;

public class Test {

    public static void main(String[] args) {
// to działało bez abstract Animal:
        //Animal animal = new Animal("Zenek",2);
       // animal.voice();

        Lion simba = new Lion("Simba", 3);
        simba.voice();

        Horse tomek = new Horse("Tomek", 5, 9);
        tomek.ride(10);

        Animal animal2 = new Lion("Zdisiek", 6);
        Animal animal3 = new Horse ("Antek", 7, 9);

        //zwierze które ma cechy lwa
        //((Lion)animal2).voice();
        System.out.println("#############");
        Animal[]zoo = new Animal []{simba,tomek,animal2,animal3};
        for (Animal ani:zoo){
            ani.voice();
        }
    }

}
