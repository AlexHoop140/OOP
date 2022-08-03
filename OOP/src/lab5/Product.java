package lab5;

import java.util.Scanner;

public class Product{
    private String pid;
    private String name;
    private Detail detail;

    public Product(){
        pid = new String();
        name = new String();
        detail = new Detail();
    }

    public Product(Product p){
        pid = p.pid;
        name = p.name;
        detail = p.detail;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product id: "); pid = sc.nextLine();
        System.out.print("Enter product name: "); name = sc.nextLine();
        detail.input();
    }

    public void show(){
        System.out.println("Product id: " + pid);
        System.out.println("Product name: " + name);
        detail.output();
    }

    public Detail getDetail() {
        return detail;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "Product id: " + pid + "; product name: " + name + "Detail: " + detail;
    }
}
