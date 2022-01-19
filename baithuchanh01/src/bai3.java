public class bai3 {
    public static void main(String[] args) {
        float max = -9999f;
        float sum = 0f;
        float temp = 0f;
        for (int i = 0; i < args.length; i++) {
            try{
                temp = Float.parseFloat(args[i]);
            }catch (NumberFormatException e){
                temp = 0f;
            }
            sum += temp;
            if(max < temp){
                max = temp;
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Sum = " + sum);
    }
}
