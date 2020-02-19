package inheridance.animals;

public class Horse extends Animal{

    private int rating;
    public Horse(String name, int age , int rating)  {
        super(name, age);
        this.rating = rating;
    }
    //podkreśla się gdy jest błąd niżej
    @Override
    public void voice(){
        System.out.println(("Horse " + getName() + " says: ihaha"));
    }

    public void ride(int speed){
        System.out.println("Horse " + getName() + " with rating" + "rides with " + speed + " km/h");
    }



}
