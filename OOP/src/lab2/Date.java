package lab2;
import java.util.Scanner;

public class Date {

    private int d, m, y;
    public Date(){
        d = 1;
        m = 1;
        y = 2022;
    }

    public Date(int d1, int m1, int y1){
        d = d1;
        m = m1;
        y = y1;
    }

    public void show(){
        System.out.println(d + "/" + m + "/" + y);
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter day: ");
            d = sc.nextInt();
            System.out.println("Enter month: ");
            m = sc.nextInt();
            System.out.println("Enter year: ");
            y = sc.nextInt();
        }while(!isValid());
    }

    public boolean isValid(){
        int[] max = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)   max[2] = 29;
        return y > 0 && m > 0 && m < 13 && d > 0 && d <= max[m];
    }

    public Date NextDay(){
        Date c = new Date(d, m ,y);
        c.d++;
        if(!c.isValid()){
            c.d = 1;
            c.m++;
            if (!c.isValid()){
                c.m = 1;
                c.y++;
            }
        }
        return c;
    }

    public Date add(int n){
        Date c = new Date(d, m, y);
        for (int i=0 ; i<n ; i++){
            c = c.NextDay();
        }
        return c;
    }

}
