package lab5;

import java.util.Scanner;

public class Customer {
    private String id;
    private String name;
    private String address;

    public Customer(){
        id = new String();
        name = new String();
        address = new String();
    }

    public Customer(Customer c){
        id = c.id;
        name = c.name;
        address = c.address;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer id: "); id = sc.nextLine();
        System.out.print("Enter customer name: "); name = sc.nextLine();
        System.out.print("Enter customer address: "); address = sc.nextLine();
    }

    public void output(){
        System.out.println("=== Customer Infomation ===");
        System.out.println("Customer id: " + id);
        System.out.println("Customer name: " + name);
        System.out.println("Customer address: " + address);
    }

    public String toString(){
        return "Customer id: " + id + "; " + "name: " + name + "; " + "address: " + address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSaleRate(){
        return 0;
    }
}
