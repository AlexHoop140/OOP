package lab4;

import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
//        Animal a = new Animal() // sai, không tạo đối tượng từ lớp trừu tượng
        Animal a = new Cat(); // Cha tham chiếu con  được
        a.input(); // Animal
        a.show(); // Animal
        a.sound(); // “meo meo”
        a = new Dog(); // một tham chiếu cha có thể tham chiếu đến nhiều đối tượng của con
        a.input(); // Animal
        a.show(); // Animal
        a.sound(); //” gau gau”

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of animal: ");
        int n = sc.nextInt();
        Animal list[] = new Animal[n]; // Tạo ra một mảng tham chiếu
        int c = 0;
        for(int i = 0; i < n; i++){
            System.out.println("Enter animal " + (i+1) + ": ");
            System.out.println("Please choose (0):cat, (1): dog, (2):Goat ");
            c = sc.nextInt();
            if(c == 0) list[i] = new Cat();
            else if(c == 1) list[i] = new Dog();
            else list[i] = new Goat();
            list[i].input();
        }
        for(Animal s: list){
            s.show();
            s.sound();
        }
        Animal chicken = new Chicken();
        System.out.println("Enter chicken info: ");
        chicken.input();
        chicken.show();
        chicken.sound();
    }

}
