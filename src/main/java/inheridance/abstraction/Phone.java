package inheridance.abstraction;

public interface Phone {

    //domyślnie abstrakycna i domyślna
    void sendSMS(int number, String countent);
    void makeCall(int number);
    void playSnacke(int numberSnacke);
}
