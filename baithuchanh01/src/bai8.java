import java.util.Arrays;
import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n  = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();
        int cnt = 0;
        for (int i = 0; i < array.length; i++) {
            if(x == array[i])
                cnt++;
        }

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Số lần xuất hiện của " + x + " là " + cnt);
    }
}
