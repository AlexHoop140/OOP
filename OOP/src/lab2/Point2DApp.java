package lab2;

import java.util.Scanner;

public class Point2DApp {
    public static void main(String args[]){
        Point2D a = new Point2D(3,4);
        Point2D b = new Point2D();
        Point2D c = new Point2D(5);
        System.out.println("a: "); a.show();
        System.out.println("Enter print b: ");
        b.input();
        b.show();
        b.move(5,3); b.show();
        System.out.println("bO = " + b.dist());
        System.out.println("ba = " + b.dist(a));
        Point2D d = new Point2D(-b.getX(), -b.getY()); // vi phạm tính bao gói nên phải truy cập thông qua getX()
        //Array of Objects
        Point2D[] list; //list->null
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = sc.nextInt();
        list = new Point2D[n]; // Tạo ra n tham chiếu, mỗi tham chiếu trỏ null kh phải n ô nhớ
        for(int i = 0; i<n; i++)
            list[i] = new Point2D();
        for(int i = 0; i<n; i++)
            list[i].input();
        for(Point2D p: list)
            p.show();
    }

}
