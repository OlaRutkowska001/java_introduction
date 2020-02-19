package exercises;

public class User {
    private String name;
    private String lastname;
    private int age;


    public User(String name, String lastneme, int age){
        this.name = name;
        this.lastname = lastneme;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}

