package inheridance.abstraction;

public class PC implements Computer {
    @Override
    public void sendEmail(String adres, String content) {
        System.out.println("Sanding email " + content + "to adress" + adres);

    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing Internet using PC");
    }

}
