package lab5;

import java.util.Scanner;

public class Detail {
    private long price = 0;
    private long amount = 0;
    Scanner sc = new Scanner(System.in);

    public void input(){
        System.out.print("Enter price: "); price = sc.nextLong();
        System.out.print("Enter amount: "); amount = sc.nextLong();
    };

    public void output(){
        System.out.println("Price: " + price);
        System.out.println("Amount: " + amount);
    };

    public long getPrice() {
        return price;
    }

    public long getAmount() {
        return amount;
    }

    public String toString(){
        return "Price: " + price +"; Amount: " + amount;
    }
}
