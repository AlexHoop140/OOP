package lab4;

import lab3.Student;

import java.util.Scanner;

public class StudentITApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student a = new Student();
        System.out.println("Enter info student A: ");
        a.input(); // Student
        a.show(); // Student
        a = new StudentIT(); // một tham chiếu cha có thể tham chiếu đến nhiều đối tượng của con
        a.input(); // StudentIT
        a.show(); // StudentIT

        StudentIT b = new StudentIT();
        System.out.println("Enter info student IT B: ");
        b.input();
        String newpass = new String();
        newpass = sc.nextLine();
        b.changePassword(newpass);
        System.out.println("New password: " + b.getPassword());
        b.show();

        System.out.println("Enter number of student: ");
        int n = sc.nextInt();
        Student list[] = new Student[n]; // Tạo ra một mảng tham chiếu
        int c = 0;
        for(int i = 0; i < n; i++){
            System.out.println("Enter student " + (i+1) + ": ");
            System.out.println("Please choose (0):student, (1): studentIT: ");
            c = sc.nextInt();
            if(c == 0) list[i] = new Student();
            else list[i] = new StudentIT();
            list[i].input();
        }

        for(Student s: list){
            s.show();
        }

        sc.nextLine();
        System.out.println("Enter email for search: ");
        String email = sc.nextLine();
        for(Student s: list){
            if(s.getEmail().equals(email)){
                System.out.println("user: " + s.getUser());
                s.show();
                //sai vì ở Student không có getUser getEmail
                //Mở lại lớp Student nạp đè khai báo thêm 2 hàm getUser getEmail return “”
            }
        }
    }
}
