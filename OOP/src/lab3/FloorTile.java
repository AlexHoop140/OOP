package lab3;

import java.util.Scanner;

public class FloorTile {
    private String id;
    private String color;
    private int quantity;
    private int length;
    private int width;
    private long price;

    public FloorTile(){
        id = new String();
        color = new String();
        quantity = 0;
        length = 0;
        width = 0;
        price = 0;
    }

    public FloorTile(FloorTile t){
        id = t.id;
        color = t.color;
        quantity = t.quantity;
        length = t.length;
        width = t.width;
        price = t.price;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: "); id = sc.nextLine();
        System.out.print("Enter color: "); color = sc.nextLine();
        System.out.print("Enter quantity: "); quantity = sc.nextInt();
        System.out.print("Enter length: "); length = sc.nextInt();
        System.out.print("Enter width: "); width = sc.nextInt();
        System.out.print("Enter price: "); price = sc.nextLong();
        sc.nextLine();
    }

    public void show(){
        System.out.println("Enter id: " + id);
        System.out.println("Enter color: " + color);
        System.out.println("Enter quantity: " + quantity);
        System.out.println("Enter length: " + length);
        System.out.println("Enter width: " + width);
        System.out.println("Enter price: " + price);
    }

    public float retailPrice(){
        float retail = 0.0f;
        return retail = price + (float)(price*20/100);
    }

    public int maxFloorArea(){
        return quantity*(length*width);
    }

    public int numberOfBoxNeeded(int D, int N){
        return Math.round((float)((D*N)/maxFloorArea()));
    }

    public String toString(){
        return "[" + id + ", " + color + ", " + quantity + ", " + length + "cm, " + ", " + width + "cm, " + price + "]";
    }

    public long getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }
}
