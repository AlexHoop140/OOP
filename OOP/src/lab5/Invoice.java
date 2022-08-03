package lab5;

import lab2.Date;
import lab3.StudentNode;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice{
    private String id;
    private String title;
    private int nop;
    long final_price = 0;
    protected String option;
    private Customer c;
    private VIP v;
    private boolean checkVIP;
    private Date dateCreated;
    private ArrayList<Product> product;
    public Invoice next;

    public Invoice(){
        Scanner sc = new Scanner(System.in);
        id = new String();
        title = new String();
        dateCreated = new Date();
        checkVIP = false;
        c = new Customer();
        v = new VIP();
        product = new ArrayList<Product>();
        next = null;
    }

    public Invoice(Invoice i){
        id = i.id;
        title = i.title;
        dateCreated = i.dateCreated;
        option = i.option;
        checkVIP = i.checkVIP;
        c = new Customer(i.c);
        v = new VIP(i.v);
        nop = i.nop;
        product = new ArrayList<Product>(i.product);
        next = null;
    }

    public void isCheckVIP() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Is this customer a VIP? Y/N ");
        option = sc.nextLine();
        if (option.equals("Y")){
            this.checkVIP = true;
        }else{
            this.checkVIP = false;
        }
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter invoice id: "); id = sc.nextLine();
        id = id.trim();
        System.out.print("Enter invoice title: "); title = sc.nextLine();
        System.out.println("Enter invoice create date: "); dateCreated.input();
        System.out.println("Enter customer info: ");
        isCheckVIP();
        if(checkVIP){
            v.input();
        }else
            c.input();
        System.out.println("Enter number of product: "); nop = sc.nextInt();
        for (int i = 0; i < nop; i++) {
            Product t = new Product();
            t.input();
            product.add(t);
        }
    }

    public void output() {
        System.out.println("=== " + title + "=== ");
        System.out.println("Invoice id: " + id);
        System.out.print("Create date: "); dateCreated.show();
        System.out.println("Customer info: ");
        if(this.checkVIP)
            v.output();
        else
            c.output();
        long total_items = 0;
        long total_price = 0;

        System.out.println("###################");
        for (int i = 0; i < nop; i++) {
            total_items += product.get(i).getDetail().getAmount();
            total_price += product.get(i).getDetail().getPrice() * product.get(i).getDetail().getAmount();
            System.out.println("-------------");
            product.get(i).show();
        }
        System.out.println("Total items: " + total_items);
        System.out.println("Total price: " + total_price);
        if(this.checkVIP){
            final_price = (long) ((total_price) - total_price * v.getSaleRate()/100);
        }else
            final_price = (long) ((total_price) - total_price * c.getSaleRate()/100);
        System.out.println("Final price: " + final_price);
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public Product getProduct(int i) {
        return product.get(i);
    }

    public int getNop() {
        return nop;
    }

    public Customer getCustomer() {
        return c;
    }

    public VIP getVIP(){
        return v;
    }

    public boolean getCheckVIP(){
        return this.checkVIP;
    }

    public long getProductPrice(int i){
        return getProduct(i).getDetail().getPrice();
    }

    public long getFinal_price() {
        long total_items = 0;
        long total_price = 0;
        for (int i = 0; i < nop; i++) {
            total_items += product.get(i).getDetail().getAmount();
            total_price += product.get(i).getDetail().getPrice() * product.get(i).getDetail().getAmount();

        }
        if(this.checkVIP){
            final_price = (long) ((total_price) - total_price * v.getSaleRate()/100);
        }else
            final_price = (long) ((total_price) - total_price * c.getSaleRate()/100);
        return final_price;
    }
}
