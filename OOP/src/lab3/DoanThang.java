package lab3;

import lab2.Point2D;

public class DoanThang {
    private Point2D d1;
    private Point2D d2;

    public DoanThang(){
        d1 = new Point2D();
        d2 = new Point2D();
    }

    public DoanThang(Point2D point1, Point2D point2){
        d1 = new Point2D(point1.getX(), point1.getY());
        d2 = new Point2D(point1.getX(), point2.getY());
    }

    public DoanThang(int ax, int ay, int bx, int by){
        d1 = new Point2D(ax, ay);
        d2 = new Point2D(bx, by);
    }

    public void input() {
        System.out.println("Nhap gia tri cho 2 dau mut");
        d1.input();
        d2.input();
    }

    public void show(){
        System.out.println("Gia tri 2 dau mut doan thang");
        d1.show();
        d2.show();
    }

    public void move(int dx, int dy){
        d1.move(dx, dy);
        d2.move(dx, dy);
    }

    public float dist() {
        return d1.dist(d2);
    }

    public double getAngleBetweenPoints(Point2D a, Point2D b){
        int deltaX = (b.getX()) - (a.getX());
        int deltaY = b.getY() - a.getY();

        return Math.atan2(deltaY, deltaX);
    }

    public Point2D getD1(){
        return d1;
    }

    public Point2D getD2(){
        return d2;
    }
}
