package lab4;

import lab2.Point2D;

import java.util.Scanner;

public class PointC extends Point2D {
    private String color;

    public PointC (){
        super(); // hàm xây dựng đặc biệt của java để gọi hàm xây dựng của lớp cha.
        color = new String();
    }

    public PointC (int x1, int y1, String color1){
        super(x1, y1);
        color = new String(color1);
    }

    public PointC (PointC pc){
        super((Point2D) pc); //ép kiểu qua Point2D
        color = new String(pc.color);
    }

    public void show(){
        super.show(); // tham chiếu tới phương thức show() của cha
        System.out.println(", with color: " + color);
    }

    public void input() {
		super.input(); //Point2D
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color: "); color = sc.nextLine();
    }

    public void setColor(String c1){
        color = new String(c1);
    }

    public String getColor(){
        return color;
    }

}

