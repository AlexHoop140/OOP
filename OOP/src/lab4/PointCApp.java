package lab4;

public class PointCApp {
    public static void main(String[] args) {
        PointC a = new PointC(5, 10, "white");
        a.move(5,10);    // point2D
        System.out.println("Show point A:");
        a.show();

        PointC b = new PointC();
        System.out.println("Enter point B:");
        b.input();
        b.move(10, 8);
        System.out.println("Show point B after moving (10,8):");
        b.show();
        b.setColor("yellow");
        System.out.println("Show point B after changing color:");
        b.show();
    }
}
