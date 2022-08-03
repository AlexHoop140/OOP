package lab3;

import java.util.Scanner;

public class FloorTileApp {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of type: ");
        n = sc.nextInt();
        FloorTile[] list = new FloorTile[n];
        for (int i = 0; i < n; i++) {
            list[i] = new FloorTile();
            list[i].input();
        }

        System.out.println("List of floor tile");
        for (int i = 0; i < n; i++) {
            list[i].show();
        }

        //Chi phi thap nhat
        float minPA = 9999.9f;
        FloorTile min = new FloorTile();
        for (int i = 0; i < n; i++) {
            if((float)list[i].getPrice()/list[i].maxFloorArea() < minPA){
                min = new FloorTile(list[i]);
                minPA = (float) min.getPrice()/min.maxFloorArea();
            }
        }
        System.out.println("floor tile type which have the lowest cost: ");
        min.show();

        //Chi phi lot 5*20m cho tung loai gach trong danh sach
        for (int i = 0; i < n; i++) {
            long l = list[i].numberOfBoxNeeded(20 * 100, 5 * 100) * list[i].getPrice();
            System.out.println("Floor tile id: " + list[i].getId() + ", Cost: " + l);
        }
    }
}

