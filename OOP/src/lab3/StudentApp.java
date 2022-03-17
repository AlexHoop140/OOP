package lab3;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
//        Student a = new Student();
//        System.out.println("Enter info a: ");
//        a.input();
//        a.register("OOP", "F");
//        System.out.println("Info for a: "+ a);
//
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: "); n = sc.nextInt();
        Student[] list = new Student[n];
        for (int i = 0; i < n; i++){
            list[i] = new Student();
            list[i].input();
        }
        for (int i = 0; i < n; i++){
            list[i].show();
        }

        //Danh sach sv bi canh bao hoc vu
        for (Student s: list) {
            if(s.avg() < 1)
                s.show();
        }

        //Tim kiem sinh vien
        sc.nextLine();
        String name = new String();
        System.out.print("Enter name: "); name = sc.nextLine();
        for (Student s: list) {
            if(s.getName().equals(name)){
                s.show();
                break;
            }
        }

        //Tim sv diem tb cao nhat
        Student maxavg = new Student(list[0]);
        for (Student s: list) {
            if(maxavg.avg() < s.avg())
                maxavg = new Student(s);
        }
        System.out.println("Student with highest avg: \n" + maxavg);

        //Hien thi sinh vien theo thu tu alphabet cua ten
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (list[j].getLName().compareTo(list[j+1].getLName()) > 0){
                    Student temp = new Student(list[j]);
                    list[j] = new Student(list[j+1]);
                    list[j+1] = new Student(temp);
                }
            }
        }
        System.out.println("List of students in alphabetical order");
        for (int i = 0; i < n; i++){
            list[i].show();
        }

    }
}
