package exercises;

public class Exercise1 {
    public static void main(String[] args) {
        User[] users = new User[]{
                new User("Tomasz", "Kowalski", 25),
                new User("Aleksandra", "Rutkowska", 23),
                new User("Krzysztof", "Nowak", 42),
                new User("Paweł", "Nowy", 15),
        };

        int longestNameLenght = 0;
        int indexName = 0;

        for (int i = 0; i < users.length; i++) {
            int nameLenght = users[i].getName().length();

            if (longestNameLenght < nameLenght) {
                longestNameLenght = nameLenght;
                indexName = i;

            }

        }
        System.out.println("Osoba o najdłuższym imieniu i nazwisku to " + users[indexName]);

        int longestLastnameLength = 0;
        int indexLastname = 0;

        for (int j = 0; j < users.length; j++) {
            int lastname = users[j].getLastname().length();

            if (longestLastnameLength < lastname) {
                longestLastnameLength = lastname;
                indexLastname = j;

            }
        }
        System.out.println("Osoba o najdłuższym nazwisku to " + users[indexLastname]);
        {
            int wynik;
            int i = indexName;
            int j = indexLastname;
            wynik = users[i].getName().length() + users[j].getLastname().length();

            System.out.println("Suma długości znaków imienia i nazwiska to " + wynik);
        }


    }


}
