import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        String hoTen = "";
        Scanner sc = new Scanner(System.in);

        hoTen = sc.nextLine();

//        System.out.println(hoTen);
        System.out.println(tachTen(hoTen));
    }

    private static String tachTen(String hoTen) {
//        int i = hoTen.length()-1;
//        String ten = "";
//        while(i >= 0 && hoTen.charAt(i) != ' '){
//            ten = ten + hoTen.charAt(i);
//            i--;
//        }
        int idx = hoTen.lastIndexOf(' ');
        if(idx == -1)
            throw new IllegalArgumentException("Only a single name " + hoTen);
        String ten = hoTen.substring(idx + 1);
        return ten;
    }
}
