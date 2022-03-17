package lab3;

import lab2.Point2D;

public class SDDoanThang {
    public static void main(String[] args) {
        Point2D A = new Point2D(2, 5);
        Point2D B = new Point2D(20,35);

        DoanThang AB = new DoanThang(A, B);
        AB.move(5,3);

        DoanThang CD = new DoanThang();
        CD.input();
        System.out.println("CD length: " + CD.dist());
        System.out.println("CD angle: " + Math.toDegrees(CD.getAngleBetweenPoints(CD.getD1(), CD.getD2())));
    }
}
