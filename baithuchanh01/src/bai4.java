import java.util.Scanner;

public class bai4 {
    public static void main(String[] args){
        String a = "";
        String b = "";

        Scanner sc = new Scanner(System.in);

        int temp1 = 0;
        int temp2 = 0;
        boolean bError = true;
        do {
            a = sc.nextLine();
//            b = sc.nextLine();
            try{
                temp1 = Integer.parseInt(a);
//                temp2 = Integer.parseInt(b);
                bError = false;
            } catch(NumberFormatException e){
                System.out.println("You did not enter an integer, please enter again");
            }
        }while(bError);
        bError = true;
        do {
            b = sc.nextLine();
            try{
                temp2 = Integer.parseInt(b);
                bError = false;
            } catch(NumberFormatException e){
                System.out.println("You did not enter an integer, please enter again");
            }
        }while(bError);

        int temp3 = temp1 + temp2;
        System.out.println("a + b = " + temp3);
    }
}
