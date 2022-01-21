package lab1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class bai5 {
    public static void phuongtrinhbac1(float a, float b){
        float res = 0;
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh co vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{
            res = -b/a;
            System.out.println("Phuong trinh co nghiem " + res);
        }
    }

    public static void phuongtrinhbac2(float a, float b, float c){
        float res = 0;
        if(a == 0)
            if(b == 0)
                if(c == 0)
                    System.out.println("Phuong trinh co vo so nghiem");
                else // c != 0
                    System.out.println("Phuong trinh vo nghiem");
            else // b != 0
                phuongtrinhbac1(b, c);
        else{
            float delta = b*b - 4*a*c;
            if (delta == 0)
                System.out.println("Phuong trinh co nghiem kep" + -b/(a*2));
            else
                if(delta < 0)
                    System.out.println("Phuong trinh vo nghiem");
                else{
                    float x1 = (float) ((-b-sqrt(delta))/(2*a));
                    float x2 = (float) ((-b+sqrt(delta))/(2*a));
                    System.out.println("Phuong trinh co 2 nghiem " + x1 + " " + x2);
                }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        phuongtrinhbac2(a, b, c);

    }
}
