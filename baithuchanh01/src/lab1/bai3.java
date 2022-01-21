package lab1;

public class bai3 {
    public static void main(String[] args) {
        double max = -9999;
        double sum = 0;
        double temp = 0;
        for (String arg : args) {
            try {
                temp = Float.parseFloat(arg);
            } catch (NumberFormatException e) {
                temp = 0f;
                System.out.println(e.getMessage());
            }
            sum += temp;
            if (max < temp) {
                max = temp;
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Sum = " + sum);
    }
}
