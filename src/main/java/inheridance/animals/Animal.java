package inheridance.animals;
//objekt to klasa bazowa - najwyższa
public abstract class Animal{//przed nawiasem extends Object, ale go nie widać

    //albo zamiast protected piszę:
   // [ public void roar (){
      //  System.out.println("Lion" + getname() + "roar");]

    //garety i serety stisuję gdy prvate


    //protected żby klasa lion mogła dzidziczyć name
    protected String name;
    private int age;

    //alt inser --> constructor:
    public Animal(String name, int age) {
        //super wywołuje klasę bazową (woła rodica)
        super();
        this.name = name;
        this.age = age;
    }

    public abstract void voice();

    //dla nieabstakcyjne to było:{
       // System.out.println("Animal " + name + " give voice!");
  //  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = age;
    }
}
