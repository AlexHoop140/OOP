package lab3;
import lab2.Date;

import java.util.Scanner;

public class Student {
    private String id, name;
    private Date bd;
    private int n;
    private String[] course, mark;

    public Student(){
        id = new String();
        name = new String();
        bd = new Date();
        n = 0;
        course = new String[100];
        mark = new String[100];
    }
    public Student(int m){
        id = new String();
        name = new String();
        bd = new Date();
        n = 0;
        course = new String[m];
        mark = new String[m];
    }

    public Student(Student s){
        id = new String(s.id);
        name = new String(s.name);
        bd = new Date(s.bd);
        n = s.n;
        course = new String[s.course.length];
        mark = new String[s.course.length];

        for (int i = 0; i < n; i++) {
            course[i] = new String(s.course[i]);
            mark[i] = new String(s.mark[i]);
        }
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: "); id = sc.nextLine();
        System.out.print("Enter name: "); name = sc.nextLine();
        System.out.print("Enter bd: \n"); bd.input();
        System.out.print("Enter number of course: "); n = sc.nextInt();
        sc.nextLine(); //xoa bo nho dem

        for (int i = 0; i < n; i++) {
            System.out.print("Enter course " + (i+1) + ": ");
            course[i] = sc.nextLine();
            System.out.print("Enter mark " + (i+1) + ": ");
            mark[i] = sc.nextLine();
        }
    }

    public void show(){
        System.out.print("[" + id + "," + name + "," + bd + ",");
        for (int i = 0; i < n; i++) {
            System.out.print(course[i] + ": " + mark[i] + ", ");
        }
        System.out.println("]");
    }

    public String toString(){
        String s = ("[" + id + "," + name + "," + bd + ",");
        for (int i = 0; i < n; i++) {
            s += (course[i] + ": " + mark[i] + ", ");
        }
        s += ("]");
        return s;
    }

    public double avg(){
        double a = 0.0f;
        for (int i = 0; i < n; i++) {
            switch (mark[i]) {
                case "A":
                    a += 4.0;
                    break;
                case "B+":
                    a += 3.5;
                    break;
                case "B":
                    a += 3;
                    break;
                case "C+":
                    a += 2.5;
                    break;
                case "C":
                    a += 2;
                    break;
                case "D+":
                    a += 1.5;
                    break;
                case "D":
                    a += 1;
                    break;
                case "F":
                    a+= 0;
                    break;
            }
        }

        return a/n;
    }

    public void register(String c, String m){
        if(n < course.length){
            course[n] = new String(c);
            mark[n] = new String(m);
            n++;
        }
        else{
            System.out.println("Error: Array is full");
        }
    }

    public void delete(String c){
        int i = 0;
        for (; i < n; i++) {
            if(course[i].equals(c))
                break;
        }
        if (i < n){
            for (int j = i; j < n-1; j++){
                course[j] = course[j+1];
                mark[j] = mark[j+1];
            }
            n--;
        }
    }

    public String getLName(){
        String lname = name.trim();
        int k = name.lastIndexOf(" ");
        return lname.substring(k+1);
    }

    public String getName(){
        return name;
    }

    public Date getBd() {
        return bd;
    }

    public String getId() {
        return id;
    }

    public String[] getMark() {
        return mark;
    }

    public String getUser(){
        return "";
    }

    public String getEmail(){
        return "";
    }
}
