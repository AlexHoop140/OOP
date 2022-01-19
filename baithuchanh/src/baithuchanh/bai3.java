package baithuchanh;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
//		int number;
//		Scanner sc = new Scanner(System.in);
//		number = Integer.parseInt(sc.nextLine());
//		number = sc.nextInt();
//		System.out.println(number);
		
		float sum = 0;
		float max = -99999;
		for(int i = 0; i < args.length; i++) {
			float temp;
			try {
				temp = Float.parseFloat(args[i]);
			}catch(NumberFormatException e) {
				temp = 0;
				System.out.println("Error nhap sai cmnr!");
			}
			sum += temp;
			if(max < temp)
				max = temp;
		}
		
		System.out.println("Sum = " + sum);
		System.out.println("Max = " + max);
		
	}
}
