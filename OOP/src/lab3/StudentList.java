package lab3;

import lab2.LinkedList;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StudentList {
    private StudentNode head;
    private StudentNode curr = new StudentNode();

    public StudentList(){
        head = new StudentNode();
        head.next = null;
    }

    public void insert(Student s){
        head.appendToTail(s);
    }

    public void delete(Student s){
        head = head.deleteNode(head, s);
    }

    public void show(){
        head.print();
    }

    public void sort(){
        head = head.mergeSort(head);
    }

    public void findAcademicWarningStudents(StudentList AWSL){
        StudentNode curr = this.head;
        while(curr.next != null){
            if(curr.next.getData().avg() < 2.0){
                AWSL.insert(curr.next.getData());
                curr = curr.next;
            }
            else
                curr = curr.next;
        }
    }

    public void findHighestAVGStudents(StudentList bestStudentsList){
        StudentNode curr = this.head;
        double max = -99.9;
        while (curr.next != null){
            if(curr.next.getData().avg() > max){
                max = curr.next.getData().avg();
            }
            curr = curr.next;
        }
        curr = this.head;
        while (curr.next != null){
            if(curr.next.getData().avg() == max){
                bestStudentsList.insert(curr.getData());
            }
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        StudentList list = new StudentList();
        StudentList AWStudentsList = new StudentList();
        StudentList bestStudentsList = new StudentList();
        Scanner sc = new Scanner(System.in);

        boolean bl = true;
        while(bl){
            System.out.println("1. Enter student info");
            System.out.println("2. Student has avg < 1");
            System.out.println("3. Highest avg student");
            System.out.println("4. Student list in alphabetical order");
            System.out.println("4. Show list of student");
            System.out.println("6. Exit");
            System.out.print("Enter option: ");
            int option = sc.nextInt();
//            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter student info: ");
                    Student s = new Student();
                    s.input();
                    list.insert(s);
                    break;
                case 2:
                    System.out.println("List of academic warning students (avg < 2)");
                    list.findAcademicWarningStudents(AWStudentsList);
                    AWStudentsList.show();
                    break;
                case 3:
                    System.out.println("Student has highest avg");
                    list.findHighestAVGStudents(bestStudentsList);
                    bestStudentsList.show();
                    break;
                case 4:
                    System.out.println("4. Student list in alphabetical order");
                    list.sort();
                    list.show();
                    break;
                case 5:
                    System.out.println("List of student");
                    list.show();
                default:
                    bl = false;
            }
        }


    }
}
