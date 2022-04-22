package lab5;

import lab3.StudentNode;

import java.util.Scanner;

public class InvoiceManager {
    private Invoice head;
    private long[] month = new long[12];

    public InvoiceManager() {
        head = new Invoice();
        for (int i = 0; i < 12; i++) {
            month[i] = 0;
        }
        head.next = null;
    }

    public void appendToTail(Invoice v) {
        Invoice end = new Invoice(v);
        month[end.getDateCreated().getM() - 1] += end.getFinal_price();
        Invoice n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public void output() {
        Invoice curr = head;
        if (curr.next == null)
            System.out.println("Empty list!");
        else
            while (curr.next != null) {
                curr.next.output();
                curr = curr.next;
            }
    }

//    public void monthlyRevenue() {
//        Invoice n = head;
//        while (n.next != null) {
//            month[n.next.getDateCreated().getM() - 1] += n.next.getFinal_price();
//            n = n.next;
//        }
//    }

    public long getMonthlyRevenue() {
        Scanner sc = new Scanner(System.in);
        int mon;

        System.out.print("Enter month you want to view revenue: ");
        mon = sc.nextInt();

        return month[mon - 1];
    }

    public void getMonthlyProductRevenue(){
        Scanner sc = new Scanner(System.in);
        String productName = new String();
        int mon;

        System.out.print("Enter product name: ");
        productName = sc.nextLine();
        productName = productName.trim();
        System.out.print("Enter month: ");
        mon = sc.nextInt();

        Invoice n = head;
        long totalProductRevenue = 0;
        while( n.next != null){
            for(int i = 0; i < n.next.getNop(); ++i){
                if(n.next.getProduct(i).getName().equals(productName) && n.next.getDateCreated().getM() == mon){
                    totalProductRevenue += n.next.getProductPrice(i);
                }
            }
            n = n.next;
        }

        System.out.println("Product name: " + productName + " revenue: " + totalProductRevenue + " in month: " + mon);
    }

    public void findInvoice(){
        Scanner sc = new Scanner(System.in);
        String customerName = new String();
        String customerID = new String();

        System.out.print("Enter customer name: "); customerName = sc.nextLine();
        customerName = customerName.trim();
        System.out.print("Enter customer ID: "); customerID = sc.nextLine();
        customerID = customerID.trim();

        Invoice n = head;
        while(n.next != null){
            if(n.next.getCheckVIP())
                if(customerName.equals(n.next.getVIP().getName())
                        && customerID.equals(n.next.getVIP().getId())){
                    n.next.output();
                }
            else
                if(customerName.equals(n.next.getCustomer().getName())
                        && customerID.equals(n.next.getCustomer().getId())){
                    n.next.output();
                }
            n = n.next;
        }
    }

    public static void main(String[] args) {
        InvoiceManager i = new InvoiceManager();
        Invoice v;
        Scanner sc = new Scanner(System.in);
        boolean bl = true;

        while (bl) {
            System.out.println("=== Choose 1 option ===");
            System.out.println("(1) -- Add invoice");
            System.out.println("(2) -- View monthly revenue");
            System.out.println("(3) -- Show product monthly revenue");
            System.out.println("(4) -- Show all invoices");
            System.out.println("(5) -- Exit");
            int option;
            option = sc.nextInt();
            switch (option) {
                case 1:
                    v = new Invoice();
                    v.input();
                    i.appendToTail(v);
                    break;
                case 2:
                    long revenue = i.getMonthlyRevenue();
                    System.out.println("Doanh thu thang: " + revenue);
                    break;
                case 3:
                    i.getMonthlyProductRevenue();
                    break;
                case 4:
                    i.output();
                    break;
                case 5:
                    i.findInvoice();
                    break;
                default:
                    bl = false;
            }
        }
    }
}