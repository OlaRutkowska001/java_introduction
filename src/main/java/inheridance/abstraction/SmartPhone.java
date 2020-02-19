package inheridance.abstraction;

public class SmartPhone implements Computer, Phone {

    @Override
    public void sendEmail(String address, String content) {
        System.out.println("Sending email " + content + " to address " + address + " using SmartPhone");
    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing Internet using SmartPhone");
    }

    @Override
    public void sendSMS(int number, String countent) {
        System.out.println("Sending sms to " + number + " with content " + " using SmartPhone");

    }

    @Override
    public void makeCall(int number) {
        System.out.println("Calling " + number + " using SmartPhone");
    }

    @Override
    public void playSnacke(int numberSnacke) {

    }
}