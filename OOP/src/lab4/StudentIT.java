package lab4;

import lab3.Student;

import java.util.Scanner;

public class StudentIT extends Student {
    private String username, password, email;
    public StudentIT(){
        super();
        username = new String();
        password = new String();
        email = new String();
    }
    public StudentIT(StudentIT s){
        super(s);
        username = s.username;
        password = s.password;
        email = s.email;
    }
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: "); username = sc.nextLine();
        System.out.println("Enter password: "); password = sc.nextLine();
        System.out.println("Enter email: "); email = sc.nextLine();
    }
    public void show(){
        super.show();
        System.out.println("Username " + username + ", " + "email: " + email);
    }
    public String toString(){
        return super.toString() + "Username " + username + ", " + "email " + email;
    }
    public void changePassword(String newpass){
        password = newpass;
    }
    public String getPassword(){
        return password;
    }
    public String getUser(){
        return username;
    }
    public String getEmail(){
        return email;
    }
}
