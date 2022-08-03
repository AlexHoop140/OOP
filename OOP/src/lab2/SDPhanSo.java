package lab2;

import java.util.Scanner;

public class SDPhanSo {
    public static void sapxep(PhanSo[] arr, int n)
    {
        for (int i = 1; i < n; ++i) {
            PhanSo key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].giaTriThucPhanSo() > key.giaTriThucPhanSo()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        PhanSo a = new PhanSo(3, 7);
        PhanSo b = new PhanSo(4, 9);
        a.inGiaTri();
        b.inGiaTri();

        PhanSo x = new PhanSo();
        PhanSo y = new PhanSo();

        System.out.println("Nhap phan so x");
        x.nhapGiaTri();

        System.out.println("Nhap phan so y");
        y.nhapGiaTri();

        System.out.println("Nghich dao cua x");
        x = x.giaTriNghichDao();
        x.inGiaTri();

        x = x.cong(y);
        System.out.println("Tong x + y");
        x.inGiaTri();

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n: ");
        n = sc.nextInt();
        PhanSo []ds = new PhanSo[n];
        for(int i = 0; i < n; i++){
           ds[i] = new PhanSo();
        }

        PhanSo tong = new PhanSo();
        PhanSo max = new PhanSo(-9999, 9999);
        for (int i = 0; i < n; i++) {
            ds[i].nhapGiaTri();
            tong = tong.cong(ds[i]);
            if(max.giaTriThucPhanSo() < ds[i].giaTriThucPhanSo())
                max = ds[i];
        }

        for (int i = 0; i < n; i++) {
            ds[i].inGiaTri();
        }

        System.out.println("Tong cua danh sach: ");
        tong.inGiaTri();
        System.out.println("Phan so lon nhat cua danh sach: ");
        max.inGiaTri();

        System.out.println("Danh sach phan so da sap xep: ");
        sapxep(ds, n);
        for (int i = 0; i < n; i++) {
            ds[i].inGiaTri();
        }
    }
}
