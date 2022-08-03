package lab2;
import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {
        Date c = new Date(24, 05, 2002);
        c.show();
        Date d = new Date();
        System.out.println("----> Enter day <----");
        d.input();
        d.show();
        System.out.println("After 80 days: ");
        d = d.add(70);
        d.show();
    }
}
