package inheridance.animals;

public class Lion extends Animal{

    //konstruktor wywołują alt enter
    public Lion(String name, int age) {
        super(name, age);
    }
    //przesłąnia metode w klasie
    @Override

    public void voice(){

        //dzidziczę vois po klasie animal
        System.out.println("Lion " + name + " roar!" );
    }

}
