package lab5;

import java.util.Scanner;

public class VIP extends Customer{
    private float saleRate;

    public VIP(){
        super();
        saleRate = 0.0f;
    }

    public VIP(VIP v){
        super(v);
        saleRate = v.saleRate;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sale rate: "); saleRate = sc.nextFloat();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Customer sale rate: " + saleRate);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public float getSaleRate() {
        return saleRate;
    }
}
