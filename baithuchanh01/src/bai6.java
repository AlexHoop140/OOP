import java.util.Scanner;

public class bai6 {
    public static boolean isPrime(int a){
        if(a < 2)
            return false;
        for(int i = 2; i*i < a; i++){
            if(a % i == 0)
                return false;
        }
    return true;
}

    public static void toBinary(int decimal) {
        int binary[] = new int[40];
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(isPrime(a)){
            System.out.println("a la snt");
            toBinary(a);
        }
        else{
            System.out.println("a khum la snt");
            toBinary(a);
        }

    }
}
