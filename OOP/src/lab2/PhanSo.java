package lab2;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(){
        tuSo = 0;
        mauSo = 1;
    }

    public PhanSo(int tu, int mau){
        tuSo = tu;
        mauSo = mau;
    }

    public void nhapGiaTri(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        tuSo = sc.nextInt();
        System.out.print("Nhap mau so: ");
        int mau = sc.nextInt();
        while(mau == 0){
            System.out.print("Nhap lai mau: ");
            mau = sc.nextInt();
        }
        mauSo = mau;
    }

    public void inGiaTri(){
        if(tuSo == 0){
            System.out.println("Phan so = " + 0);
        } else if(mauSo == 1){
            System.out.println("Phan so = " + tuSo);
        } else if(mauSo < 0){
            System.out.println("Phan so = " + -tuSo + "/" + -mauSo);
        } else{
            System.out.println("Phan so = " + tuSo + "/" + mauSo);
        }
    }

    public void nghichDao(){
        int tempTu = tuSo;
        int tempMau = mauSo;
        if(tempTu == 0){
            System.out.println("Phan so khong hop le! Mau so = 0");
            System.out.println("Gan lai mau so = 1");
            mauSo = 1;
        }else{
            mauSo = tempTu;
        }
        tuSo = tempMau;
    }

    public PhanSo giaTriNghichDao(){
        PhanSo nghichDao = new PhanSo();
        if(tuSo == 0){
            System.out.println("Phan so khong hop le! Mau so = 0");
            System.out.println("Gan lai mau so = 1");
            nghichDao = new PhanSo(mauSo, 1);
        }else nghichDao = new PhanSo(mauSo, tuSo);
        return nghichDao;
    }

    public double giaTriThucPhanSo(){
        return (double) tuSo/mauSo;
    }

    public boolean lonHon(PhanSo a){
        return (tuSo/mauSo) > (a.tuSo/a.mauSo);
    }

    public PhanSo cong(PhanSo a){
        PhanSo b;
        b = new PhanSo();
        b.tuSo = tuSo*a.mauSo + mauSo*a.tuSo;
        b.mauSo = mauSo*a.mauSo;

        return b;
    }

    public PhanSo tru(PhanSo a){
        PhanSo b;
        b = new PhanSo();
        b.tuSo = tuSo*a.mauSo - mauSo*a.tuSo;
        b.mauSo = mauSo*a.mauSo;

        return b;
    }

    public PhanSo nhan(PhanSo a){
        PhanSo b;
        b = new PhanSo();
        b.tuSo = tuSo*a.tuSo;
        b.mauSo = mauSo*a.mauSo;

        return b;
    }

    public PhanSo chia(PhanSo a){
        PhanSo b;
        b = new PhanSo();
        b.tuSo = tuSo*a.mauSo;
        b.mauSo = mauSo*a.tuSo;

        return b;
    }
}
