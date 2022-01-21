package lab1;

import java.util.Scanner;

public class GetNameFromFullName {
    public static void main(String[] args) {
        String fullName = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        fullName = sc.nextLine();

        GetNameFromFullName myObj = new GetNameFromFullName();

        if(!myObj.getName(fullName).isEmpty())
            System.out.println(myObj.getName(fullName));
    }

    public String getName(String fullName) {
        int idx = fullName.lastIndexOf(' ');
        if(idx == -1){
            System.out.println("You just entered a single name: " + fullName);
            return "";
        }
        return fullName.substring(idx + 1);
    }
}
