package lab2;

import java.util.Scanner;

public class Point2D {
    private int x, y;

    public Point2D(){
        x = 0;
        y = 0;
    }

    public Point2D(int x1, int y1){
        x = x1;
        y = y1;
    }

    public Point2D(Point2D d){
        x = d.x;
        y = d.y;
    }

    public Point2D(int n){
        x = y = n;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x = "); x = sc.nextInt();
        System.out.println("Enter y = "); y = sc.nextInt();
    }

    public void show(){
        System.out.println("[" + x + ", " + y + "]");
    }
    public void set(int x1, int y1){
        x = x1;
        y = y1;
    }
    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }
    public float dist(){
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public float dist(Point2D B){
        return (float) Math.sqrt(Math.pow(x - B.x, 2) + Math.pow(y - B.y, 2));
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

