package lab4;

import java.util.Scanner;

public abstract class Animal {
    private String genus, color;
    private float weight;

    public abstract void sound();

    public Animal(){
        genus = new String();
        color = new String();
        weight = 0.0f;
    }
    public Animal(String g, String c, float w){
        genus = new String(g);
        color = new String(c);
        weight = w;
    }
    public Animal(Animal a){
        genus = new String(a.genus);
        color = new String(a.color);
        weight = a.weight;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter genus: "); genus = sc.nextLine();
        System.out.println("Enter color: "); color = sc.nextLine();
        System.out.println("Enter weight:"); weight = sc.nextFloat();
    }
    public void show(){
        System.out.println("[" + genus + ", " + color + ", " + weight + "]");
    }
    public String toString(){
        return "[" + genus + ", " + color + ", " + weight + "]";
    }
}
