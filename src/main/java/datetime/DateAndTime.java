package datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateAndTime {

    public static void main(String[] args) {
        //typ objekt
        LocalDate currentTime = LocalDate.now();

        System.out.println("Aktualna data i czas " + currentTime);
        System.out.println("Dziś jest " + currentTime.getDayOfYear() + "dzień roku");

        String someData = "2010/03/30 20:12";
        String format = "yyyy/MM/dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDate someDateParesed = LocalDate.parse(someData, formatter);

        System.out.println("Jaksą data to " + someDateParesed);
        System.out.println("Czy teraz jest przed 2020/03/30? " + currentTime.isBefore(someDateParesed));

        Period period = Period.between( someDateParesed, currentTime);
        int yearsBetweenTwoDates = period.getYears();
        System.out.println("Różnica w latach " + yearsBetweenTwoDates);
    }
}
